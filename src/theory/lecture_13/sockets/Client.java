package theory.lecture_13.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

    @Override
    public void run() {
        while (true) {
            try (
                    Socket clientSocket = new Socket("127.0.0.1", 230);
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream()));
            ) {
                String fromServer;
                while ((fromServer = in.readLine()) != null) {
                    System.out.println("message from server: " + fromServer);
                }

            } catch (IOException e) {

            }
        }
    }
}
