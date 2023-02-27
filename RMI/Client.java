import java.rmi.*;
import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) {
        try {
            Registry rgsty = LocateRegistry.getRegistry(1888);
            Hello obj = (Hello) rgsty.lookup("hello");
            
            String msg = obj.sayHello();
            System.out.println(msg);
        }
        catch(Exception e) {
            System.out.println("Failed to connect to server" + e);
        }
    }
}