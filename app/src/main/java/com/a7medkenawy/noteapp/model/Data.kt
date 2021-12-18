package com.a7medkenawy.noteapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "data_table")
data class Data(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var date: String,
    var title: String,
    var description: String
) : Parcelable
