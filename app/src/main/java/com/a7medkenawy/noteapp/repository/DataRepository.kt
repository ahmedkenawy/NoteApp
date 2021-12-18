package com.a7medkenawy.noteapp.repository

import androidx.lifecycle.LiveData
import com.a7medkenawy.noteapp.data.DataDao
import com.a7medkenawy.noteapp.model.Data

class DataRepository (private var dataDao:DataDao){

     var  getAllData: LiveData<List<Data>> = dataDao.getAllData()


    suspend fun insertData(data:Data){
        dataDao.insertData(data)
    }

    suspend fun updateData(data:Data){
        dataDao.updateData(data)
    }

}