import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1. create datagramsocket
        DatagramSocket socket = new DatagramSocket(6969);
        System.out.println("Server is listening...");

        // 2. Receive request from client
        byte[] bytes = new byte[256];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);

        // 3. prepare message for client
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "Hello, Client, K xa khabar?";
        bytes = s.getBytes();

        // 4. send message to client
        packet = new DatagramPacket(bytes, bytes.length, address, port);
        socket.send(packet);

        // 5. close socket
        socket.close();
    }
}