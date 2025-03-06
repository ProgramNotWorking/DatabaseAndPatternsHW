package com.example.data.entities

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "bouquet_flowers",
    primaryKeys = ["bouquet_id", "flower_id"],
    foreignKeys = [
        ForeignKey(
            entity = BouquetEntity::class,
            parentColumns = ["id"],
            childColumns = ["bouquet_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = FlowerEntity::class,
            parentColumns = ["id"],
            childColumns = ["flower_id"],
            onDelete = ForeignKey.NO_ACTION
        )
    ]
)
data class BouquetOfFlowersEntity(
    val bouquet_id: Long,
    val flower_id: Long,
    val quantity: Int
)