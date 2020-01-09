package com.example.starfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.starfit.Data.UserModel
import com.example.starfit.Data.UsersDBHelper
import kotlinx.android.synthetic.main.create_new_account_1.*
import kotlinx.android.synthetic.main.create_new_account_2.*
import kotlinx.android.synthetic.main.create_new_account_2.buttonNext

class CreateNewAccount2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_new_account_2)



        buttonBack.setOnClickListener {
            val intent = Intent(this, CreateNewAccount1 ::class.java)

            startActivity(intent)
        }
        buttonNext.setOnClickListener {
            val intent = Intent(this, LoginPage ::class.java)

            startActivity(intent)
        }
    }

}
