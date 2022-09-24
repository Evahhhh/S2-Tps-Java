package pays;
/**
*This class contains all methods about Population
*@author Eve-Anne OFFREDI
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Population {
    /** population Map*/
    private HashMap<String,Double> popMap;
    /** area Map*/
    private HashMap<String,Double> areaMap;
    /**countries list */
    private ArrayList<Pays> listePays;

    /**
     * Constructor
     * @param popArray : list of population in a country
     * @param areaArray : list of area in a country
     */
    public Population(ArrayList<String> popArray, ArrayList<String> areaArray){
        if(popArray == null){
            throw new IllegalArgumentException("Error Population : constructeur : popArray null");
        }else if(areaArray == null){
            throw new IllegalArgumentException("Error Population : constructeur : areaArray null");
        }else{
            this.initializePopMap(popArray);
            this.initializeAreaMap(areaArray);
            this.initializeListePays();
        }
    }

    /**
     * Get the popMap
     * @return the popMap 
     */
    public HashMap<String,Double> getPopMap(){
        return this.popMap;
    }

    /**
     * Get the areaMap
     * @return the areaMap 
     */
    public HashMap<String,Double> getAreaMap(){
        return this.areaMap;
    }

    /**
     * Get the countries
     * @return the lsit of countries 
     */
    public ArrayList<Pays> getListePays(){
        return this.listePays;
    }

    /**
     * Initialize the popMap
     * @param popMap
     */
    private void initializePopMap(ArrayList<String> popMap){
        this.popMap = asMap(popMap);
    }

    /**
     * Initialize the areaMap
     * @param areaMap
     */
    private void initializeAreaMap(ArrayList<String> areaMap){
        this.areaMap = asMap(areaMap);
    }

    /**
     * Initialize the list of countries
     */
    private void initializeListePays(){

    }

    /**
     * Takes as parameter an ArrayList containing String objects of the form "country, data" and returns in result a HashMap whose elements will have as key the name of the country and the data in value.
     * @param liste - arraylist of elements
     * @return map
     */
    private HashMap<String,Double> asMap(ArrayList<String> liste){
        HashMap <String,Double> map = new HashMap<String,Double>();
        for(String elem : liste){
            map.put(extractCountry(elem),extractValue(elem));
        }
        return map;
    }

    /**
     * Return the country's name which is extract
     * @param line - where we are searching
     * @return country's name
     */
    private String extractCountry(String line){
        boolean digit = false;
        int i = 0;
        while(!digit){
            digit = Character.isDigit(line.charAt(i));
            i++;
        }
        //On enleve les dernieres incrementations pour retrouver l'indice
        i = i-2;
        String country = line.substring(0,i);
        country = country.trim();
        return country;
    }
    
    
    /**
     * Return the number in the second part
     * @param line - where we are searching
     * @return number in the second part
     */
    private double extractValue(String line){
        boolean digit = false;
        int i = 0;
        while(!digit){
            digit = Character.isDigit(line.charAt(i));
            i++;
        }
        /**On enleve les dernieres incrementations pour retrouver l'indice*/
        i = i-2;
        String number = line.substring(i);
        number = number.trim();
        double n = Double.parseDouble(number);
        return n;
    }

}
