package com.example.starfit.ui.Language

import android.widget.Adapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.intellij.lang.annotations.Language

class LanguageViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Choose your langauge"
    }
    val text: LiveData<String> = _text

}