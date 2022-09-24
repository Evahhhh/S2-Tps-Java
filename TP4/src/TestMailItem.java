/**
 * This class uses all the methods of MailItem
 * @author Eve-Anne Offredi
 */
 
import mail.MailItem;

class TestMailItem{
	public static void main(String[] args){
		
		//création de mails
		MailItem mail1 = new MailItem("Tristan","Lucas","Test numéro 1");		
		MailItem mail2 = new MailItem(null,"","         ");
		
		//test getFrom
		System.out.println("Test getFrom()");
		
		String gFrom1 = mail1.getFrom();
		if(gFrom1.equals("Tristan")) System.out.println("Test OK");
		else System.out.println("Test Error");
		
		String gFrom2 = mail2.getFrom();
		if(gFrom2.equals("")) System.out.println("Test OK");
		else System.out.println("Test Error");
		
		//test getTo
		System.out.println("\n" + "Test getTo()");
		
		String gTo1 = mail1.getTo();
		if(gTo1.equals("Lucas")) System.out.println("Test OK");
		else System.out.println("Test Error");
		
		String gTo2 = mail2.getTo();
		if(gTo2.equals("")) System.out.println("Test OK");
		else System.out.println("Test Error");
		
		//test getMessage
		System.out.println("\n" + "Test getMessage()");
		
		String gMess1 = mail1.getMessage();
		if(gMess1.equals("Test numéro 1")) System.out.println("Test OK");
		else System.out.println("Test Error");
		
		String gMess2 = mail2.getMessage();
		if(gMess2.equals("         ")) System.out.println("Test OK");
		else System.out.println("Test Error");
	}
}
