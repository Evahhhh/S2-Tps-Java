/**
 * This class uses all the methods of Promotion.java
 * @author Eve-Anne Offredi
 */

public class ScenarioPromotion{
	
	public static void main(String[] args){
		
		String[] mat = {"BDD","Algo","SAE","Onewheel"};
		double[] coeff = {30,50,90,1};
		
		//création des étudiants
		Etudiant etud1 = new Etudiant("Poulain", mat, coeff, 3);
		Etudiant etud2 = new Etudiant("Danvers", mat, coeff, 2);
		Etudiant etud3 = new Etudiant("Cerri", mat, coeff, 3);
		Etudiant etud4 = new Etudiant("Bourbigot", mat, coeff, 2);
		
		//création de la promotion
		Etudiant[] liste = {etud1,etud2,etud3,etud4};
		Promotion p1 = new Promotion("Promo 1", liste);
		
		//test toString  et constructeur : affichage de la promotion
		System.out.println(p1.toString());
		
		//changement du nom d'un étudiant
		etud4.setNom("WildTristanBourbibouche");
		
		//Séparation pour plus de lisibilité
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		//Affichage de la promotion
		System.out.println("Nous renommons Bourbigot : WildTristanBourbibouche");
		System.out.println(p1.toString());
		
		//Tests des méthodes
		//Séparation pour plus de lisibilité
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		//Moyenne
		System.out.println("\n" + "Test moyenne");
		double moyProm = p1.moyenne();
		System.out.println("Moyenne de la promotion : " + moyProm);
		
		//Séparation pour plus de lisibilité
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		//MoyenneMax
		System.out.println("\n" + "Test moyenneMax");
		double moyMax = p1.moyenneMax();
		System.out.println("Moyenne maximum dans la promotion : " + moyMax);
		
		//Séparation pour plus de lisibilité
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		//MoyenneMin
		System.out.println("\n" + "Test moyenneMin");
		double moyMin = p1.moyenneMin();
		System.out.println("Moyenne minimum dans la promotion : " + moyMin);
		
		//Séparation pour plus de lisibilité
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		//MoyenneMatiere
		System.out.println("\n" + "Test moyenneMatiere");
		//moyenne BDD
		double moyMatBDD = p1.moyenneMatiere(0);
		System.out.println("Moyenne de la promotion en BDD: " + moyMatBDD);
		//moyenne Onewheel
		double moyMatOneWheel = p1.moyenneMatiere(3);
		System.out.println("Moyenne de la promotion en OneWheel: " + moyMatOneWheel);
		
		//Séparation pour plus de lisibilité
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		//GetMajor
		System.out.println("\n" + "Test getMajor");
		Etudiant major = p1.getMajor();
		System.out.println("Le major de la promotion est: " + major);
		
		//Séparation pour plus de lisibilité
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		//GetEtudiant
		System.out.println("\n" + "Test getEtudiant");
		Etudiant etud = p1.getEtudiant("WildTristanBourbibouche");
		System.out.println("Nous recherchons WildTristanBourbibouche");
		System.out.println("L'étudiant recherché dans la promotion est: " + etud);
	}
}
