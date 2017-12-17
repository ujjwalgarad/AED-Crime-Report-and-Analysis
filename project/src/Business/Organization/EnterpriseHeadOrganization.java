/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeptHeadRole;
import Business.Role.EnterpriseHeadRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ujjwal.garad
 */
public class EnterpriseHeadOrganization extends Organization{
    public EnterpriseHeadOrganization(){
        super(Organization.Type.EnterpriseHeadOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnterpriseHeadRole());
        return roles;
    }
}
