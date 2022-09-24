package staff;

/**
*This class contains all methods about Volunteer
*@author Eve-Anne OFFREDI
*/

public class Volunteer extends StaffMember{
    
    /**
     * Volunteer Builder
     * @param eName : name
     * @param eAddress : address
     * @param ePhone : phone number
     */
    public Volunteer(String eName,String eAddress,String ePhone){
        super(eName,eAddress,ePhone);
    }

    /**
     * Puts the salary at 0
     * @return the salary
     */
    public double pay(){
        return 0.0;
    }
}