package com.pineapple.create_tms_activity

class Weekly {
    val date: String
    val time: String
    val scheduleName: String

    constructor(date: String, time: String, scheduleName: String) {
        this.date = date
        this.time = time
        this.scheduleName = scheduleName
    }
}