/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
       
        
        int longitude = (int) Math.ceil(Math.random()*100);
        int lattitude = (int) Math.ceil(Math.random()*100);
        userAccount.getCurrentLocation().setLocationX(longitude);
        userAccount.getCurrentLocation().setLocationY(lattitude);
        
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username, EcoSystem system){

        for(Network n : system.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                for (UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
                   if (ua.getUsername().equals(username))
                        return false;
                    else{
                       for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                           for(UserAccount account : o.getUserAccountDirectory().getUserAccountList()){
                               if (account.getUsername().equals(username))
                                    return false;
                               
                       }
                   }
            }
        }
    }
}
        return true;
}
}
