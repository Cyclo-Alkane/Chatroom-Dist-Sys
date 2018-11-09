/**
 * 
 */

/**
 * @author Louis Smith
 *
 */
public interface MessageQueue extends java.rmi.Remote {
	public void send(Object a, String user) throws java.rmi.RemoteException, InterruptedException;

	public Object receive() throws java.rmi.RemoteException, InterruptedException;

}
