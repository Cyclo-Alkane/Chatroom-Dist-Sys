import java.net.ConnectException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Produce extends Thread {
	MessageQueue address;

	public Produce(MessageQueue mb) {
		// TODO Auto-generated constructor stub

		address = mb;

	}

	public void run() {
		
		
		try {
			String message = ""; //enter message
			Scanner inputtext = new Scanner(System.in); //scanner to recieve messages
			String User; //username
			System.out.println("Please enter a username:" );
			User = inputtext.nextLine();
			
			address.send( User + " has entered the room " , User); //notification on new user
			
		do 
		{	
			
	
	System.out.println("Please enter a message to send"); //prompt
	message = inputtext.nextLine();
	
			
				address.send(message,User); //Sends message and User name
			
			//System.out.println("DEBUG message =" + message);
				
			} while(!message.equals("END")); //exit phrase
		
		address.send(User + " has left the room", User);
		
				System.out.println("You have left the conversation ");
				inputtext.close();
				System.exit(0);
			
		
		}
		

		
			
		catch (RemoteException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	} 

}