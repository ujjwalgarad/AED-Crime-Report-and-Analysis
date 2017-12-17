/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeptHeadRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ujjwal
 */
public class DeptHeadOrganization extends Organization{
    
    public DeptHeadOrganization() {
        super(Organization.Type.DeptHeadOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DeptHeadRole());
        return roles;
    }
}
