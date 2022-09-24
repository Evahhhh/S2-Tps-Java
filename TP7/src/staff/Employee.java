package staff;

/**
*This class contains all methods about Employee
*@author Eve-Anne OFFREDI
*/
public class Employee extends StaffMember{
    /**social security number */
    protected String socialSecurityNumber;
    /**pay rate */
    protected double payRate;

    /**
     * Employee Builder
     * @param eName : name
     * @param eAddress : address
     * @param ePhone : phone number
     * @param socSecNumber : social security number
     * @param rate : pay rate
     */
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone);
        if(socSecNumber == null || socSecNumber.equals("")){
            System.out.println("Error Employee : constructor : paramètre socSecNumber invalide");
            this.socialSecurityNumber="";
            this.payRate=0.0;
        }else if(rate<=0){
            this.socialSecurityNumber="";
            this.payRate=0;
        }else{
            this.socialSecurityNumber=socSecNumber;
            this.payRate=rate;
        }
    }

    /**
     * Returns a string with all the information of an Employee
     * @return aff : informations
     */
    public String toString(){
        String saut = "\n";
        String aff = super.toString();
        aff = aff + saut + "numero de securite sociale : " + this.socialSecurityNumber + saut + "Salaire : " + this.payRate;
        return aff;
    }

    /**
     *  defines a base rate for salary
     * @return salary
     */
    public double pay(){
        return this.payRate;
    }
}