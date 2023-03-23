import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    static int fact(int a) {
        if (a == 0) return 1;
        return a * fact(a-1);
    }

    public static void main(String[] args) throws IOException {
        // 1. Create a Server Socket at port 6969
        ServerSocket s = new ServerSocket(6969);

        // 2. Accept client Socket connection
        Socket clientSocket = s.accept();

        // 3. Create input and output handlers
        Scanner ins = new Scanner(clientSocket.getInputStream());
        PrintWriter outs = new PrintWriter(clientSocket.getOutputStream(), true);

        // 4. Receive message from client 
        int num = ins.nextInt();

        // 5. Calculate factorial and send result to client
        outs.println(fact(num));

        // 6. Close all connections
        s.close();
        clientSocket.close();
        ins.close();
        outs.close();
    }
}