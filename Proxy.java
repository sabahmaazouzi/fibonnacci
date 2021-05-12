package fibonnacci;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Proxy extends Remote {
	public  int   fib(int n) throws RemoteException ;

}
