import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) {
        try {
            HelloRemote obj = new HelloRemote();
            Registry rgsty = LocateRegistry.createRegistry(1888);
            rgsty.rebind("hello", obj);
            System.out.println("Server ready");
        }
        catch(Exception e) {
            System.out.println("Server failed" + e);
        }
    }
}