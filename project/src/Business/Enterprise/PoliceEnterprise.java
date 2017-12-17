/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.PoliceEnterprise.SuspectDirectory;
import Business.PoliceEnterprise.VictimDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ujjwal
 */
public class PoliceEnterprise extends Enterprise{
    
    private VictimDirectory victimDirectory;
    private SuspectDirectory suspectDirectory;
    
    public PoliceEnterprise(String name) {
        super(name, EnterpriseType.Police);
        victimDirectory = new VictimDirectory();
        suspectDirectory = new SuspectDirectory();
    }

    public VictimDirectory getVictimDirectory() {
        return victimDirectory;
    }

    public void setVictimDirectory(VictimDirectory victimDirectory) {
        this.victimDirectory = victimDirectory;
    }

    public SuspectDirectory getSuspectDirectory() {
        return suspectDirectory;
    }

    public void setSuspectDirectory(SuspectDirectory suspectDirectory) {
        this.suspectDirectory = suspectDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}