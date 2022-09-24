/**
 * This class contains all the method about ChoiceQuestion
 * @author Eve-Anne Offredi
 */
package question;
import java.util.ArrayList;

public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;

    /*
     * Constructor 
     */
    public ChoiceQuestion(){
        super();
        this.choices = new ArrayList<String>();
    }

    /*
     * Add a possible answer to choices ArrayList
     * @param choice - new answer
     * @param correct - tell if the answer is true or not
     */
    public void addChoice(String choice, boolean correct){
        this.choices.add(choice);
        if(correct){
            int indexChoice = (this.choices.indexOf(choice))+1;
            super.setAnswer(String.valueOf(indexChoice));
        }
    }

    /** 
    * Display the question with different answers
    */
    public void display(){
        super.display();
        String aff = "";
        int index;
        for(String rep : choices){
            index = choices.indexOf(rep) + 1;
            aff = aff + index + ") " + rep + "\n";
        }
        System.out.println(aff);
    }
}
