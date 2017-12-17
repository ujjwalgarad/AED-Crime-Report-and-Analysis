/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RequesterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ujjwal
 */
public class RequesterOrganization extends Organization{
    
    public RequesterOrganization() {
        super(Organization.Type.RequesterOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RequesterRole());
        return roles;
    }
}
