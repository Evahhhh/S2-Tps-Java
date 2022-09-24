package modele.donnee;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * classe abstraite qui représente une observation et qui associe les observateurs, le lieu , la date 
 * et l  heure de celle-ci  
 * @author BOURBIGOT Tristan
 * @version 1.1
 */
public abstract class Observation {
	/**id de l observation */
	protected int idObs;
	/**date de l observation */
	protected Date dateObs;
	/** heure de l observation */
	protected Time heureObs;
	/** lieu de l observation */
	protected Lieu lieuObs;
	/** liste des observateurs */
	protected ArrayList<Observateur> lesObservateurs = new ArrayList<Observateur>();

	/**
	 * Constructeur observation, initialise tout les parametre d une observation 
	 * @param id - identifiant de l observation
	 * @param date - date de l observation 
	 * @param heure - heure de l observation
	 * @param lieu - lieu de l observation
	 * @param observateurs - tableau contenant tout les observateur qui on effectue l observation
	 */
	public Observation(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
		boolean pasDObservateur = false;
		if(observateurs!=null){
			for(Observateur o: observateurs){
				if(o==null) pasDObservateur= true;
			}
		}else pasDObservateur =true;
		
		if(date!=null && heure!=null && lieu!=null && !pasDObservateur) {
			this.idObs=id;
			this.dateObs=date;
			this.heureObs=heure;
			this.lieuObs=lieu;
			this.lesObservateurs=observateurs;
		}else throw new IllegalArgumentException("Erreur Observation : constructeur : parametre invalide");
	}

	/**
	 * cette methode permet d ajouter un nouveau observateur sur l observation
	 * @param aO - nouvel observateur
	 */
	public void ajouteObservateur(Observateur aO) {
		if(aO!=null) this.lesObservateurs.add(aO);
		else System.err.println("Erreur observation : ajouteObservateur : observateur null");
	}

	/**
	 * cette methode permet de retirer un observateur de l observation
	 * @param aIdObservateur - observateur a retirer
	 */
	public void retireObservateur(int aIdObservateur) {
		if(aIdObservateur>=0 && aIdObservateur>this.lesObservateurs.size() ) this.lesObservateurs.remove(aIdObservateur);
		else System.err.println("Erreur Observation : retireObservateur : observateur non trouve");
	}

	/**
	 * getter de idObs
	 * @return id de l observation
	 */
	public int getIdObs(){
		return this.idObs;
	}

	/**
	 * getter de dateObs
	 * @return date de l observation
	 */
	public Date getDateObs(){
		return this.dateObs;
	}

	/**
	 * getter de heureObs
	 * @return heure de l observation
	 */
	public Time getHeureObs(){
		return this.heureObs;
	}

	/**
	 * getter de lieuObs
	 * @return lieu de l observation 
	 */
	public Lieu getLieuObs(){
		return this.lieuObs;
	}

	/**
	 * getter de lesObservateurs
	 * @return Arraylist des observateurs de l observation
	 */
	public ArrayList<Observateur> getLesObservateurs(){
		return this.lesObservateurs;
	}

	/**
	 * setter de idObs
	 * @param id - nouvel id de l observation
	 */
	public void setIdObs(int id){
		this.idObs =id;
	}

	/**
	 * setter de dateObs
	 * @param date - nouvelle date de l observation
	 */
	public void setDateObs(Date date){
		if(date!=null) this.dateObs=date;
		else System.err.println("Erreur Observation : getDateObs : parametre invalide");
	}

	/**
	 * setter de heureObs 
	 * @param heure - nouvelle heure de l observation
	 */
	public void setHeureObs(Time heure){
		if(heure!=null) this.heureObs=heure;
		else System.err.println("Erreur Observation : getDateObs : parametre invalide");
	}

	/**
	 * setter de lieuObs
	 * @param lieu - nouveau lieu de l observation
	 */
	public void setLieuObs(Lieu lieu){
		if(lieu!=null) this.lieuObs=lieu;
		else System.err.println("Erreur Observation : getDateObs : parametre invalide");
	}

	/**
	 * setter de lesObservateurs
	 * @param observateurs - nouvelle liste d observateurs de l observation
	 */
	public void setLesObservateurs(ArrayList<Observateur> observateurs){
		boolean pasDObservateur = false;
		if(observateurs!=null){
			for(Observateur o: observateurs){
				if(o==null) pasDObservateur= true;
			}
		}else pasDObservateur =true;
		if(!pasDObservateur) this.lesObservateurs=observateurs;
	}

	/**
	 * Renvoie le nom de l espece
	 * @return espece observee
	 */
	public abstract EspeceObservee especeObs();
}