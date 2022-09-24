package modele.donnee;
import java.util.ArrayList;

/**
 * Une interface qui implemente des methodes de controle pour les observations
 * @author William
 * @version 1.0
 */
public interface IObs<T> {

	/** 
	 * Ajoute une observation
	 * @param obs - observation 
	 */
	public void ajouteUneObs(T obs);

	/**
	 * Ajoute une liste d observations
	 * @param obs - liste d observations 
	 */
	public void ajoutePlsObs(ArrayList<T> obs);

	/**
	 * vide les observations
	 */
	public void videObs();

	/**
	 * Retirer une observation 
	 * @param idObs - observation a retirer
	 * @return vrai si l observation a ete retiree, faux sinon
	 */
	public boolean retireObs(int idObs);

	/**
	 * renvoie le nombre d observations
	 * @return nombre d observations
	 */
	public int nbObs();
	
}