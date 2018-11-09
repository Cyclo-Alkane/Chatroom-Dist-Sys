import java.net.ConnectException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Factory {
	public Factory(String serverName)
			throws MalformedURLException, RemoteException, NotBoundException, InterruptedException {
		// TODO Auto-generated constructor stub

	}

	public synchronized static void main(String[] args) {

		System.setSecurityManager(new SecurityManager());
		MessageQueue mb;
		try {
			mb = (MessageQueue) Naming.lookup("rmi://127.0.0.1/MessageServer"); //connect to server

			Produce maker = new Produce(mb); // create instances of produce and
												// consume

			maker.start(); // start threads

			maker.notify(); //notify 

		} catch (MalformedURLException | NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		catch (RemoteException e) {
			System.out.println(" Remote Exception ");
		} catch (IllegalMonitorStateException b) {
			System.out.println("Monitor Exception Error");
		}

	}

}
