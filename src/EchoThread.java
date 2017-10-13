import java.io.*;
import java.net.Socket;

import static java.lang.System.out;

public class EchoThread extends Thread {
    protected Socket socket;
    private BufferedReader in;
    private PrintWriter out;


    public EchoThread(Socket clientSocket) {
        this.socket = clientSocket;

        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String inputLine, outputLine;

        // Initiate conversation with client
        KnockKnockProtocol kkp = new KnockKnockProtocol();
        outputLine = kkp.processInput(null);
        out.println(outputLine);

        try {
            while ((inputLine = in.readLine()) != null) {
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}