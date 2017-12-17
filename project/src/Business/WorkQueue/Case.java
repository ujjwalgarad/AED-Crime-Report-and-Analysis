/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.PoliceEnterprise.Suspect;
import Business.PoliceEnterprise.Victim;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ujjwal
 */
public class Case {

    private String caseNote;
    private String statusReport;
    
    private ArrayList<Suspect> suspectList;
    private ArrayList<Victim> victimList;
    
    
    public Case(){
        suspectList = new ArrayList<>();
        victimList = new ArrayList<>();
    }

    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }
    
    

    public String getCaseNote() {
        return caseNote;
    }

    public void setCaseNote(String caseNote) {
        this.caseNote = caseNote;
    }

    public ArrayList<Suspect> getSuspectList() {
        return suspectList;
    }

    public void setSuspectList(ArrayList<Suspect> suspectList) {
        this.suspectList = suspectList;
    }

    public ArrayList<Victim> getVictimList() {
        return victimList;
    }

    public void setVictimList(ArrayList<Victim> victimList) {
        this.victimList = victimList;
    }
    
    public void addVictim(Victim v){
        victimList.add(v);
    }
    
    public void addSuspect(Suspect s)
    {
        suspectList.add(s);
    }
}
