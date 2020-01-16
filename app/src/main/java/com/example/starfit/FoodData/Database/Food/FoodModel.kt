package com.example.starfit.FoodData.Database.Food

class FoodModel(val Date: String, val FoodCalories: Int) {
    fun getFoodCalories(): String {
        return "$FoodCalories"
    }
}

