package com.example.starfit.FoodData

import androidx.lifecycle.LiveData
import android.os.AsyncTask
import android.os.AsyncTask.execute
import android.os.AsyncTask.execute
import android.os.AsyncTask.execute









class FoodRepository(private val foodDao: FoodDao){

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has change

    val allFood:LiveData<List<Food>> = foodDao.getAllRecords()

    suspend fun insertFeeling(food: Food){
        foodDao.insertFeeling(food)
    }

    suspend fun deleteFeeling(food: Food){
        foodDao.deleteFeeling(food)
    }


}