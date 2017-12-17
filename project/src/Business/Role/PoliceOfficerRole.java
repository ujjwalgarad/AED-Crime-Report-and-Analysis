/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PoliceOfficerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PoliceOfficer.PoliceOfficerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author ujjwal
 */
public class PoliceOfficerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PoliceOfficerWorkArea(userProcessContainer, system, account, (PoliceOfficerOrganization)organization, enterprise);
    }
    
}
