package com.pineapple.create_tms_activity

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

// TODO: data class から open classに変えよう
// TODO: primary key を追加しよう
// @PrimaryKey
// open var id: String = UUID.randomUUID().toString()
open class Task (
    @PrimaryKey
    open var id: String = UUID.randomUUID().toString(),
    open val subName: String,
    open val time: String,
    open val textName: String,
    open val page: String,
    open val date: String

) : RealmObject()

// TODO: RealmObjectを継承しよう

// https://qiita.com/souhei-etou/items/d8a30626ab2c300e4427