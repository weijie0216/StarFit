package com.example.starfit.Data

import android.provider.BaseColumns

object DBContract {

    /* Inner class that defines the table contents */
    class UserEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "users"
            val COLUMN_NAME = "name"
            val COLUMN_EMAIL = "email"
            val COLUMN_PASSWORD = "password"
        }
    }
}