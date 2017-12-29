package com.example.gui.meeting.modeles;

/**
 * Created by hm on 29/12/2017.
 */

public class Meet {
    protected int iID;
    protected String sTitle;
    protected String sSubject;
    protected String sDate;
    protected int iHours;
    protected int iDuration;

    public Meet(int iID, String sTitle, String sSubject, String sDate, int iHours, int iDuration) {
        this.iID = iID;
        this.sTitle = sTitle;
        this.sSubject = sSubject;
        this.sDate = sDate;
        this.iHours = iHours;
        this.iDuration = iDuration;
    }

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public String getsSubject() {
        return sSubject;
    }

    public void setsSubject(String sSubject) {
        this.sSubject = sSubject;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public int getiHours() {
        return iHours;
    }

    public void setiHours(int iHours) {
        this.iHours = iHours;
    }

    public int getiDuration() {
        return iDuration;
    }

    public void setiDuration(int iDuration) {
        this.iDuration = iDuration;
    }
}
