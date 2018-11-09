import java.rmi.RemoteException;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class messageQueueImp extends java.rmi.server.UnicastRemoteObject implements MessageQueue {
	protected messageQueueImp() throws RemoteException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub

	}

	Vector<Object> testQueue = new Vector<Object>();

	public synchronized void send(Object a, String Usr) throws RemoteException, InterruptedException {
		// TODO Auto-generated method stub
		Date timeStamp = new Date();
		testQueue.addElement(a); // add element to stack

		System.out.println(" "+ timeStamp + " " +  Usr+ "  : " + a); // Message
																															// Produce

		notify();

	}

	@Override
	public synchronized Object receive() throws RemoteException, InterruptedException {
		// TODO Auto-generated method stub
		Object item;

		
		
			notify();

		
	
return null;
		
	}

}
