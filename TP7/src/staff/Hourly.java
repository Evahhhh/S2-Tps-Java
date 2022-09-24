package staff;

/**
*This class contains all methods about Hourly
*@author Eve-Anne OFFREDI
*/

public class Hourly extends Employee{
    /** number of hours worked */
    private int hoursWorked;

    /**
     * Hourly Builder
     * @param eName : name
     * @param eAddress : address
     * @param ePhone : phone number
     * @param socSecNumber : social security number
     * @param rate : pay rate
     */
    public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    /**
     * Defines the number of hours worked
     * @param moreHours : number of hours to add
     */
    public void addHours(int moreHours){
        if(moreHours <= 0) System.out.println("Error Hourly : constructor : paramètre moreHours plus petit ou égal à 0");
        else this.hoursWorked= this.hoursWorked + moreHours;
    }

    /**
     * Calculates the salary which is the basic rate multiplied by the number of hours worked
     * @return salary : salary of the employee
     */
    public double pay(){
        double salary = super.payRate*this.hoursWorked;
        this.hoursWorked = 0;
        return salary;
    }

    /**
     * Returns a string with all the information of a Hourly
     * @return aff : informations
     */
    public String toString(){
        String saut = "\n";
        String aff = super.toString();
        aff = aff + saut + "Nombre d'heures : " + this.hoursWorked;
        return aff;
    }
}