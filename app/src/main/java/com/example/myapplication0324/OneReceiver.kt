package com.example.myapplication0324

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class OneReceiver : BroadcastReceiver() {

    //브로드 캐스트 메세지 전달오면 실행하는 콜백함수
    override fun onReceive(context: Context, intent: Intent) {
        Log.e("OneReceiver","메세지를 보내왔습니다.")
    }
}