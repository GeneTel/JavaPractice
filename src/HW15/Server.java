package HW15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Server {
        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(8081);
                System.out.println("Server started. Waiting for Connection...");

                Socket clientSocket = serverSocket.accept();
                System.out.println("Client Connected");

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);


                String clientGreeting = in.readLine();

                System.out.println("Client Greeting: " + clientGreeting);

                if (containsRussianLetters(clientGreeting)) {
                    out.println("Що таке паляниця?");


                    String clientAnswer = in.readLine();


                    if (clientAnswer.equalsIgnoreCase("хліб")) {
                        LocalDateTime currentTime = LocalDateTime.now();
                        out.println("Current Date and Time: " + currentTime);
                        System.out.println("Current Date and Time sent to Client: " + currentTime);
                    } else {
                        System.out.println("Incorrect answer. Client disconnected.");
                    }
                } else {
                    out.println("привіт");
                    System.out.println("Привітання надіслано клієнту.");
                }

                clientSocket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static boolean containsRussianLetters(String str) {
            return str.matches(".*[а-яА-Я].*");
        }
    }

