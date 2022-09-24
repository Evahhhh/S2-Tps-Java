/*
 * This class uses all the methods of Etudiant.java
 * @author Eve-Anne Offredi
 */
public class ScenarioEtudiant{
	public static void main(String[] args){
		
		//création des tableaux
		String[] matieres = {"Communication","Histoire","Géographie","Développement"};
		double[] coeffs = {3,2,5,4};
		 
		//test constructeur et initialisation
		System.out.println("Test constructeur et initialisation");
		Etudiant etud1 = new Etudiant("Poulain", matieres, coeffs, 10);
		Etudiant etud2 = new Etudiant("Danvers", matieres, coeffs, 8);
		Etudiant etud3 = new Etudiant("Cerri", matieres, coeffs, 5);
		
		//test toString
		System.out.println(etud1.toString());
		
		//test moyenneMatiere
		System.out.println("\n" + "Test moyenneMatiere");
		double moyMat = etud1.moyenneMatiere(2);
		System.out.println("La matière est :" + matieres[2]);
		System.out.println(moyMat);
		
		//test moyenneGenerale
		System.out.println("\n" + "Test moyenneGenerale");
		double moyGen1 = etud1.moyenneGenerale();
		System.out.println(moyGen1);
		
		//test meilleureNote
		System.out.println("\n" + "Test meilleureNote");
		System.out.println(etud1.meilleureNote());
		
		//test genererBulletin
		System.out.println("\n" + "Test genererBulletin");
		System.out.println(etud1.genererBulletin());
		
		//test supplementaires
		//moyGen1 : moyenne de etud1
		//etud2
		double moyGen2 = etud2.moyenneGenerale();
		//etud3
		double moyGen3 = etud3.moyenneGenerale();
		//tableau avec les moyennes des etudiants
		double[] moyennesEtuds = {moyGen1,moyGen2,moyGen3};
		//trouver la meilleure moyenne et afficher toutes les moyennes 
		double meilleureN = 0.0;
		System.out.print("\n" + "Test supplémentaire" + "\n" + "Moyenne de chaque étudiant : " + "\t");
		for(int i = 0; i < 3; i++){
			if(meilleureN < moyennesEtuds[i]) meilleureN = moyennesEtuds[i];
			System.out.print(moyennesEtuds[i] + "\t");
		}
		System.out.println("\n" + "Meilleure note : " + "" + meilleureN);
	}
}
