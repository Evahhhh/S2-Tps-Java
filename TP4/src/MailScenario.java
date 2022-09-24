/**
 * This class uses all the methods of mail package
 * @author Eve-Anne Offredi
 */

import java.util.ArrayList;

import mail.*;

public class MailScenario{
	public static void main(String[] args){
		
		//définiton des spams
		ArrayList<String> motSpam = new ArrayList<String>();
		motSpam.add("Rhinoshield");
		motSpam.add("Nord VPN");
		AntiSpam antiSpam = new AntiSpam(motSpam);

		//création d'un serveur
		MailServer serveur = new MailServer(motSpam);

		//création la classe MailItem 
		MailItem mail1 = new MailItem("Lucas","Theo","Pourquoi t'es encore à Lorient a 10h du matin??");
		MailItem mail2 = new MailItem("Théo","Lucas","Je faisais du OneWheel");
		MailItem mail3 = new MailItem("Tristan","Theo","Et t'es pas tombe ??");
		MailItem mail4 = new MailItem("Evah","Theo","T'as rate la BDD pour info");

		//création de clients
		MailClient client1 = new MailClient(serveur,"Theo");
		MailClient client2 = new MailClient(serveur,"Tristan");
		MailClient client3 = new MailClient(serveur,"Evah");
		MailClient client4 = new MailClient(serveur,"Lucas");
		
		//Test class MailServer
		System.out.println("\n" +"Test MailServer");
			//test post
			//ajouter les mails au serveur crée
			serveur.post(mail1);
			serveur.post(mail2);
			serveur.post(mail3);
			serveur.post(mail4);
				
			//test HowManyMailItems
			System.out.println("Test howManyMailItems");
				
			//récupérer le nombre de mail envoyé à théo
			int combien = serveur.howManyMailItems("Theo");
			if(combien==3) System.out.println("Test OK");
			else System.out.println("Test Error");
			
			//test getNextMailItem
			System.out.println("\n" + "Test getNextMailItem");
			MailItem mess = serveur.getNextMailItem("Theo");
		
			int nb = serveur.howManyMailItems("Theo");
			
			//Vérifier si un mail a bien été supprimé pour ce client
			if(nb==2) System.out.println("Test OK");
			else System.out.println("Test Error");


		//Tests de MailClient
		System.out.println("\n" +"Test MailClient");

			//test constructeur
			System.out.println( "Test constructeur :cas d'erreurs");
			MailClient clientError = new MailClient(serveur,null);
			MailClient clientError2 = new MailClient(null,"");

			//test sendMailItem
			client1.sendMailItem("Evah", "Hello !");
			client2.sendMailItem("Theo", "Salut !");

			System.out.println("\n" + "Test sendMailItem : cas d'erreurs");
			client4.sendMailItem("", "Error");
			client1.sendMailItem("client4", null);	

			//test printNextMailItem et getNextMailItem
			System.out.println("\n" + "Test getNextMailItem et printNextMailItem");
			System.out.println("Doit s'afficher comme message : Et t'es pas tombe ?? | De la part de Tristan");
			client1.printNextMailItem();
			System.out.println("\n" +"Doit s'afficher comme message : T'as rate la BDD pour info | De la part de Evah");
			client1.printNextMailItem();
			System.out.println("\n" +"Doit s'afficher comme message : Salut !  | De la part de Tristan");
			client1.printNextMailItem();

		//Test AntiSpam
		System.out.println("\n" +"Test AntiSpam");
			//test Constructeur
			System.out.println("Test contructeur : cas d'erreurs");
			AntiSpam motSpamError = new AntiSpam(null);

			//test scan
			boolean rep;
			System.out.println("\n" + "Test scan");
			rep = antiSpam.scan("Venez faire du OneWheel jeudi à 15H");
			if(rep==false) System.out.println("Test OK");
			else System.out.println("Test Error");
			rep = antiSpam.scan("Connaissez vous la nouvelle coque Rhinoshield ?");
			if(rep==true) System.out.println("Test OK");
			else System.out.println("Test Error");

			//test add
			System.out.println("\n" +"Test Add");
			antiSpam.add("OneWheel");
			//on appelle scan pour vérifier s'il a été ajouté
			rep = antiSpam.scan("Venez faire du OneWheel jeudi à 15H");
			if(rep==true) System.out.println("Test OK");
			else System.out.println("Test Error");
	}
}
