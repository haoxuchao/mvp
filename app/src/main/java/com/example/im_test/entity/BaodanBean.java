package com.example.im_test.entity;

import java.io.Serializable;

public class BaodanBean implements Serializable {

    /**
     * eventName : 1
     * eventType1 : 街面秩序
     * eventType2 : 道路不洁
     * gridName : max
     * createTime : 2019-12-12
     * eventLon : 101.3080578
     * eventLat : 42.34364121
     * eventDistrict : 1
     * eventTown : 1
     * eventStreet : 1
     * eventDesc : 1
     * createFile : http://192.168.23.120/2019/12/06/12/create/0.jpg,http://192.168.23.120/2019/12/06/12/create/1.jpg,
     * transferDepartment : 市容中队
     * transferSuggest : 1
     * transferFile : http://192.168.23.120/2019/12/11/79/trans/0_1576065074280.jpg,
     * handleResult : 333
     * handleFile : null
     * checkSuggest :
     * checkFile : null
     * finishSuggest :
     * finishFile : null
     * eventStatus : 已转办
     */
    private int id;

    private String eventName;
    private String eventType1;
    private String eventType2;
    private String gridName;
    private String createTime;
    private double eventLon;
    private double eventLat;
    private String eventDistrict;
    private String eventTown;
    private String eventStreet;
    private String eventDesc;
    private String createFile;
    private String transferDepartment;
    private String transferSuggest;
    private String transferFile;
    private String handleResult;
    private String handleFile;
    private String checkSuggest;
    private String checkFile;
    private String finishSuggest;
    private String finishFile;
    private String eventStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType1() {
        return eventType1;
    }

    public void setEventType1(String eventType1) {
        this.eventType1 = eventType1;
    }

    public String getEventType2() {
        return eventType2;
    }

    public void setEventType2(String eventType2) {
        this.eventType2 = eventType2;
    }

    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public double getEventLon() {
        return eventLon;
    }

    public void setEventLon(double eventLon) {
        this.eventLon = eventLon;
    }

    public double getEventLat() {
        return eventLat;
    }

    public void setEventLat(double eventLat) {
        this.eventLat = eventLat;
    }

    public String getEventDistrict() {
        return eventDistrict;
    }

    public void setEventDistrict(String eventDistrict) {
        this.eventDistrict = eventDistrict;
    }

    public String getEventTown() {
        return eventTown;
    }

    public void setEventTown(String eventTown) {
        this.eventTown = eventTown;
    }

    public String getEventStreet() {
        return eventStreet;
    }

    public void setEventStreet(String eventStreet) {
        this.eventStreet = eventStreet;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getCreateFile() {
        return createFile;
    }

    public void setCreateFile(String createFile) {
        this.createFile = createFile;
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

    public String getTransferFile() {
        return transferFile;
    }

    public void setTransferFile(String transferFile) {
        this.transferFile = transferFile;
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public String getHandleFile() {
        return handleFile;
    }

    public void setHandleFile(String handleFile) {
        this.handleFile = handleFile;
    }

    public String getCheckSuggest() {
        return checkSuggest;
    }

    public void setCheckSuggest(String checkSuggest) {
        this.checkSuggest = checkSuggest;
    }

    public String getCheckFile() {
        return checkFile;
    }

    public void setCheckFile(String checkFile) {
        this.checkFile = checkFile;
    }

    public String getFinishSuggest() {
        return finishSuggest;
    }

    public void setFinishSuggest(String finishSuggest) {
        this.finishSuggest = finishSuggest;
    }

    public Object getFinishFile() {
        return finishFile;
    }

    public void setFinishFile(String finishFile) {
        this.finishFile = finishFile;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }
}
