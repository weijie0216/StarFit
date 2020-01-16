package com.example.starfit.FoodData.Database.Food


import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteConstraintException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper



import java.util.ArrayList

class FoodDBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db, oldVersion, newVersion)
    }

    @Throws(SQLiteConstraintException::class)
    fun insertFood(food : FoodModel): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase

        // Create a new map of values, where column names are the keys
        val values = ContentValues()
        values.put(DBContract.FoodEntry.COLUMN_DATE, food.Date)
        values.put(DBContract.FoodEntry.COLUMN_FOODCALORIES, food.FoodCalories)

        // Insert the new row, returning the primary key value of the new row
        val newRowId = db.insert(DBContract.FoodEntry.TABLE_NAME, null, values)

        return true
    }


    fun update(FoodCalories : Int, DATE:String): Boolean {
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(DBContract.FoodEntry.COLUMN_FOODCALORIES,FoodCalories)
        val selection = DBContract.FoodEntry.COLUMN_DATE + " = '" + DATE + "'"
        db.update(
                DBContract.FoodEntry.TABLE_NAME,
                cv,
                selection,
                null);

        return true
    }

    fun readFood( DATE : String): ArrayList<FoodModel> {
        val food = ArrayList<FoodModel>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.FoodEntry.TABLE_NAME + " WHERE " + DBContract.FoodEntry.COLUMN_DATE + " = " + DATE , null)
        } catch (e: SQLiteException) {
            // if table not yet present, create it
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }
        var FoodCalories: Int
        var Date : String


        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                Date = cursor.getString(cursor.getColumnIndex(DBContract.FoodEntry.COLUMN_DATE))
                FoodCalories = cursor.getInt(cursor.getColumnIndex(DBContract.FoodEntry.COLUMN_FOODCALORIES))


                food.add(FoodModel(Date, FoodCalories))
                cursor.moveToNext()
            }
        }
        return food
    }





        companion object {
        // If you change the database schema, you must increment the database version.
        val DATABASE_VERSION = 1
        val DATABASE_NAME = "FoodReader.db"

        private val SQL_CREATE_ENTRIES =
                "CREATE TABLE " + DBContract.FoodEntry.TABLE_NAME + " (" +
                        DBContract.FoodEntry.COLUMN_DATE + " TEXT PRIMARY KEY," +
                        DBContract.FoodEntry.COLUMN_FOODCALORIES + " INTEGER)"

        private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + DBContract.FoodEntry.TABLE_NAME
    }

}