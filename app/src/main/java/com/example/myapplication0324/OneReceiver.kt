package com.example.myapplication0324

import android.app.NotificationManager
import android.app.RemoteInput
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class OneReceiver : BroadcastReceiver() {

    //브로드 캐스트 메세지 전달오면 실행하는 콜백함수
    override fun onReceive(context: Context, intent: Intent) {
        val reply_text = RemoteInput.getResultsFromIntent(intent)?.getCharSequence("kjs_noti_reply")
        Log.e("OneReceiver", "알림창에서 전달한 메세지 ${reply_text}")

        val manager = context.getSystemService(AppCompatActivity.NOTIFICATION_SERVICE) as NotificationManager
        manager.cancel(11)
    }
}