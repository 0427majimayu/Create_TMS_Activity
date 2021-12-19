package com.pineapple.create_tms_activity

class Task {
    val subName: String
    val time: String
    val textName: String
    val page: String
    val date: String

    constructor(subName: String, time: String, textName: String, page: String, date: String) {
        this.subName = subName
        this.time = time
        this.textName = textName
        this.page = page
        this.date = date
    }


}
