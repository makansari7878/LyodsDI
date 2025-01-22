package com.example.lyodsdi

import android.util.Log
import javax.inject.Inject


class ConsoleLogger @Inject constructor() {

    fun log(msg : String){
        Log.i("logtag",msg)
    }
}