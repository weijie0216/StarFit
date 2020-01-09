package com.example.starfit.ui.Challenges

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChallengesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Challenges Fragment"
    }
    val text: LiveData<String> = _text
}