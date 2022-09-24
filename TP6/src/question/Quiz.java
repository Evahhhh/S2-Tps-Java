/**
 * This class contains all the method about Quiz
 * @author Eve-Anne Offredi
 */
package question;
import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private ArrayList<Question> questionList;

    /*
     * Constructor 1
     */
    public Quiz(){
        this.questionList = new ArrayList<Question>();
    }

    /*
     * Constructor 2
     *@param list - the questionList 
     */
    public Quiz(ArrayList <Question> list){
        if(list == null) System.out.println("Question : constructor 2 : paramètre invalide");
        else this.questionList = list;
    }

    /*
     *returns a question randomly drawn from the list questionList
     *@return an random question 
     */
    public Question pickAtRandom(){
        Random random = new Random();
        return questionList.get(random.nextInt(questionList.size()));
    }

    /*
     *returns the text of the question which index is passed as parameter
     *@param index - given index
     *@return the question you ask for
     */
    public String getQuestionText(int index){
        return (questionList.get(index)).getText();
    }

    /*
     * returns the number of questions
     *@return number of questions
     */
    public int getQNumber(){
        return questionList.size();
    }

    /*
     * allows you to add a question to the list
     *@param q - question to add
     */
    public void add(Question q){
        questionList.add(q);
    }

    /*
     * displays all the questions in the questionnaire
     */
    public void display(){
        String aff = "\n";
        for(Question q : questionList){
            aff = aff + getQuestionText(questionList.indexOf(q)) + "\n";
        }
    }
}
