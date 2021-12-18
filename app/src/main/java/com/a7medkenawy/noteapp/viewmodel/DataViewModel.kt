package com.a7medkenawy.noteapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.a7medkenawy.noteapp.data.DataDatabase
import com.a7medkenawy.noteapp.model.Data
import com.a7medkenawy.noteapp.repository.DataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataViewModel(application: Application) : AndroidViewModel(application) {

    val getAllData: LiveData<List<Data>>
    private val dataRepository: DataRepository

    init {
        val dataDao = DataDatabase.getDatabase(application.applicationContext).dataDao()
        dataRepository = DataRepository(dataDao)
        getAllData = dataRepository.getAllData
    }

    fun insertData(data: Data) {
        viewModelScope.launch (Dispatchers.IO){
            dataRepository.insertData(data)
        }
    }


    fun updateData(data: Data) {
        viewModelScope.launch (Dispatchers.IO){
            dataRepository.updateData(data)
        }
    }


}