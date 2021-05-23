package com.example.applicationnotification

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService


class MyFireMessagingServiceId : FirebaseMessagingService() {

    override fun onNewToken(p0: String) {

        Log.i("**newTokenService", FirebaseMessaging.getInstance().token.toString())
    }
}