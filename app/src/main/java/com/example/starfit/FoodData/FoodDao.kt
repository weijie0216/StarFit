package com.example.starfit.FoodData

import androidx.lifecycle.LiveData
import androidx.room.*
import android.os.AsyncTask



@Dao
interface FoodDao{
    @Insert
    suspend fun insertFeeling(food: Food)

    @Update
    suspend fun updateFeeling(food: Food)

    @Delete
    suspend fun deleteFeeling(food: Food)

    @Query("Select * From feeling")
    fun getAllRecords(): LiveData<List<Food>>

    @Query("Select * From feeling WHERE id = :search_id")
    fun getOneRecord(search_id:Int): Food



}
