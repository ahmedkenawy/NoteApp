package com.a7medkenawy.noteapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.a7medkenawy.noteapp.model.Data

@Database(entities = [Data::class], version = 1, exportSchema = false)
abstract class DataDatabase : RoomDatabase() {

    abstract fun dataDao(): DataDao

    companion object {

        @Volatile
        private var INSTANCE: DataDatabase? = null

        fun getDatabase(context: Context): DataDatabase {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    DataDatabase::class.java, "data _database"
                ).build()
                INSTANCE = instance
                return instance

            }
        }
    }

}