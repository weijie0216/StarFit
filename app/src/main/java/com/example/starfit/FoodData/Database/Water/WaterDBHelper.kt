package com.example.starfit.FoodData.Database.Water


import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteConstraintException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
import java.sql.Date
import java.util.*
import android.provider.SyncStateContract.Helpers.update




class WaterDBHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
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
    fun insertWater(water : VolumeModel): Boolean {
        // Gets the data repository in write mode
        val db = writableDatabase

        // Create a new map of values, where column names are the keys
        val values = ContentValues()
        values.put(DBContract.VolumeEntry.COLUMN_DATE, water.Date)
        values.put(DBContract.VolumeEntry.COLUMN_Volume, water.Volume)

        // Insert the new row, returning the primary key value of the new row
        val newRowId = db.insert(DBContract.VolumeEntry.TABLE_NAME, null, values)

        return true
    }


    fun update(Volume : Int, DATE:String): Boolean {
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put(DBContract.VolumeEntry.COLUMN_Volume,Volume)
        val selection = DBContract.VolumeEntry.COLUMN_DATE + " = '" + DATE + "'"
        db.update(
                DBContract.VolumeEntry.TABLE_NAME,
                cv,
                selection,
                null);

        return true
    }



    fun readWater( DATE :String): ArrayList<VolumeModel> {
        val Water = ArrayList<VolumeModel>()
        val db = writableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery("select * from " + DBContract.VolumeEntry.TABLE_NAME + " WHERE " + DBContract.VolumeEntry.COLUMN_DATE + " =  " + DATE  , null)
        } catch (e: SQLiteException) {
            // if table not yet present, create it
            db.execSQL(SQL_CREATE_ENTRIES)
            return ArrayList()
        }
        var Volume: Int
        var Date : String


        if (cursor!!.moveToFirst()) {
            while (cursor.isAfterLast == false) {
                Date = cursor.getString(cursor.getColumnIndex(DBContract.VolumeEntry.COLUMN_DATE))
                Volume = cursor.getInt(cursor.getColumnIndex(DBContract.VolumeEntry.COLUMN_Volume))


                Water.add(VolumeModel(Date, Volume))
                cursor.moveToNext()
            }
        }
        return Water
    }





    companion object {
        // If you change the database schema, you must increment the database version.
        val DATABASE_VERSION = 1
        val DATABASE_NAME = "WaterReader.db"

        private val SQL_CREATE_ENTRIES =
                " CREATE TABLE " + DBContract.VolumeEntry.TABLE_NAME + " ( " +
                        DBContract.VolumeEntry.COLUMN_DATE + " TEXT PRIMARY KEY, " +
                        DBContract.VolumeEntry.COLUMN_Volume + " INTEGER) "

        private val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + DBContract.VolumeEntry.TABLE_NAME
    }

}