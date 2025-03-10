package com.example.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flowers")
data class FlowerEntity(
    @PrimaryKey val id: Long,
    val name: String,
    var quantity: Int,
    val countryOfOrigin: String? = null
)