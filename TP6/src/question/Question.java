/**
 * This class contains all the method about Question
 * @author Eve-Anne Offredi
 */

package question;

public class Question{
    private String text;
    private String answer;

    /*
     * Constructor 1
     */
    public Question(){
        this.text = "";
        this.answer = "";
    }
    
    /*
     * Constructor 2
     *@param text - question
     *@param answer - answer of the question
     */
    public Question(String text, String answer){
        if(text == null || text.equals("") || answer == null || answer.equals("")){
            System.out.println("Error Question : constructor : paramètre invalide");
        }
        else{
            this.text = text;
            this.answer = answer;
        }
    }

    /*
     * Get the text
     * @return text
     */
    public String getText(){
        return this.text;
    }

    /*
     * Set the text
     * @param text - the text to set
     */
    public void setText(String text){
        this.text = text;
    }

    /*
     * Get the answer
     * @return answer
     */
    public String getAnswer(){
        return this.answer;
    }

    /*
     * Set the answer
     * @param answer - the answer to set
     */
    public void setAnswer(String answer){
        this.answer = answer;
    }

    /*
     * Check if the given response equals to the answer
     * Return true if it's equals, if not return false
     * @param response - the response to check
     * @return equal - if the response equals to the answer or not
     */
    public boolean checkAnswer(String response){
        boolean equal = false;
        //si la réponse est égale à la valeur courante alors on met equal à true sans tenir compte des majuscules
        if(this.answer.equalsIgnoreCase(response)) equal = true;
        return equal;
    }

    /*
     * Display the question text
     */
    public void display(){
        System.out.println("\n" + this.text);
    }
}