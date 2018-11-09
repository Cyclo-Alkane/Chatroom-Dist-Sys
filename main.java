import java.rmi.Naming;
import java.net.*;
/**
 * 
 */

/**
 * @author Louis Smith
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setSecurityManager(new SecurityManager());

		try {
			String serverName = "//127.0.0.1/MessageServer"; // server address
			MessageQueue server = new messageQueueImp(); // new message queue
			Naming.rebind(serverName, server);
			System.out.println("RMI Simple Chatroom Example");
			System.out.println("Server address is: " + serverName);
			System.out.println("Server is Hosted on:" + java.net.InetAddress.getLocalHost() );
			System.out.println("Server Bound");

		} catch (Exception e) {
			System.out.println("Server: " + e);
		}
	}

}
