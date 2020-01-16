package com.example.starfit.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.starfit.FoodData.Database.Food.FoodDBHelper
import com.example.starfit.FoodData.Database.Water.WaterDBHelper
import kotlinx.android.synthetic.main.fragment_home.*

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


}