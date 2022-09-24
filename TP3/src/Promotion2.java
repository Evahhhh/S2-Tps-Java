/**
 * This class contains all methods about promotion
 * @author Eve-Anne Offredi
 */

public class Promotion2{
	private String nom;
	private Etudiant[] listeEtudiants;
	private int nbInscrits;
	
	//cosntructeur de la classe Promotion
	public Promotion2(String nom,int nbInscrits){
		//gérer le nom
		if(nom==null){
			this.nom="";
			System.out.println("Erreur : le nom est nul");
		}else this.nom = nom;
	}
	
	/*
	 * Getter of the name
	 * @return the name
	 */
	public String getNom(){
		return this.nom;
	}
	
	/*
	 * Setter of the name
	 * @param nom - name 
	 */
	public void setNom(String nom){
		this.nom = nom;
	}
	
	/*
	 * Give the grade point average of the promotion
	 * @return rep - the grade point average
	 */
	public double moyenne(){
		double rep;
		double add = 0;
		
		//parcourir listeEtudiants
		for(int i = 0; i < listeEtudiants.length; i++){
			//ajouter sa moyenne à toutes les autres moyennes
			add = add + listeEtudiants[i].moyenneGenerale();
		}
		
		if(listeEtudiants.length==0){
			rep = 0;
			System.out.println("Erreur division de la moyenne : la liste d'étudiants est de taille 0");
		}else{
			//division
			rep = add/listeEtudiants.length;
		}
		
		return rep;
	}
	
	/*
	 * Give the max of all the grade point average of the promotion
	 * @return rep - the max
	 */
	public double moyenneMax(){
		double rep = 0;
		double moy = 0;
		
		//parcourir listeEtudiants
		for(int i = 0; i < listeEtudiants.length; i++){
			moy = listeEtudiants[i].moyenneGenerale();
			
			//Si la moyenne de l'étudiant est plus grande que celle du précédent alors on la sauvegarde
			if(moy > rep) rep = moy;
		}
		//renvoyer la plus grande moyenne
		return rep;
	}
	
	/*
	 * Give the min of all the grade point average of the promotion
	 * @return rep - the min
	 */
	public double moyenneMin(){
		//On met rep à 21 pour être sûr que la moyenne de l'étudiant soit plus petite 
		double rep = 21;
		double moy = 0;
		
		//parcourir listeEtudiants
		for(int i = 0; i < listeEtudiants.length; i++){
			moy = listeEtudiants[i].moyenneGenerale();
			
			//Si la moyenne de l'étudiant est plus petite que celle du précédent alors on la sauvegarde
			if(moy < rep) rep = moy;
		}
		//renvoyer la plus grande moyenne
		return rep;
	}
	
	/*
	 * Give the grade point average in a school subject for the promotion
	 * @param i - the index of the school subject in MATIERES
	 * @return rep - the grade point average
	 */
	public double moyenneMatiere(int i){
		double rep = 0;
		double add = 0;
		double moy = 0;
		
		//parcourir listeEtudiants
		for(int j = 0; j < listeEtudiants.length; j++){
			//récupérer la moyenne de l'étudiant dans la matière indiquée
			moy = listeEtudiants[j].moyenneMatiere(i);
			
			//ajouter cette moyenne à la somme de toutes les moyennes
			add = add + moy;
		}
		
		if(listeEtudiants.length==0){
			rep = 0;
			System.out.println("Erreur division de la moyenneMatiere : la liste d'étudiants est de taille 0");
		}else{
			//diviser pour connaitre la moyenne générale
			rep = add/listeEtudiants.length;
		}
		
		return rep;
	}
	
	/*
	 * Give the best student with the best grade point average in the promotion
	 * @return rep - the object Etudiant of the student
	 */
	public Etudiant getMajor(){
		double moy = 0;
		//récupérer la meilleure moyenne de la promotion
		double moyMax = moyenneMax();
		//création de l'étudiant à retourner et en mettre 1 par défaut qui sera remplacé par la suite
		Etudiant rep = listeEtudiants[0];
		
		//parcourir listeEtudiants
		for(int j = 0; j < listeEtudiants.length; j++){
			//récupérer la moyenne générale de l'étudiant
			moy = listeEtudiants[j].moyenneGenerale();
			
			//Si nous tombons sur la meilleure moyenne de la promotion
			if(moy == moyMax){
				//Sauvegarder l'étudiant correspondant (le major)
				rep = this.listeEtudiants[j];
			}
		} 
		return rep;
	}
	
	/*
	 * Research a student in the promotion by the name
	 * @param nom - name of the student
	 * @return rep - the object Etudiant that corresps
	 */
	public Etudiant getEtudiant(String nom){
		//création de l'étudiant à retourner et en mettre 1 par défaut qui sera remplacé par la suite
		Etudiant rep = listeEtudiants[0];
		String nomEtud = "null";
		
		//parcourir listeEtudiants
		for(int j = 0; j < listeEtudiants.length; j++){
			//récupérer le nom de l'étudiant
			nomEtud = listeEtudiants[j].getNom();
			
			//Si le nom de l'étudiant correspond au nom recherché alors on sauvegarde l'étudiant dans rep
			if(nomEtud.equals(nom)) rep = this.listeEtudiants[j];
		}
		
		return rep;
	}
	
	/*
	* Returns a character string representing the informations about the promotion
	*@return rep - the character string you ask for
	*/
	public String toString(){
		String rep = "null";
		//retour à la ligne
		String retLigne = "\n";
		//tabulation
		String tab = "\t";
		
		//aficher le nom de la promotion
		rep = "Nom de la promotion: " + this.nom + retLigne;
		
		//parcourir listeEtudiants
		for(int i = 0; i < listeEtudiants.length; i++){
			//aficher les infos de chaque étudiant
			rep = rep + this.listeEtudiants[i].toString() + retLigne;
		}
		
		//afficher le nombre d'étudiants
		rep = rep + "Dans cette promotion il y a " + listeEtudiants.length + " étudiants." + retLigne;
		
		//afficher la moyenne de la promotion
		rep = rep + "La moyenne de la promotion est de : " + moyenne();
		
		return rep;
	}
}
