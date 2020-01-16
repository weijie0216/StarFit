package com.example.starfit.Data.UserData

import android.provider.BaseColumns

object DBContract {
    class UserEntry : BaseColumns{
        companion object {
            val TABLE_NAME = "users"
            val COLUMN_NAME = "name"
            val COLUMN_EMAIL = "email"
            val COLUMN_PASSWORD = "password"
        }
    }
}