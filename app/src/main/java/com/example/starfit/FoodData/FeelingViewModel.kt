package com.example.starfit.FoodData

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class FeelingViewModel (application: Application):AndroidViewModel(application){
    // The ViewModel maintains a reference to the repository to get data.
    private val repository: FeelingRepository


    val allFeelings : LiveData<List<Feeling>>

    init{
        // Gets reference to WordDao from WordRoomDatabase to construct
        // the correct WordRepository.
        val feelingDao:FeelingDao = FeelingDatabase.getDatabase(application).feelingDao()
        repository = FeelingRepository(feelingDao)
        allFeelings = repository.allFeeling
    }

    fun insertFeeling(feeling:Feeling) = viewModelScope.launch {
        repository.insertFeeling(feeling)
    }
}