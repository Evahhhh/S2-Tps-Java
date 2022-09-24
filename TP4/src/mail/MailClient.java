/**
 * This class contains all methods about MailClient
 * @author Eve-Anne Offredi
 */
 
package mail;
 
public class MailClient{
	private String user;
    private MailServer server;

    /*
     * Constructor
     * @param server - a server
     * @param user - the user
     */
    public MailClient(MailServer server, String user){
        if(user != null && !user.equals("") && server != null){
            this.user = user;
            this.server = server;
        }
        else System.out.println("Error MailClient : Constructor : parametre invalide");
    }

    /*
     * Send a mail to a user 
     * @param to - the recipient
     * @param message - the message
     */
    public void sendMailItem(String to, String message){
        if(!to.equals("") && to != null && message != null){
            MailItem mail = new MailItem(this.user,to,message);
            this.server.post(mail);
        }
        else System.out.println("Error MailClient : sendMailItem : parametre invalide");
    }

    /*
     *  returns a MailItem by sending the message getNextMailItem(user) where user is the client name. 
     * @return the next mail item
     */
    public MailItem getNextMailItem(){
        return this.server.getNextMailItem(this.user);
    }

    /*
     * Calls the server with the message getNextMailItem(user) and prints the message if it is indeed a message. 
     * Prints a message saying that there is no new message if the return from the server is null. 
     */
    public void printNextMailItem(){
        MailItem item = this.server.getNextMailItem(this.user);
        if(item==null) System.out.println("Aucun nouveau message pour " + this.user);
        else item.print();
    }
}