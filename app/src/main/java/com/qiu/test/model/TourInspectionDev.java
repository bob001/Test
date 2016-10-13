package com.qiu.test.model;

/**
 * Created by lenovo on 2016/10/7.
 */

public class TourInspectionDev {
    private int id;
    private String devId;
    private String devName;
    private String devType;
    private String location;
    private String pretourKey;
    private String remarks;
    private int taskId;//外键
    //回填信息
    private String tourDate;
    private String tourPerson;
    private String tourKey;
    private String tourEnd;
    private String tourRemarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPretourKey() {
        return pretourKey;
    }

    public void setPretourKey(String pretourKey) {
        this.pretourKey = pretourKey;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTourDate() {
        return tourDate;
    }

    public void setTourDate(String tourDate) {
        this.tourDate = tourDate;
    }

    public String getTourPerson() {
        return tourPerson;
    }

    public void setTourPerson(String tourPerson) {
        this.tourPerson = tourPerson;
    }

    public String getTourKey() {
        return tourKey;
    }

    public void setTourKey(String tourKey) {
        this.tourKey = tourKey;
    }

    public String getTourEnd() {
        return tourEnd;
    }

    public void setTourEnd(String tourEnd) {
        this.tourEnd = tourEnd;
    }

    public String getTourRemarks() {
        return tourRemarks;
    }

    public void setTourRemarks(String tourRemarks) {
        this.tourRemarks = tourRemarks;
    }
}
