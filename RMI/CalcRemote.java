import java.rmi.*;
import java.rmi.server.*;

public class CalcRemote implements Calc {
    public CalcRemote() throws RemoteException{
        super();
    }
    public int multiply(int a, int b) {
        return(a*b);
    }
}