package com.example.im_test.entity;

public class ImgResponse {

    /**
     * id : 12
     * eventName : 1
     * eventType1 : 街面秩序
     * eventType2 : 占道经营
     * gridName : 1
     * createTime : 2019-12-06
     * eventLon : -0.7514952
     * eventLat : 46.001457
     * eventDistrict : 1
     * eventTown : 1
     * eventStreet : 1
     * eventDesc : 1
     * createFile : http://192.168.23.120/2019/12/06/12/create/0.jpg,http://192.168.23.120/2019/12/06/12/create/1.jpg,
     * transferDepartment : 交通局
     * transferSuggest : 1
     * transferFile : null
     * handleResult : 111
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
    private Object transferFile;
    private String handleResult;
    private Object handleFile;
    private String checkSuggest;
    private Object checkFile;
    private String finishSuggest;
    private Object finishFile;
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

    public Object getTransferFile() {
        return transferFile;
    }

    public void setTransferFile(Object transferFile) {
        this.transferFile = transferFile;
    }

    public String getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public Object getHandleFile() {
        return handleFile;
    }

    public void setHandleFile(Object handleFile) {
        this.handleFile = handleFile;
    }

    public String getCheckSuggest() {
        return checkSuggest;
    }

    public void setCheckSuggest(String checkSuggest) {
        this.checkSuggest = checkSuggest;
    }

    public Object getCheckFile() {
        return checkFile;
    }

    public void setCheckFile(Object checkFile) {
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

    public void setFinishFile(Object finishFile) {
        this.finishFile = finishFile;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }
}
