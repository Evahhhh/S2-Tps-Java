/**
 * This class contains all methods about students
 * @author Eve-Anne Offredi
 */
public class Etudiant{
	private String nom;
	private double[][] bulletin;
	private String[] MATIERES;
	private double[] COEFFICIENTS;
	
	/*
	* Check that the name, school subject and coefficient is not null.
	* Check that the length of school subject equals the length of coefficient.
	* Check that the number of ratings is not under zero.
	* @param nom - name of the student
	* @param matieres - school subject
	* @param coeff - coefficient
	* @param nbNotes - number of ratings
	*/
	public Etudiant(String nom, String[] matieres, double[] coeff,int nbNotes){
		
		if(nom == null || matieres == null || coeff == null) System.out.println("Erreurs initialisations : paramètre null");
		
		else {
			this.nom = nom;
			
			if(matieres.length == coeff.length){
				this.MATIERES = matieres;
				this.COEFFICIENTS = coeff;
				
			}else System.out.println("Erreur : la taille de matieres n'est pas égale à celle de coeff");
			
			if(nbNotes > 0){
				this.bulletin = new double[MATIERES.length][nbNotes];
				this.initialisation();
				
			}else System.out.println("Erreur nbNotes : valeur plus petite ou égale à 0");
		}
	}
	
	/*
	* Set the name
	* @param nom - name
	*/
	public void setNom (String nom){
		this.nom = nom;
	}
	
	/*
	 * Get the name
	 * @return nom - name
	 */
	public String getNom(){
		return this.nom;
	}
	
	/*
	 * Get the gradebook
	 * @return gradebook
	 */
	 public double[][] getBulletin(){
		 return this.bulletin.clone();
	 }
	
	/*
	 * Get the school subjects
	 * @return school subjects
	 */
	 public String[] getMATIERES(){
		 return this.MATIERES.clone();
	 }
	 
	 /* Get the coefficients
	 * @return coefficients
	 */
	 public double[] getCOEFFICIENTS(){
		 return this.COEFFICIENTS.clone();
	 }
	 
	/*
	* Get the number of school subjects
	* @return nbMat - number of school subjetcs
	*/
	public int getNbMatieres(){
		return this.MATIERES.length;
	}
	
	/*
	* Get the rating you are asking for
	* @param iMatiere - index of the school subject
	* @param i - index of the rating
	* @return note - the rating 
	*/
	public double getUneNote(int iMatiere,int i){
		 double note;
		 note = this.bulletin[iMatiere][i];
		 return note;
	}
	 
	/*
	 * Fills a student s report card with actual random values between 0 and 20
	 */
	private void initialisation(){
		//parcourir le tableau bulletin pour les matieres
		for(int i = 0; i < this.MATIERES.length; i++){
			//parcourir les notes du bulletin pour chaque matiere
			for(int j = 0; j < this.bulletin[i].length; j++){
				//attribuer la note
				this.bulletin[i][j] = (double)Math.round(Math.random()*20*100)/100;
			}
		}
	}
	
	/*
	 * Calculates the grade point average for the school subject 
	 * @param iMatiere - index of the school subject 
	 * @return rep - the result
	 */
	public double moyenneMatiere(int iMatiere){
		double rep = 0.0;
		double add = 0.0;
		
		if(this.bulletin[iMatiere].length <= 0) System.out.println("Erreur du nombre de notes de la matière choisie : plus petit ou égal à 0");
		else{
		
			//parcourir tableau matieres et ajouter toutes les notes puis diviser par le nb de notes
			for(int i = 0; i < this.bulletin[iMatiere].length; i++){
				add = add + this.bulletin[iMatiere][i];
			}
			
			rep = add/this.bulletin[iMatiere].length;
			
		}

		return rep;
	}
	
	/*
	 * Calculates the average of all the averages by school subject by applying the school subject coefficients
	 * @return rep - the result
	 */
	public double moyenneGenerale(){
		double rep = 0.0;
		double add = 0.0;
		double moyMat = 0.0;
		int cpt = 0;
		
		for(int i = 0; i < this.MATIERES.length; i++){
			
			moyMat = moyenneMatiere(i);
			
			for(int j = 0; j < this.COEFFICIENTS[i]; j++){
				add = add + moyMat;
				cpt++;
			}
		}
		rep = add/cpt;
		return rep;
	}
	
	/*
	 * Returns a string containing the school subject and the best grade
	 *@return rep - the best grade
	 */
	public String meilleureNote(){
		String rep = "";
		//meilleure note
		double meill = 0.0;
		
		//Calculer la meilleure note
		for(int i = 0; i < this.MATIERES.length; i++){
			for(int j = 0; j < this.bulletin[i].length; j++){
				//Definir la meilleure note
				if(meill < this.bulletin[i][j]) meill = this.bulletin[i][j];
			}
			rep = rep + this.MATIERES[i] + "\t" + "" + meill + "\n";
			meill = 0.0;
		}		
		
		return rep;
	}
	
	/*
	 * Returns a character string representing the date of a student that can be displayed later
	 *@return rep - the character string you ask for
	 */
	public String toString(){
		String rep = "null";
		String retLigne = "\n";
		
		rep = "Nom : " + this.nom + retLigne;
		//parcourir le tableau MATIERES
		for(int i = 0; i < this.MATIERES.length; i++){
			rep  = rep + this.MATIERES[i] + "\t" + "(coeff : " + "" + this.COEFFICIENTS[i] + (") : " + "\t");
			//parcourir les notes du bulletin
			for(int j = 0; j < this.bulletin[0].length; j++){	
				rep = rep + ""+this.bulletin[i][j] + "\t";
			}
			rep = rep + retLigne;
		}
		
		return rep;
	}
	
	/*
	 * Generates a student s report card
	 *@return bull - the student s report card
	 */
	public String genererBulletin(){
		String bull = "";
		String retLigne = "\n";
		String tab = "\t";
		
		for(int i = 0; i < this.MATIERES.length; i++){
			bull = bull + retLigne + this.MATIERES[i] + tab;
			for(int j = 0; j < this.bulletin[i].length; j++){
				bull = bull + "" + this.bulletin[i][j] + tab;
			}
		}
		
		return bull;
	}
}
