/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.RequesterOrg.getValue())){
            organization = new RequesterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PoliceOfficerOrg.getValue())){
            organization = new PoliceOfficerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalProcessorOrg.getValue())){
            organization = new HospitalProcessorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FireFighterProcessorOrg.getValue())){
            organization = new FirefighterProcessorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.EnterpriseHeadOrg.getValue())){
            organization = new EnterpriseHeadOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}