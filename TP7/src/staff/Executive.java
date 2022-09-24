package staff;

/**
*This class contains all methods about Executive
*@author Eve-Anne OFFREDI
*/

public class Executive extends Employee{
    /**bonus */
    private double bonus;

    /**
     * Executive Builder
     * @param eName : name
     * @param eAddress : address
     * @param ePhone : phone number
     * @param socSecNumber : social security number
     * @param rate : pay rate
     */
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    /**
     * Defines the bonus to which he is entitled on his salary
     * @param execBonus : the bonus
     */
    public void awardBonus(double execBonus){
        if(execBonus <= 0){
            System.out.println("Error Executive : awardBonus : bonus négatif ou égal à 0");
            this.bonus = 0.0;
        }else this.bonus=execBonus;
    }

    /**
     * Calculates his salary which is the prime rate plus the bonus.
     */
    public double pay(){
        double pay = super.payRate + this.bonus;
        this.bonus = 0;
        return pay;
    }
}