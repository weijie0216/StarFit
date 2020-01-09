package com.example.starfit.FoodData

import androidx.lifecycle.LiveData
import com.example.starfit.FoodData.Feeling

class FeelingRepository(private val feelingDao: FeelingDao){

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has change

    val allFeeling:LiveData<List<Feeling>> = feelingDao.getAllRecords()

    suspend fun insertFeeling(feeling: Feeling){
        feelingDao.insertFeeling(feeling)
    }





}