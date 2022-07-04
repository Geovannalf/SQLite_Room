package com.example.sqlite_room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")

class Usuario(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val nome: String,
    val idade: Int
) {
}