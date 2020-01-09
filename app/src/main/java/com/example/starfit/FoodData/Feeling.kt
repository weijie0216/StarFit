package com.example.starfit.FoodData

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "feeling")
class Feeling(@PrimaryKey(autoGenerate = true)
              val id:Int,
              val mode:Int, //1 = Sad , 2 = Neutral, 3 =Happy
              val remaks:String,
              val Created_at : Long = System.currentTimeMillis())
