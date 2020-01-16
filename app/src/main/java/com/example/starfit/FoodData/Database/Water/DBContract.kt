package com.example.starfit.FoodData.Database.Water


import android.provider.BaseColumns

object DBContract {

    /* Inner class that defines the table contents */
    class VolumeEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "water"
            val COLUMN_DATE = "Date"
            val COLUMN_Volume = "Volume"
        }
    }



}