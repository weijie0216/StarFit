package com.example.starfit.Water

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import com.example.starfit.R
import kotlinx.android.synthetic.main.record_water.*
import android.view.animation.DecelerateInterpolator
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import java.lang.Integer.parseInt


class RecordWater : AppCompatActivity() {



    //module-level variable

    private var like : Int = 0
    private var totalwater : Int = 3000
    private var progressWater : Double = 0.0
    //Declare an instance of the SharedPref
    private lateinit var sharedPreferences: SharedPreferences



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.record_water)



        textViewTotalAmount.text = totalwater.toString()


            //initialize the shared Pref
            sharedPreferences = getPreferences(Context.MODE_PRIVATE)

            TextViewIncrease.text = like.toString()
            imageViewAdd.setOnClickListener() {
                like += 100;
                TextViewIncrease.text = like.toString()
            }
            imageViewRemove.setOnClickListener() {
                like -= 100;
                if (like < 0) {
                    like = 0
                }
                TextViewIncrease.text = like.toString()
            }

        // Set a click listener for button widget
        buttonSubmit.setOnClickListener{

            // Variable to hold progress status
            var progressStatus = 0;
            textViewInputWaterAmount.text = like.toString()
            progressWater = (like.toDouble()/totalwater.toDouble()) *100

            // Initialize a new Handler instance
            val handler: Handler = Handler()

            // Start the lengthy operation in a background thread
            Thread(Runnable {
                while (progressStatus < progressWater) {
                    // Update the progress status
                    progressStatus += 1

                    // Try to sleep the thread for 50 milliseconds
                    try {
                        Thread.sleep(50)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                    // Update the progress bar

                    handler.post(Runnable {
                        progressBar.progress = progressStatus

                        // Show the progress on text view
                        textViewDisplay.text = progressStatus.toString()
                    })
                }
            }).start() // Start the operation
        }


        Log.d("RecordWater", "OnCreate")


    }


    override fun onStart() {
        Log.d("RecordWater", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("RecordWater", "onResume")
        //Retrieve the Shared Pref
        like = sharedPreferences.getInt(getString(R.string.Increase), 0)

        TextViewIncrease.text = like.toString()
        super.onResume()
    }

    override fun onStop() {
        Log.d("RecordWater", "OnStop")
        super.onStop()
    }

    override fun onPause() {
        Log.d("RecordWater", "OnPause")
        with(sharedPreferences.edit()) {
            putInt(getString(R.string.Increase), like)
            apply()
            // or commit()

        }
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("RecordWater", "OnDestroy")

        super.onDestroy()
    }
}


