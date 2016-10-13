package com.qiu.test.model;

/**
 * Created by lenovo on 2016/10/7.
 */

public class TourInspectionTask {
    private int id;
    private String category;
    private String writePerson;
    private String execPerson;
    private String execDate;
    private int state_backfill;
    private String dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWritePerson() {
        return writePerson;
    }

    public void setWritePerson(String writePerson) {
        this.writePerson = writePerson;
    }

    public String getExecPerson() {
        return execPerson;
    }

    public void setExecPerson(String execPerson) {
        this.execPerson = execPerson;
    }

    public String getExecDate() {
        return execDate;
    }

    public void setExecDate(String execDate) {
        this.execDate = execDate;
    }

    public int getState_backfill() {
        return state_backfill;
    }

    public void setState_backfill(int state_backfill) {
        this.state_backfill = state_backfill;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
