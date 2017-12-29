package com.example.gui.meeting.modeles;

/**
 * Created by hm on 29/12/2017.
 */

public class Users {
    protected int iID;
    protected String sName;
    protected String sFirstName;
    protected String sStatus;

    public Users(int iID, String sName, String sFirstName, String sStatus) {
        this.iID = iID;
        this.sName = sName;
        this.sFirstName = sFirstName;
        this.sStatus = sStatus;
    }

    public Users() {
    }

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsStatus() {
        return sStatus;
    }

    public void setsStatus(String sStatus) {
        this.sStatus = sStatus;
    }
}
