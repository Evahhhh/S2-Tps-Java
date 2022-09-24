package modele.donnee;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Cette classe ObsBatracien est une observation de l'espece batracien 
 * sous-type de la classe Observation avec, en plus, un attribut enumere precisant l’espece precise du batracien
 * et quatre en-tiers indiquant le resultat de l’observation. 
 * @author Theo
 * @version 1.0 
 */
public class ObsBatracien extends Observation {
	/**nombre d adultes */
	private int nombreAdultes;
	/**nombre d amplexus */
	private int nombreAmplexus;
	/** nombre de tetards */
	private int nombreTetard;
	/** nombre de pontes */
	private int nombrePonte;
	/** espece du batracien */
	private EspeceBatracien espece;

	/**
	 * Methode constructeur de la classe ObsBatracien
	 * @param id - identifiant unique
	 * @param date - date de la prise de l'observation
	 * @param heure-  heure de la prise de l'observation 
	 * @param lieu -  lieu de la prise de l'observation
	 * @param observateurs - les personnes qui ont effectue l observation
	 * @param resObs - tableau de 4 cases contenant le nombre d adultes (resObs[0]), d amplexus (resObs[1]), de tetards (resObs[2]) et de pontes (resObs[3])
	 * @param lEspece - espece du batracien.
	 */
	public ObsBatracien(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, int[] resObs, EspeceBatracien lEspece) {
		super(id,date,heure,lieu,observateurs);

		if(resObs == null){
			throw new IllegalArgumentException("ERREUR ObsBatracien : Constructor : resObs null ");
		}else{
			this.nombreAdultes = resObs[0];
			this.nombreAmplexus = resObs[1];
			this.nombreTetard = resObs[2];
			this.nombrePonte = resObs[3];
		}

		if(lEspece == null){
			throw new IllegalArgumentException("ERREUR ObsBatracien : Constructor : lEspece null ");
		}else{
			this.espece = lEspece;
		}
	}

	/**
	 * Methode herite de la classe observation, retourne la valeur du type enumere EspeceObservee Batracien
	 * @return la valeur du type enumere
	 */
	public EspeceObservee especeObs() {
		return EspeceObservee.BATRACIEN;
	}

	/**
	 * getter de nombreAdultes 
	 * @return le nombre d adulte de Batracien 
	 */
	public int getNombreAdultes(){
		return this.nombreAdultes;	
	}

	/**
	 * getter de nombreAmplexus 
	 * @return le nombre d amplexus du Batracien
	 */
	public int getNombreAmplexus(){
		return this.nombreAmplexus;	
	}

	/**
	 * getter de nombreTetard 
	 * @return le nombre de tetard du Batracien
	 */
	public int getNombreTetard(){
		return this.nombreTetard;	
	}

	/**
	 * getter de nombrePonte 
	 * @return le nombre de ponte du Batracien
	 */
	public int getNombrePonte(){
		return this.nombrePonte;	
	}

	/**
	 * getter d espece
	 * @return l'espece du Batracien en EspeceBatracien
	 */
	public EspeceBatracien getEspece(){
		return this.espece;	
	}

	/**
	 * Setter du nombreAdultes
	 * @param leNombreAdultes - nombre d'adulte de Batracien 
	 */
	public void setNombreAdultes(int leNombreAdultes){
		if(leNombreAdultes < 0){
			System.out.println("Erreur setNombreAdultes : setter : leNombreAdultes est negative");
		}else{
			this.nombreAdultes = leNombreAdultes;
		}
	}


	/**
	 * Setter du nombreAmplexus
	 * @param leNombreAmplexus - nombre d'amplexus de Batracien 
	 */
	public void setNombreAmplexus(int leNombreAmplexus){
		if(leNombreAmplexus < 0){
			System.out.println("Erreur setNombreAmplexus : setter : leNombreAmplexus est negative");
		}else{
			this.nombreAmplexus = leNombreAmplexus;
		}
	}

	/**
	 * Setter du nombreTetard
	 * @param leNombreTetard - nombre de tetard de Batracien 
	 */
	public void setNombreTetard(int leNombreTetard){
		if(leNombreTetard < 0){
			System.out.println("Erreur setNombreTetard : setter : leNombreTetard est negative");
		}else{
			this.nombreTetard = leNombreTetard;
		}
	}

	/**
	 * Setter du nombrePonte
	 * @param leNombrePonte - nombre de ponte d'un Batracien 
	 */
	public void setNombrePonte(int leNombrePonte){
		if(leNombrePonte < 0){
			System.out.println("Erreur setNombrePonte : setter : leNombrePonte est negative");
		}else{
			this.nombrePonte = leNombrePonte;
		}
	}

	/**
	 * Setter d'espece
	 * @param lEspece - EspeceBatracien de l'espece d'un Batracien 
	 */
	public void setEspece(EspeceBatracien lEspece){
		if(lEspece == null){
			System.out.println("Erreur setEspece : setter : lEspece null");
		}else{
			this.espece = lEspece;
		}
	}
}