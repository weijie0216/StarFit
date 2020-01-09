package com.example.starfit.Data

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.starfit.R
import kotlinx.android.synthetic.main.show_data.*

class ShowData : AppCompatActivity() {

    lateinit var usersDBHelper : UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_data)

        usersDBHelper = UsersDBHelper(this)
    }


}