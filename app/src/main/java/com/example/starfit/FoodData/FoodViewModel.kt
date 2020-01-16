package com.example.starfit.FoodData

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class FoodViewModel (application: Application):AndroidViewModel(application){
    // The ViewModel maintains a reference to the repository to get data.
    private val repository: FoodRepository


    val allFeelings : LiveData<List<Food>>

    init{
        // Gets reference to WordDao from WordRoomDatabase to construct
        // the correct WordRepository.
        val foodDao:FoodDao = FoodDatabase.getDatabase(application).feelingDao()
        repository = FoodRepository(foodDao)
        allFeelings = repository.allFood
    }

    fun insertFeeling(food:Food) = viewModelScope.launch {
        repository.insertFeeling(food)
    }

    fun deleteFeeling(food: Food) = viewModelScope.launch {
        repository.deleteFeeling(food)
    }

}