import java.rmi.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) {
        try {
            CalcRemote obj = new CalcRemote();
            Registry rgsty = LocateRegistry.createRegistry(9000);
            rgsty.rebind("multiply", obj);
            System.out.println("Server ready");
        }
        catch(Exception e) {
            System.out.println("Server failed" + e);
        }
    }
}