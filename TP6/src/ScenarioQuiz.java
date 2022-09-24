/**
 * This class test all the method about Quiz
 * @author Eve-Anne Offredi
 */
import question.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ScenarioQuiz {
    public static void main(String[] args){
        //scanner utilisé plus tard
        Scanner sc = new Scanner(System.in);

        //Definition des questions
        Question quest1 = new Question("En quelle annee a ete envoye le premier satellite : Spoutnik 1 ?","1957");
        Question quest2 = new Question("Quel pilote est appele le Phoenix ? (prenom puis nom)","Romain Grosjean");
        Question quest3 = new Question("Quel est le nom du projet d'Elon Musk visant l'implantation de puces dans le cerveau d'humains ?","Neuralink");
        Question quest4 = new Question("Quelle est la meilleure musique de David Bowie ?","Life On Mars");
        Question quest5 = new Question("Quel evenement musical a permi de lutter contre la famine en Ethiopie en 1985 ?","Live Aid");

        ChoiceQuestion c1 = new ChoiceQuestion();
        ChoiceQuestion c2 = new ChoiceQuestion();
        ChoiceQuestion c3 = new ChoiceQuestion();
        ChoiceQuestion c4 = new ChoiceQuestion();
        ChoiceQuestion c5 = new ChoiceQuestion();
        ChoiceQuestion c6 = new ChoiceQuestion();

        c1.setText("Combien de victoires detient Lewis Hamilton en Formule 1 ?");
        c2.setText("Qui detient le plus de victoires en Formule 1 ?");
        c3.setText("Chez quelle ecurie George Russell etait-il en Formule 2 ?");
        c4.setText("En quelle annee Ayrton Senna a decroche sa premiere victoire ?");
        c5.setText("Quel est le premier être vivant qui est parti dans l'espace ?");
        c6.setText("Qui est la premiere femme partant dans l'espace ?");

        //question 1
        c1.addChoice("98",false);
        c1.addChoice("84",false);
        c1.addChoice("69",false);
        c1.addChoice("103",true);

        //question 2
        c2.addChoice("Alonso",false);
        c2.addChoice("Hamilton",true);
        c2.addChoice("Senna",false);
        c2.addChoice("Fangio",false);
            
        //question 3
        c3.addChoice("Art Grand Prix",true);
        c3.addChoice("Hitech Racing",false);
        c3.addChoice("Carlin",false);
        c3.addChoice("Prema Powerteam",false);

        //question 4
        c4.addChoice("1980",false);
        c4.addChoice("1989",false);
        c4.addChoice("1978",false);
        c4.addChoice("1985",true);

        //question 5
        c5.addChoice("Charlie - un rat",false);
        c5.addChoice("Laika - un chien",true);
        c5.addChoice("Chester - un chat",false);
        c5.addChoice("Andy - un singe",false);

        //question 6
        c6.addChoice("Svetlana Savitskaia",false);
        c6.addChoice("Sally Ride",false);
        c6.addChoice("Judith Resnik",false);
        c6.addChoice("Valentina Terechkova",true);

        //ajouter les questions a la liste
        ArrayList<Question> listeQuestions = new ArrayList<Question>();
        listeQuestions.add(quest1);
        listeQuestions.add(quest2);
        listeQuestions.add(quest3);
        listeQuestions.add(quest4);
        listeQuestions.add(quest5);
        listeQuestions.add(c1);
        listeQuestions.add(c2);
        listeQuestions.add(c3);
        listeQuestions.add(c4);
        listeQuestions.add(c5);
        listeQuestions.add(c6);
        Quiz q1 = new Quiz(listeQuestions);

        //compteur de points 
        int cpt = 0;

        //affichage du quiz
        System.out.println("\n" + "Bienvenue dans ce Quiz, nous allons commencer.");
        for(int i = 0; i < 6; i++){
            //choisir une question puis l'afficher
            Question quest = q1.pickAtRandom();
            quest.display();

            //traitement de la réponse donnée
            String solution = sc.nextLine();
            if(quest.checkAnswer(solution)){
                cpt++;
                System.out.println("Bonne Reponse !");
            }
            else System.out.println("Mauvaise reponse !");
        }
        System.out.println("Vous avez le score de : " + String.valueOf(cpt) + "/6 !" + "\n");
    }
}
