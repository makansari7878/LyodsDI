package com.example.lyodsdi

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {
    fun getWheels(){
        Log.i("mytag", "Wheels provided")
    }
}