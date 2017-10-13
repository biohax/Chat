import java.net.*;
import java.io.*;

import static java.lang.System.out;

public class KnockKnockServer {
    public static void main(String[] args) throws IOException {

        int portNumber = 4444;


        Socket clientSocket = null;
        ServerSocket serverSocket = new ServerSocket(portNumber);


        while (true) {
            clientSocket = serverSocket.accept(); //blocking code
            new EchoThread(clientSocket).start();
        }
    }
}