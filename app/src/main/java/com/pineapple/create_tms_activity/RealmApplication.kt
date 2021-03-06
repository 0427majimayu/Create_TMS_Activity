package com.pineapple.create_tms_activity

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class RealmApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .allowWritesOnUiThread(true)
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }
}

// TODO: RealmApplicationを作成しよう