import java.rmi.*;

public interface Calc extends Remote {
    int multiply(int a, int b) throws RemoteException;
}