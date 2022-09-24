import pays.*;
import tri.*;
import java.util.Arrays;

/**
*This class tests all classes of Pays
*@author Eve-Anne OFFREDI
*/

public class DemoPays{
    public static void main(String[] args){
        //TEST PAYS
        //création de nos pays
        Pays fr = new Pays("France", 67, 638000);
        Pays br = new Pays("Brésil",212,8516000);
        Pays inc = new Pays("Inc", 34,245000);

        //test des getters
        String aff = fr.getNom() + "\n" + br.getSurface() + "\n" + inc.getPopulation();
        System.out.println("Tests des getter : " + aff);

        //test des setters
        //setNom
        inc.setNom("Allemagne");
        if(inc.getNom().equals("Allemagne")) System.out.println("\n" + "Test OK");
        else System.out.println("\n" + "Test Error");
        System.out.println( "\n" + "Doit afficher une erreur : ");
        br.setNom(null);

        //setSurface
        inc.setSurface(357022);
        if(inc.getSurface()==357022) System.out.println("Test OK");
        else System.out.println("Test Error");

        //setPopulation
        inc.setPopulation(83);
        if(inc.getPopulation()==83) System.out.println("Test OK");
        else System.out.println("Test Error");

        //test toString
        System.out.println("\n" + fr.toString() + "\n");

        //test compareTo
        int surf = fr.compareTo(br);
        if(surf == -1) System.out.println("La surface de la France est plus petite que celle du Bresil");
        else if(surf == 1) System.out.println("La surface de la France est plus grande que celle du Bresil");
        else System.out.println("La surface de la France est égale à celle du Bresil");


        //TEST TRI PAR SELECTION
        //création
        Pays[] tabPays = new Pays[10];
        tabPays [0] = new Pays ("Cuba" , 11423952, 110860);
        tabPays [1] = new Pays ("Chile" , 16454143, 756950);
        tabPays [2] = new Pays ("Russia" , 140702094, 17075200);
        tabPays [3] = new Pays ("Norway" , 4644457, 323802);
        tabPays [4] = new Pays ("Nigeria" , 138283240, 923768);
        tabPays [5] = new Pays ("Paraguay" , 6831306, 406750);
        tabPays [6] = new Pays ("Oman" , 3311640, 212460);
        tabPays [7] = new Pays ("Yemen" , 23013376, 406750);
        tabPays [8] = new Pays ("Togo" , 5858673, 56785);
        tabPays [9] = new Pays ("France" , 64057790 , 643427);

        //trier le tableau
        TriParSelection tabTrie = new TriParSelection(tabPays);
        tabTrie.trier();
        System.out.println(Arrays.toString(tabPays)); 
    }
}