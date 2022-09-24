package staff;

/**
*This class contains all methods about StaffMember
*@author Eve-Anne OFFREDI
*/

public abstract class StaffMember{
    /**name*/
    protected String name;
    /**adress*/
    protected String adress;
    /**phone*/ 
    protected String phone;

    /**
     * StaffMember Builder
     * @param eName : name
     * @param eAddress : address
     * @param ePhone : phone number
     */
    public StaffMember(String eName, String eAddress, String ePhone){
        if(eName == null || eAddress == null || ePhone == null){
            System.out.println("Error StaffMember : constructor : paramètres invalides");
            this.name = "";
            this.adress="";
            this.phone="";
        }else{
            this.name=eName;
            this.adress=eAddress;
            this.phone=ePhone;
        }
    }

    /**
     * Returns a string with all the information of a StaffMember
     * @return aff : informations
     */
    public String toString(){
        String saut="\n";
        String aff = "Informations du membre du Staff : " + saut + "nom : " + this.name + saut + "adresse : " + this.adress + saut + "telephone : " + this.phone;
        return aff;
    }

    /**
     * calculate the salary for each type of person
     */
    public abstract double pay();
}