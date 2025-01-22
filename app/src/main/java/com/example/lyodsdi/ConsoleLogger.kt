package com.example.lyodsdi

import android.util.Log
import javax.inject.Inject


interface  ILooger{
    fun log(msg: String)
}

class ConsoleLogger @Inject constructor() : ILooger {
    override fun log(msg: String) {
        Log.i("logtag",msg)
    }

}