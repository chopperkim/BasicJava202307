package chapter19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocket {
    ChatServer chatServer;
    Socket socket;
    DataInputStream inputStream;
    DataOutputStream outputStream;
    String clientIp;
    String chatName;

    public ClientSocket(ChatServer chatServer, Socket socket) {
        try {
            this.chatServer = chatServer;
            this.socket = socket;
            this.inputStream = new DataInputStream(socket.getInputStream());
            this.outputStream = new DataOutputStream(socket.getOutputStream());
            InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = address.getHostString();
            receive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void receive() {
        chatServer.threadPool.execute(() -> {
            try {
                while (true) {
                    String message = inputStream.readUTF();
                    System.out.println(message);

                    if (message.startsWith("!!")) {
                        this.chatName = message.replace("!!", "");
                        chatServer.sendToAll(this, chatName + "님이 들어오셨습니다.");
                        chatServer.addSocketClient(this);
                    } else {
                        chatServer.sendToAll(this, message);
                    }
                }
            } catch (Exception e) {
//                chatServer.sendToAll(this, "나가셨습니다.");
                chatServer.removeSocketClient(this);
            }
        });
    }

    public void send(String message) {
        try {
            outputStream.writeUTF(message);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
