package com.example.data.storage.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entities.BouquetEntity

@Dao
interface BouquetDao {

    @Insert
    suspend fun insert(bouquetEntity: BouquetEntity)

    @Delete
    suspend fun delete(bouquet: BouquetEntity)

    @Query("SELECT * FROM bouquets")
    suspend fun getAllBouquets(): List<BouquetEntity>

}