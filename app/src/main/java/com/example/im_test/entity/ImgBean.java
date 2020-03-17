package com.example.im_test.entity;

public class ImgBean {

    /**
     * id : 12
     * eventStatus : 已转办
     * transferDepartment : 交通局
     * transferSuggest :
     * handleResult :
     * checkSuggest :
     * finishSuggest :
     */

    private int id;
    private String eventStatus;
    private String transferDepartment;
    private String transferSuggest;
    private String handleResult;
    private String checkSuggest;
    private String finishSuggest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getTransferDepartment() {
        return transferDepartment;
    }

    public void setTransferDepartment(String transferDepartment) {
        this.transferDepartment = transferDepartment;
    }

    public String getTransferSuggest() {
        return transferSuggest;
    }

    public void setTransferSuggest(String transferSuggest) {
        this.transferSuggest = transferSuggest;
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public String getCheckSuggest() {
        return checkSuggest;
    }

    public void setCheckSuggest(String checkSuggest) {
        this.checkSuggest = checkSuggest;
    }

    public String getFinishSuggest() {
        return finishSuggest;
    }

    public void setFinishSuggest(String finishSuggest) {
        this.finishSuggest = finishSuggest;
    }
}
