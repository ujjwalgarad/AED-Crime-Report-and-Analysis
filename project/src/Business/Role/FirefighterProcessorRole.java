/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FirefighterProcessorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FireFighter.FirefighterProcessorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author ujjwal
 */
public class FirefighterProcessorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new FirefighterProcessorWorkArea(userProcessContainer, system, account, (FirefighterProcessorOrganization)organization, enterprise);
    }
    
}
