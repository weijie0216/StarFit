package com.example.starfit

import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.record_activity.*

class RecordActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.record_activity)

        mapView.setOnClickListener(){
            val intent = Intent(this, MapsActivity ::class.java)

            startActivity(intent)
        }

    var stoptime : Long = 0
    buttonStart.setOnClickListener(){
        chronometer.base = SystemClock.elapsedRealtime() + stoptime
        chronometer.start()
        buttonStart.visibility = View.GONE
        buttonPause.visibility = View.VISIBLE
    }
        buttonPause.setOnClickListener(){
            stoptime = chronometer.base - SystemClock.elapsedRealtime()
            chronometer.stop()
            buttonPause.visibility = View.GONE
            buttonStart.visibility = View.VISIBLE
        }
        buttonReset.setOnClickListener(){
            chronometer.base = SystemClock.elapsedRealtime()
            stoptime = 0
            chronometer.stop()
            buttonPause.visibility = View.GONE
            buttonStart.visibility = View.VISIBLE
        }
    }

}
