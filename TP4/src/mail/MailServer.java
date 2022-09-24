/**
 * This class contains all methods about MailServer
 * @author Eve-Anne Offredi
 */

package mail;
import java.util.ArrayList;
import java.util.Iterator;

public class MailServer{
	private AntiSpam as;
	private ArrayList<MailItem> items;
	
	/*
	 * Constructor
	 * @param filters - filters
	 */
	public MailServer(ArrayList <String> filters){
		if(filters == null) System.out.println("Error MailServer : Constructor : parametre invalide");
		else this.as = new AntiSpam(filters);
		this.items = new ArrayList<MailItem>();
	}
	
	/*
	 * Give the number of messages to the given object MailClient
	 * @param who - object MailClient
	 * @return nb - number of messages
	 */
	public int howManyMailItems(String who){
		//number of messages
		int nb = 0;
		
		//parcourir l'ArrayList items 
		for(MailItem item : this.items){
			if(item.getTo().equals(who)) nb++;
		}
		
		return nb;
	}
	
	/*
	 * Give the first message (MailItem) to the given object MailClient and delete it of message's list
	 * If there is no message for it, return null
	 * @param who - the client
	 * @return mess - the first message
	 */
	public MailItem getNextMailItem(String who){
		MailItem mess = null;
		//compteur afin de vérifier si c'est le premier emssage sur lequel on tombe dans la boucle
		int nbMess = 0;
		
		Iterator<MailItem> itr = this.items.iterator();
		
		while(itr.hasNext()){
			MailItem item = itr.next();
			
			//si c'est le bon destinataire et que c'est le premier message
			if(item.getTo().equals(who) && nbMess == 0){
				mess = item;
				itr.remove();
				nbMess++;
			}
		}
		
		return mess;
	}
	
	/*
	 * Add the object (MailItem) to the ArrayList items
	 * @param item - the obejct to add
	 */
	public void post(MailItem item){
		boolean spam = this.as.scan(item.getMessage());
		if(spam) System.out.println("Ce message est un spam");
		else{
			this.items.add(item);
		}
	}
}
