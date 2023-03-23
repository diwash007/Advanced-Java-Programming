import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. Open sokcet connection to server
        Socket socket = new Socket("localhost", 6969);

        // 2. Make input and output handle
        Scanner ins = new Scanner(socket.getInputStream());
        PrintWriter outs = new PrintWriter(socket.getOutputStream(), true);

        // 3. Send a message to server
        outs.println(3);

        // 4. Receive a message from server
        int fact = ins.nextInt();

        // 5. Display result from server
        System.out.println("Pathako number: " + 3);
        System.out.println("Factorial from server: " + fact);

        // 6. Close all connections
        ins.close();
        outs.close();
        socket.close();
    }
}