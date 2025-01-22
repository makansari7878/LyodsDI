package com.example.lyodsdi

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor () {
    fun getEngine(){
        Log.i("mytag", "Engine provided")
    }
}