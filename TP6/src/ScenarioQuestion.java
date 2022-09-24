/**
 * This class test all the method about Question and ChoiceQuestion
 * @author Eve-Anne Offredi
 */

import java.util.Scanner;
import question.*;

public class ScenarioQuestion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //création des questions  
        //question utilisant le constructeur 1
        Question quest1 = new Question();
        //question avec le constructeur 2
        Question quest2 = new Question("Chez quelle ecurie George Russell etait-il en Formule 2 ?", "Art Grand Prix");
        Question quest3 = new Question("En quelle annee Ayrton Senna a decroche sa premiere victoire ?", "1985");

        //Question
        System.out.println("\n" + "Question : tests");
        //q2
        quest2.display();
        String solution = sc.nextLine();
        if(quest2.checkAnswer(solution)) System.out.println("Bonne Reponse !");
        else System.out.println("Mauvaise reponse !");
        //q3
        quest3.display();
        solution = sc.nextLine();
        if(quest3.checkAnswer(solution)) System.out.println("Bonne Reponse !");
        else System.out.println("Mauvaise reponse !");

        //ChoiceQuestion
        System.out.println("-----------------------------------------------------------------------------" + "\n" + "ChoiceQuestion : tests");
        //constructeurs
        ChoiceQuestion c2 = new ChoiceQuestion();
        ChoiceQuestion c3 = new ChoiceQuestion();
        //q2
        c2.setText("Chez quelle ecurie George Russell etait-il en Formule 2 ?");
        c2.addChoice("Carlin",false);
        c2.addChoice("Hitech Racing",false);
        c2.addChoice("Prema Powerteam",false);
        c2.addChoice("Art Grand Prix",true);
        //q3
        c3.setText("En quelle annee Ayrton Senna a decroche sa premiere victoire ?");
        c3.addChoice("1980",false);
        c3.addChoice("1985",true);
        c3.addChoice("1978",false);
        c3.addChoice("1989",false);
        //affichage
        c2.display();
        c3.display();
    }
}