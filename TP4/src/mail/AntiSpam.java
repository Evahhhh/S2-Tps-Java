/**
 * This class contains all methods about AntiSpam
 * @author Eve-Anne Offredi
 */

package mail;
import java.util.ArrayList;

public class AntiSpam {
    private ArrayList<String> filters;
    
    /*
     * Constructor
     * @param filters - filters
     */
    public AntiSpam(ArrayList<String> filters){
        if(filters == null) System.out.println("Error AntiSpam : Constructor : parametre filters invalide");
        else this.filters = filters;
    }

    /*
     * analyses the text of a message and searches if one of the words of the list of filters is contained in this text. This method must
     * Return true if the analyzed message is a spam or false otherwise
     * @param message - message
     * @return spam - true if the message is a spam
     */
    public boolean scan(String message){
        boolean spam = false;
        int elem = -2;
        //parcourir la liste des filtres
        for(String banWord : filters){
            //rechercher le mot interdit dans le message
            elem = message.indexOf(banWord);
            //s'il est présent, c'est un spam
            if(elem >= 0) spam = true;
        }
        return spam;
    }

    /*
     * To add the word f to the filter list
     * @param f - the given word
     */
    public void add(String f){
        if(!f.equals("") && f != null) this.filters.add(f);
        else System.out.println("Error AntiSpam : add : parametre f invalide");
    }
}
