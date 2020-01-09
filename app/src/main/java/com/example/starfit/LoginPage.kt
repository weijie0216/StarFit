package com.example.starfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import com.example.starfit.Data.UsersDBHelper
import com.example.starfit.FoodData.FoodMainActivity
import kotlinx.android.synthetic.main.login_page.*
import kotlinx.android.synthetic.main.login_page.editTextEmail


class LoginPage : AppCompatActivity() {

    lateinit var usersDBHelper : UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        usersDBHelper = UsersDBHelper(this)

        buttonLogin.setOnClickListener{
            val email = editTextEmail.text.toString()

            if(usersDBHelper.readUser(email = email).isNotEmpty()){
                val intent = Intent(this, com.example.starfit.HomeFragment ::class.java)

                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Invalid Email or Password",Toast.LENGTH_LONG).show()
            }



        }


        buttonCreateNewAcc.setOnClickListener{

            val intent = Intent(this, CreateNewAccount1 ::class.java)

            startActivity(intent)
        }

        textViewForgotPassword.setOnClickListener{

            val intent = Intent(this, FoodMainActivity::class.java)

            startActivity(intent)
        }
    }
}
