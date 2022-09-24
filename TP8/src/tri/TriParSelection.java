package tri;
import pays.*;

/**
*This class contains all methods about TriParSelection
*@author Eve-Anne OFFREDI
*/

public class TriParSelection implements ITri{
    /**All countries*/ 
    private Pays[] tab;

    /**
     * TriParSelection Builder
     * @param tab : all countries in a array
     */
    public TriParSelection(Pays[] tab){
        if(tab == null) throw new IllegalArgumentException("Error TriParSelection : constructeur : parametre invalide");
        else this.tab = tab;
    }

    /**
     * Give the index of the minimum in tab[debut] to the end of tab
     * @param debut : the index of start of the research
     * @return min : index of the minimum in the tab
     */
    private int minimumPosition(int debut){
        int min = 1;

        for(int i = debut; i < this.tab.length; i++){
            //si cet élement est plus petit que le minimum
            if(this.tab[i].compareTo(this.tab[min]) == -1){
                min = i;
            }
        }
        return min;
    }

    /**
     * Exchanges two entries of the array of index i and j
     * @param i : index i
     * @param j : index j
     */
    private void swap(int i, int j){
        Pays sauv = this.tab[i];
        this.tab[i] = this.tab[j];
        this.tab[j] = sauv;
    }

    /**
     * Sourt out the array
     */
    public void trier(){
        for(int i = 0; i < this.tab.length - 1; i++){
            //rechercher le plus petit élément et le mettre au début du tableau
            int min = minimumPosition(i);
            swap(min,i);
        }
    }
}
