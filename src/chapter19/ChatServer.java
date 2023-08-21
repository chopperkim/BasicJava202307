package chapter19;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
    ServerSocket serverSocket;
    ExecutorService threadPool = Executors.newFixedThreadPool(100);
    Map<String, ClientSocket> chatRoom = Collections.synchronizedMap(new HashMap<>());

    public void start() {
        try {
            serverSocket = new ServerSocket(50001);
            System.out.println("[서버] 시작됨");

            Thread thread = new Thread(() -> {
                while (true) {
                    try {
                        Socket socket = serverSocket.accept();
                        ClientSocket clientSocket = new ClientSocket(this, socket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addSocketClient(ClientSocket clientSocket) {
        String key = clientSocket.chatName + "@" + clientSocket.clientIp;
        chatRoom.put(key, clientSocket);
        System.out.println("입장: " + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }

    public void removeSocketClient(ClientSocket clientSocket) {
        String key = clientSocket.chatName + "@" + clientSocket.clientIp;
        chatRoom.remove(key);
        System.out.println("나감: " + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }

    public void sendToAll(ClientSocket sender, String message) {
        Collection<ClientSocket> clientSockets = chatRoom.values();
        for (ClientSocket clientSocket : clientSockets) {
            if (clientSocket == sender) {
                continue;
            }
            clientSocket.send(message);
        }
    }
    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdownNow();
            chatRoom.values().forEach(ClientSocket::close);
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            ChatServer server = new ChatServer();
            server.start();

            System.out.println("------------------------------------");
            System.out.println("서버를 종료하려면 q를 입력하고 Enter");
            System.out.println("------------------------------------");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String key = scanner.nextLine();
                if (key.equalsIgnoreCase("q")) {
                    break;
                }
            }
            scanner.close();
            server.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
