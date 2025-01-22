package com.example.lyodsdi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

//    @Inject
//    lateinit var  logger: ConsoleLogger

    @Inject
    lateinit var iLooger : ILooger


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.getCar()

      //  logger.log("Hello Ansari")

        iLooger.log("ITS FROM INTERFACE")


    }
}