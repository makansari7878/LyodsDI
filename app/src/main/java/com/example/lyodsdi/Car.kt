package com.example.lyodsdi

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private  var  engine:
                              Engine, private var wheels: Wheels){

    fun getCar(){
        engine.getEngine()
        wheels.getWheels()
        Log.i("mytag", "car is running")
    }
}