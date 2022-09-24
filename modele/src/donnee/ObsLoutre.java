package modele.donnee;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * une classe qui represente l observation des loutres
 * @author Theo POULAIN
 * @version 1.0.1
 */
public class ObsLoutre extends Observation {
	/**indice de la loutre */
	private IndiceLoutre indice;

	/**
	 * Methode constructeur de la classe ObsBatracien
	 * @param id - identifiant unique
	 * @param date -  date de la prise de l observation
	 * @param heure - heure de la prise de l observation 
	 * @param lieu - lieu de la prise de l observation
	 * @param observateurs -la liste des observateurs
	 * @param lIndice - indice de la loutre
	 */
	public ObsLoutre(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, IndiceLoutre lIndice) {
		super(id,date,heure,lieu,observateurs);

		if(lIndice == null){
			throw new IllegalArgumentException("ERREUR ObsLoutre : Constructor : lIndice null ");
		}else{
			this.indice = lIndice;
		}
	}

	/**
	 * Methode herite de la class observation, retourne la valeur du type enumere EspeceObservee Loutre
	 * @return la valeur du type enumere
	 */
	public EspeceObservee especeObs() {
		return EspeceObservee.LOUTRE;
	}

	/**
	 * getter d indice 
	 * @return indice l indice de la loutre 
	 */
	public IndiceLoutre getIndice(){
		return this.indice;	
	}

	/**
	 * Methode setter d indice 
	 * @param lIndice - l indice de la loutre 
	 */
	public void setIndice(IndiceLoutre lIndice){
		if(lIndice == null){
			System.out.println("Erreur setIndice : setter : lIndice est null");
		}else{
			this.indice = lIndice;
		}
	}
}