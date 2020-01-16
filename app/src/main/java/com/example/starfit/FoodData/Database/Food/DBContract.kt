package com.example.starfit.FoodData.Database.Food

import android.provider.BaseColumns

object DBContract {

    /* Inner class that defines the table contents */
    class FoodEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "food"
            val COLUMN_DATE = "Date"
            val COLUMN_FOODCALORIES = "Calories"
        }
    }



}