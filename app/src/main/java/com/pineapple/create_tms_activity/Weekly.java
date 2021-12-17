package com.pineapple.create_tms_activity;

public class Weekly {
    public String date;
    public String time;
    public String scheduleName;

    public Weekly(){
    }

    public Weekly(String date,String time,String scheduleName){
        this.date = date;
        this.time = time;
        this.scheduleName = scheduleName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }
}
