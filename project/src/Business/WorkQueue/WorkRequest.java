/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.PoliceEnterprise.Suspect;
import Business.PoliceEnterprise.Victim;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ujjwal
 */
public class WorkRequest {

    private String caseDetails;
    private UserAccount sender;
    private UserAccount receiver;
    private int workReqId;
    private String reportingAddress;
    private Date crimeDate;
    private Date resolveDate;
    private String crimeType;
    private String caseSatus;
    private Case crimeCase;
    private String remarkHosp;
    private String remarkFF;
    private String msgHosp;
    private String msgFF;
    private String msgDeptHead;
    private String remarkDeptHead;
    //private String statusReport;

    
    public WorkRequest(){
        this.crimeCase = new Case();
        this.workReqId = WorkQueue.workReqCounter;
        WorkQueue.workReqCounter = WorkQueue.workReqCounter +1;
    }

/*    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }*/
    
    

    public String getMsgDeptHead() {
        return msgDeptHead;
    }

    public void setMsgDeptHead(String msgDeptHead) {
        this.msgDeptHead = msgDeptHead;
    }

    public String getRemarkDeptHead() {
        return remarkDeptHead;
    }

    public void setRemarkDeptHead(String remarkDeptHead) {
        this.remarkDeptHead = remarkDeptHead;
    }
    
    

    public String getRemarkHosp() {
        return remarkHosp;
    }

    public void setRemarkHosp(String remarkHosp) {
        this.remarkHosp = remarkHosp;
    }

    public String getRemarkFF() {
        return remarkFF;
    }

    public void setRemarkFF(String remarkFF) {
        this.remarkFF = remarkFF;
    }

    public String getMsgHosp() {
        return msgHosp;
    }

    public void setMsgHosp(String msgHosp) {
        this.msgHosp = msgHosp;
    }

    public String getMsgFF() {
        return msgFF;
    }

    public void setMsgFF(String msgFF) {
        this.msgFF = msgFF;
    }
    
    
    public Case getCrimeCase() {
        return crimeCase;
    }

    public void setCrimeCase(Case crimeCase) {
        this.crimeCase = crimeCase;
    }
    
    
    public enum Type{
        Rape("Rape"),
        Murder("Murder"),
        BankRobbery("BankRobbery"),
        Gunshot("Gunshot"),
        Fraud("Fraud"),
        HostageSituation("HostageSituation"),
        TrafficAccident("TrafficAccident"),
        PropertyMissing("PropertyMissing"),
        Burglary("Burglary");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum Status{
        AwaitingResponse("AwaitingResponse"),
        WithPoliceDept("WithPoliceDept"),
        //WithHospitalDept("Under Hospital Dept"),
        //WithFFDept("Under Firefighter Dept"),
        WithDeptHead("WithDeptHead"),
        Closed("Closed"),
        Cancelled("Cancelled"),
        NeedsThoroughInvestigation("NeedsThoroughInvestigation");
        
        private String value;
        private Status(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getCaseSatus() {
        return caseSatus;
    }

    public void setCaseSatus(String caseSatus) {
        this.caseSatus = caseSatus;
    }

    
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public int getWorkReqId() {
        return workReqId;
    }

    public void setWorkReqId(int workReqId) {
        this.workReqId = workReqId;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    

    public String getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(String caseDetails) {
        this.caseDetails = caseDetails;
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

    @Override
    public String toString() {
        return String.valueOf(workReqId);
    }
    
    
}
