package com.example.starfit.ui.Posts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PostsViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Posts Fragment"
    }
    val text: LiveData<String> = _text
}