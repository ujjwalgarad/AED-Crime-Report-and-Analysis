/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PoliceEnterprise;

import java.util.ArrayList;

/**
 *
 * @author ujjwal
 */
public class SuspectDirectory {
    private ArrayList<Suspect> suspectList;
    
    public SuspectDirectory(){
        suspectList = new ArrayList<>();
    }

    public ArrayList<Suspect> getSuspectList() {
        return suspectList;
    }

    public void setSuspectList(ArrayList<Suspect> suspectList) {
        this.suspectList = suspectList;
    }
    
    public Suspect addSuspect(){
        Suspect s = new Suspect();
        suspectList.add(s);
        return s;
    }
}
