package com.example.starfit.FoodData
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Food::class],version = 1,exportSchema = false)

abstract class FoodDatabase : RoomDatabase(){
    //Inside of DAO
    abstract fun  feelingDao() : FoodDao

    //Ensure only one instance of the database is created
    companion object{
        @Volatile
        private var INTANCE : FoodDatabase? = null

        fun getDatabase(context: Context) : FoodDatabase{
            val tempInstance = INTANCE

            if(tempInstance != null){
                return tempInstance
            }
            //Create an instance of the database
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,FoodDatabase::class.java,"feeling_db").build()
                INTANCE = instance
                return instance
            }
        }
    }
}
