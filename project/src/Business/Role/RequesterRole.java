/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RequesterOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.AdminRole.AdminWorkAreaJPanel;
import UserInterface.Requester.RequesterWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author ujjwal
 */
public class RequesterRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RequesterWorkArea(userProcessContainer, account, (RequesterOrganization)organization, enterprise, business);
        
    }
}
