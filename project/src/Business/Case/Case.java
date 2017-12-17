/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Case;

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
    private String caseDetails;
    private ArrayList<Suspect> suspectList;
    private ArrayList<Victim> victimList;
    private int caseId;
    private String reportingAddress;
    private Date crimeDate;
    
    public enum Type{
        Rape("Rape"),
        Murder("Murder"),
        BankRobbery("Bank Robbery"),
        Gunshot("Gunshots Heard"),
        Fraud("Fraud"),
        HostageSituation("Hostage Situation"),
        TrafficAccident("Traffic Accident"),
        PropertyMissing("Property Missing"),
        Burglary("Burglary or Theft");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum Status{
        AwaitingResponse("Awaiting Response from Police"),
        WithPoliceDept("Under Police Dept"),
        WithHospitalDept("Under Hospital Dept"),
        WithFFDept("Under Firefighter Dept"),
        Closed("Case Closed"),
        Cancelled("Cancelled by Police Dept"),
        NeedsThoroughInvestigation("Needs Thorough Investigation");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Case(){
        suspectList = new ArrayList<>();
        victimList = new ArrayList<>();
    }

    public String getCaseNote() {
        return caseNote;
    }

    public void setCaseNote(String caseNote) {
        this.caseNote = caseNote;
    }

    public String getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(String caseDetails) {
        this.caseDetails = caseDetails;
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

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getReportingAddress() {
        return reportingAddress;
    }

    public void setReportingAddress(String reportingAddress) {
        this.reportingAddress = reportingAddress;
    }

    public Date getCrimeDate() {
        return crimeDate;
    }

    public void setCrimeDate(Date crimeDate) {
        this.crimeDate = crimeDate;
    }
    
    
}
