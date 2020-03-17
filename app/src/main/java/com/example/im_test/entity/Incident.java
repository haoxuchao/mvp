package com.example.im_test.entity;

public class Incident {
    private String Incident_name;//事件名称
    private String big_type;//大分类
    private String small_type;//小分类
    private String location;//经纬度
    private String location_detail;//地址详情
    private String Incident_time;//上报时间
    private String Incident_detail;//事件详情
    private String Incident_reporter;//事件上报/复查
    private String Incident_over;//事件转办/完结
    private String Incident_dispose;// 事件处理人
    private String Incident_imgs;//事件图片
    private String over_opinion;//完结意见
    private String report_opinion;//复查意见
    private String report_imgs;//复查图片
    private String dispose_opinion;//处理意见
    private String dispose_imgs;//处理图片
    private String complaint_unit;//转办单位
    private String complaint_opinion;//转办意见
    private int Incident_stutas;//事件状态

    public Incident(String incident_name, String big_type, String small_type, String location, String location_detail, String incident_time, String incident_detail, String incident_reporter, String incident_imgs,int Incident_stutas) {
        Incident_name = incident_name;
        this.big_type = big_type;
        this.small_type = small_type;
        this.location = location;
        this.location_detail = location_detail;
        Incident_time = incident_time;
        Incident_detail = incident_detail;
        Incident_reporter = incident_reporter;
        Incident_imgs = incident_imgs;
        this.Incident_stutas=Incident_stutas;
    }

    public String getIncident_name() {
        return Incident_name;
    }

    public void setIncident_name(String incident_name) {
        Incident_name = incident_name;
    }

    public String getBig_type() {
        return big_type;
    }

    public void setBig_type(String big_type) {
        this.big_type = big_type;
    }

    public String getSmall_type() {
        return small_type;
    }

    public void setSmall_type(String small_type) {
        this.small_type = small_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation_detail() {
        return location_detail;
    }

    public void setLocation_detail(String location_detail) {
        this.location_detail = location_detail;
    }

    public String getIncident_time() {
        return Incident_time;
    }

    public void setIncident_time(String incident_time) {
        Incident_time = incident_time;
    }

    public String getIncident_detail() {
        return Incident_detail;
    }

    public void setIncident_detail(String incident_detail) {
        Incident_detail = incident_detail;
    }

    public String getIncident_reporter() {
        return Incident_reporter;
    }

    public void setIncident_reporter(String incident_reporter) {
        Incident_reporter = incident_reporter;
    }

    public String getIncident_over() {
        return Incident_over;
    }

    public void setIncident_over(String incident_over) {
        Incident_over = incident_over;
    }

    public String getIncident_dispose() {
        return Incident_dispose;
    }

    public void setIncident_dispose(String incident_dispose) {
        Incident_dispose = incident_dispose;
    }

    public String getIncident_imgs() {
        return Incident_imgs;
    }

    public void setIncident_imgs(String incident_imgs) {
        Incident_imgs = incident_imgs;
    }

    public String getOver_opinion() {
        return over_opinion;
    }

    public void setOver_opinion(String over_opinion) {
        this.over_opinion = over_opinion;
    }

    public String getReport_opinion() {
        return report_opinion;
    }

    public void setReport_opinion(String report_opinion) {
        this.report_opinion = report_opinion;
    }

    public String getReport_imgs() {
        return report_imgs;
    }

    public void setReport_imgs(String report_imgs) {
        this.report_imgs = report_imgs;
    }

    public String getDispose_opinion() {
        return dispose_opinion;
    }

    public void setDispose_opinion(String dispose_opinion) {
        this.dispose_opinion = dispose_opinion;
    }

    public String getDispose_imgs() {
        return dispose_imgs;
    }

    public void setDispose_imgs(String dispose_imgs) {
        this.dispose_imgs = dispose_imgs;
    }

    public String getComplaint_unit() {
        return complaint_unit;
    }

    public void setComplaint_unit(String complaint_unit) {
        this.complaint_unit = complaint_unit;
    }

    public String getComplaint_opinion() {
        return complaint_opinion;
    }

    public void setComplaint_opinion(String complaint_opinion) {
        this.complaint_opinion = complaint_opinion;
    }

    public int getIncident_stutas() {
        return Incident_stutas;
    }

    public void setIncident_stutas(int incident_stutas) {
        Incident_stutas = incident_stutas;
    }

}
