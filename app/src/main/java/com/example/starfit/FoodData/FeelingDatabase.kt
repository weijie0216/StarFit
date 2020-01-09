package com.example.starfit.FoodData
import android.content.Context
import android.os.strictmode.InstanceCountViolation
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.starfit.FoodData.Feeling
import java.time.Instant
@Database(entities = [Feeling::class],version = 1,exportSchema = false)

abstract class FeelingDatabase : RoomDatabase(){
    //Inside of DAO
    abstract fun  feelingDao() : FeelingDao

    //Ensure only one instance of the database is created
    companion object{
        @Volatile
        private var INTANCE : FeelingDatabase? = null

        fun getDatabase(context: Context) : FeelingDatabase{
            val tempInstance = INTANCE

            if(tempInstance != null){
                return tempInstance
            }
            //Create an instance of the database
            synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,FeelingDatabase::class.java,"feeling_db").build()
                INTANCE = instance
                return instance
            }
        }
    }
}
