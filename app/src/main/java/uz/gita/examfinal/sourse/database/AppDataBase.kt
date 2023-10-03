package uz.gita.examfinal.sourse.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AppDataBase private constructor(context: Context) :
    SQLiteOpenHelper(context, "DB_NAME", null, 1) {

    companion object {
        private var appDataBase: AppDataBase? = null

        fun init(context: Context) {
            if (appDataBase == null) appDataBase = AppDataBase(context)
        }

        fun getInstance() = appDataBase!!
    }

    override fun onCreate(db: SQLiteDatabase?) {

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

}