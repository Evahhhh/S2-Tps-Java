import staff.*;
import java.util.ArrayList;

/**
*This class tests all classes in package staff
*@author Eve-Anne OFFREDI
*/


public class Scenario{
    public static void main(String[] args){
        //création des membres du staff
        StaffMember m1 = new Volunteer("Martin", "Nantes", "068327");
        StaffMember m2 = new Volunteer("Julie", "Dijon", "079222");
        Executive m3 = new Executive("Nadine", "Evry", "03248","1111",50);
        Hourly m4 = new Hourly("Tom", "Montpellier", "036245","3322",20);
        Hourly m5 = new Hourly("Théo", "Pontivy", "07242","2424",21);
        Hourly m6 = new Hourly("Tristan", "Lorient", "038442","999",22);

        //création de la liste des membres du staff
        Staff s1 = new Staff();

        //Staff : addNewMember
        s1.addNewMember(m1);
        s1.addNewMember(m2);
        s1.addNewMember(m3);
        s1.addNewMember(m4);
        s1.addNewMember(m5);
        s1.addNewMember(m6);
        
        //afficher tous les membres et leurs informations
        System.out.println(m1.toString() +"\n");
        System.out.println(m2.toString()+ "\n");
        System.out.println(m3.toString()+ "\n");
        System.out.println(m4.toString()+ "\n");
        System.out.println(m5.toString()+ "\n");
        System.out.println(m6.toString()+ "\n");

        //Hourly : addHours, ajoutons des heures à tous les salariés
        m4.addHours(10);
        m5.addHours(2);
        m6.addHours(30);

        //Executive : awardBonus, ajouter un bonus à m3
        m3.awardBonus(100);

        //afficher tous les membres et leurs informations : vérifier le nombre d'heures
        System.out.println("\n" + "-----------------------------------------------" + "\n");
        System.out.println(m1.toString() +"\n");
        System.out.println(m2.toString()+ "\n");
        System.out.println(m3.toString()+ "\n");
        System.out.println(m4.toString()+ "\n");
        System.out.println(m5.toString()+ "\n");
        System.out.println(m6.toString()+ "\n");

        //Staff : payday
        System.out.println("\n" + "-----------------------------------------------" + "\n");
        s1.payday();
    }   
}