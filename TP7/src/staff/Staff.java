package staff;
import java.util.ArrayList;

/**
*This class contains all methods about Staff
*@author Eve-Anne OFFREDI
*/

public class Staff{
    /**all staff members */
    private ArrayList<StaffMember> staffList;

    /**
     * Staff Builder
     */
    public Staff(){
        this.staffList = new ArrayList<StaffMember>();
    }

    /**
     *  Add new staff
     * @param member : staffmember to add
     */
    public void addNewMember(StaffMember member){
        if(member == null) System.out.println("Error Staff : addNewMember : paramètre member null");
        else this.staffList.add(member);
    }

    /**
     * Get the reference of a staff if we know its index in the list
     * @param index : index 
     * @return the StaffMember you ask for
     */
    public StaffMember getMember(int index){
        return this.staffList.get(index);
    }

    /**
     * Realizes the payment of all the personnel
     */
    public void payday(){
        for(StaffMember member : staffList){
            //afficher les infos du membre
            System.out.println(member.toString());
            //récupérer le montant de sa paye 
            double salary = member.pay();
            
            //imprimer les infos du salaire, thanks si c'est un bénévole/donc salaire est de 0
            if(salary == 0) System.out.println("Thanks ! ");
            else System.out.println("Paid : " + salary);

            System.out.println("------------------------------------");
        }
    }
}