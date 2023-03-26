import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. Create DatagramSocket object
        DatagramSocket socket = new DatagramSocket();

        byte[] bytes = new byte[256];
        InetAddress address = InetAddress.getByName("localhost");

        // 2. Send request to server
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, 6969);
        socket.send(packet);

        // 3. Read response from server
        socket.receive(packet);

        // 4. Display response
        String received = new String(packet.getData());
        System.out.println("server says: " + received);

        // 5. close socket
        socket.close();
    }
}