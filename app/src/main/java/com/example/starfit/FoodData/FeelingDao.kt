package com.example.starfit.FoodData

import android.renderscript.Sampler
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FeelingDao{
    @Insert
    suspend fun insertFeeling(feeling: Feeling)

    @Update
    suspend fun updateFeeling(feeling: Feeling)

    @Delete
    suspend fun deleteFeeling(feeling: Feeling)


    @Query("Select * From feeling")
    fun getAllRecords(): LiveData<List<Feeling>>

    @Query("Select * From feeling WHERE id = :search_id")
    fun getOneRecord(search_id:Int): Feeling
}
