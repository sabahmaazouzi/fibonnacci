package fibonnacci;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Suite extends UnicastRemoteObject implements Proxy  {

	public Suite() throws RemoteException {	
		super();			   
		  }

public   int fib(int n)throws RemoteException {
		     if (n <= 1) return n;
		     else return fib(n-1) + fib(n-2);
		  } 
		}
	
