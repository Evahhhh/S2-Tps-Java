package pays;
/**
*This class contains all methods about Pays
*@author Eve-Anne OFFREDI
*/

public class Pays implements Comparable<Pays>{
    /**name*/ 
    private String nom;
    /**surface*/ 
    private double surface;
    /**population*/ 
    private double population;

    /**
     * Pays Builder
     * @param nom : name
     * @param population : population
     * @param surface : surface
     */
    public Pays(String nom, double population, double surface){
        if(nom == null){
            throw new IllegalArgumentException("Error Pays : constructeur : nom null");
        }else{
            this.nom = nom;
            this.population = population;
            this.surface = surface;
        }
    }

    /**
     * Get the name
     * @return the name 
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Set the name
     * @param nom : new name 
     */
    public void setNom(String nom){
        if(nom == null){
            System.out.println("Error Pays : setNom : parametre null");
        }else{
            this.nom = nom;
        }
    }

    /**
     * Get the surface
     * @return surface
     */
    public double getSurface(){
        return this.surface;
    }

    /**
     * Set the surface
     * @param surface : new surface 
     */
    public void setSurface(double surface){
        this.surface = surface;
    }

    /**
     * Get the population
     * @return population
     */
    public double getPopulation(){
        return this.population;
    }

    /**
     * Set the population
     * @param population : new population 
     */
    public void setPopulation(double population){
        this.population = population;
    }


    /**
     * Returns a string with all the information of a Country
     * @return aff : informations
     */
    public String toString(){
        String saut="\n";
        String aff = "Informations du Pays : " + saut + "nom : " + this.nom + saut + "surface : " + this.surface + saut + "population : " + this.population;
        return aff;
    }

    /**
     * Compare the given country surface to the current object
     * Return -1 if this object is ...
     * @param o : country to compare
     * @return res : result
     */
    public int compareTo(Pays o){
        int res;

        if(o == null) throw new NullPointerException("Error Pays : compareTo : paramètre null");
        else if(o.getSurface() > this.surface) res = -1;
        else if(o.getSurface() == this.surface) res = 0;
        else res = 1;

        return res;
    }
}