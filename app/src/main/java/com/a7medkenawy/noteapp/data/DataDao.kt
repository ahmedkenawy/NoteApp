package com.a7medkenawy.noteapp.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.a7medkenawy.noteapp.model.Data

@Dao
interface DataDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertData(data: Data)

    @Query("select * from data_table order by id ASC")
    fun getAllData(): LiveData<List<Data>>


    @Update
    suspend fun updateData(data: Data)


    @Delete
    suspend fun deleteData(data: Data)


}