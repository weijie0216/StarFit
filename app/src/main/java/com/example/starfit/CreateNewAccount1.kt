package com.example.starfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.starfit.Data.UserModel
import com.example.starfit.Data.UsersDBHelper
import kotlinx.android.synthetic.main.create_new_account_1.*

class CreateNewAccount1 : AppCompatActivity() {

    lateinit var usersDBHelper : UsersDBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_new_account_1)

        usersDBHelper = UsersDBHelper(this)


        buttonNext.setOnClickListener{
            var name = this.editTextFirstName.text.toString()
            var email = this.editTextEmail.text.toString()
            var password = this.editTextPassword.text.toString()
            var result = usersDBHelper.insertUser(UserModel(name = name,email = email,Password = password))
            //clear all edittext s
            this.editTextPassword.setText("")
            this.editTextEmail.setText("")
            this.editTextFirstName.setText("")
            Toast.makeText(this,result.toString(), Toast.LENGTH_LONG).show()
            this.textview_result.text = "Added user : "+result
            val intent = Intent(this, CreateNewAccount2 ::class.java)

            startActivity(intent)
        }
    }



}
