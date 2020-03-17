package com.example.im_test.entity;

import java.util.List;

public class SeachBao {

    /**
     * eventStatus :
     * typeOne :
     * typeTwo :
     * createTime :
     * startTime : 2019-12-07
     * endTime : 2019-12-09
     * transferDepartment :
     */

    private List<String> eventStatus;
    private String typeOne;
    private String typeTwo;
    private String createTime;
    private String startTime;
    private String endTime;
    private String transferDepartment;

    public  List<String> getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus( List<String> eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }

    public String getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTransferDepartment() {
        return transferDepartment;
    }

    public void setTransferDepartment(String transferDepartment) {
        this.transferDepartment = transferDepartment;
    }
}
