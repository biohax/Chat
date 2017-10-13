package client;

import model.Client;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class KnockKnockServer {
    public static void main(String[] args) throws IOException {

        int portNumber = 4444;


        Socket clientSocket = null;
        ServerSocket serverSocket = new ServerSocket(portNumber);


        List<Client> ul = new ArrayList();

        while (true) {
            clientSocket = serverSocket.accept(); //blocking code
            //TODO request ontvange (welk gesprek)
            String request = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())).readLine();

            String[] splitted = request.split("\\s+");
            if (splitted.length==1){
                System.out.println(request);


                new EchoThread(clientSocket).start();
                //ul.add(new Client(clientSocket.getInetAddress().getHostAddress()));
            }
        }
    }
}