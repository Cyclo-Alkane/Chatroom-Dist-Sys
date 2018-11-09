import java.rmi.RemoteException;
import java.util.Date;
import java.util.Vector;

public class Consume extends Thread {

	MessageQueue address;

	public Consume(MessageQueue mb) {
		// TODO Auto-generated constructor stub
		address = mb;
		Vector<Object> chatLog = new Vector<Object>();

	}

	// Function called by consumer thread
	public void run() {
		try {
			
do {
	notify();
	
	address.receive();
	
	
}
while(!address.receive().equals(0));
				
				
				
				 // sleep to let thread build up a bit

		

			// System.out.println("Final List is: " +
			// address.receive().toString());

			// consumes any item in the queue

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
