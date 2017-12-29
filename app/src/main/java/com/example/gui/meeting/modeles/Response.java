package com.example.gui.meeting.modeles;

/**
 * Created by hm on 29/12/2017.
 */

public class Response {
    protected int iID;
    protected String sResponse;
    protected int iCounter;

    public Response(int iID, String sResponse, int iCounter) {
        this.iID = iID;
        this.sResponse = sResponse;
        this.iCounter = iCounter;
    }

    public Response(String sResponse) {
        this.sResponse = sResponse;
    }

    public int getiID() {
        return iID;
    }

    public void setiID(int iID) {
        this.iID = iID;
    }

    public String getsResponse() {
        return sResponse;
    }

    public void setsResponse(String sResponse) {
        this.sResponse = sResponse;
    }

    public int getiCounter() {
        return iCounter;
    }

    public void setiCounter(int iCounter) {
        this.iCounter = iCounter;
    }
}
