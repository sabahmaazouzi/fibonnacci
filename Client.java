package fibonnacci;

import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
try {
			
			
			Proxy suit=(Proxy)Naming.lookup("rmi://localhost:1090/suite");
			System.out.println("valeur  :"+suit.fib(6));
            // banque.retrait(50, 0);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
