/**
 * This class contains all methods about MailItem
 * @author Eve-Anne Offredi
 */
 
package mail;

public class MailItem{
	private String from;
	private String to;
	private String message;
	
	/*
	 * Contructor
	 * @param from - sender
	 * @param to - recipient
	 * @param message - message
	 */
	public MailItem(String from, String to, String message){
		if(from==null){
			System.out.println("Erreur : from est null");
			this.from="";
		}else this.from = from;
		
		if(to==null){
			System.out.println("Erreur : to est null");
			this.to="";
		}else this.to = to;
		
		if(message==null){
			System.out.println("Erreur : message est null");
			this.message="";
		}else this.message = message;
	}
	
	/*
	 * Getter of the sender
	 *@return the sender
	 */
	public String getFrom(){
		return this.from;
	}
	
	/*
	 * Getter of the recipient
	 *@return the recipient
	 */
	public String getTo(){
		return this.to;
	}
	
	/*
	 * Getter of the message
	 *@return the message
	 */
	public String getMessage(){
		return this.message;
	}
	
	/*
	 * Print all the informations : sender, recipient and message
	 */
	public void print(){
		String mail;
		mail = "Sender : " + this.from + "\n" + "Recipient : " +  this.to + "\n" + "Message : " + this.message;
		System.out.println(mail);
	}
}
