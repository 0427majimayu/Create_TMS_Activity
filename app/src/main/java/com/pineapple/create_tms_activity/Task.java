package com.pineapple.create_tms_activity;

public class Task {
    public String subName;
    public String time;
    public String textName;
    public String page;
    public String date;

    public Task(){
    }

    public Task(String subName,String time,String textName,String page,String date){
        this.subName = subName;
        this.subName = time;
        this.textName = textName;
        this.page = page;
        this.date = date;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
