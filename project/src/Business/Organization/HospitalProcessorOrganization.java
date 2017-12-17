/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalProcessorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ujjwal
 */
public class HospitalProcessorOrganization extends Organization{
    
    public HospitalProcessorOrganization() {
        super(Organization.Type.HospitalProcessorOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalProcessorRole());
        return roles;
    }
}
