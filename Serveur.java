package fibonnacci;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Serveur {
	public static void main(String[] args) {
		
		try {
			Suite fib = new Suite();
			
			LocateRegistry.createRegistry(1090);
			Naming.rebind("rmi://localhost:1090/suite", fib);
			System.out.println(" le serveur est pret � recevoir des demandes...");
			
		}catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}
}
