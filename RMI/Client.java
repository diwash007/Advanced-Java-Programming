import java.rmi.*;
import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) {
        try {
            Registry rgsty = LocateRegistry.getRegistry(9000);
            Calc obj = (Calc) rgsty.lookup("multiply");
            
            int value = obj.multiply(6,5);
            System.out.println(value);
        }
        catch(Exception e) {
            System.out.println("Failed to connect to server" + e);
        }
    }
}