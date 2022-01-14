package com.pineapple.create_tms_activity

class Weekly {
    val date: String
    val startTime: String
    val endTime: String
    val scheduleName: String

    constructor(date: String, startTime: String, endTime: String, scheduleName: String) {
        this.date = date
        this.startTime = startTime
        this.endTime = endTime
        this.scheduleName = scheduleName
    }
}