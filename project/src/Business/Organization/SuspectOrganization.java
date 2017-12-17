/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SuspectRole;
import java.util.ArrayList;

/**
 *
 * @author ujjwal
 */
public class SuspectOrganization extends Organization{
    
    public SuspectOrganization() {
        super(Organization.Type.SuspectOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SuspectRole());
        return roles;
    }
}
