/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalProcessorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Hospital.HospitalProcessorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author ujjwal
 */
public class HospitalProcessorRole  extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new HospitalProcessorWorkArea(userProcessContainer, system, account, (HospitalProcessorOrganization)organization, enterprise);
    }
}
