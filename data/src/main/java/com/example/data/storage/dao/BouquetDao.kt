package com.example.data.storage.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entities.BouquetEntity

@Dao
interface BouquetDao {

    @Insert
    suspend fun insert(bouquetEntity: BouquetEntity)

    @Query("SELECT * FROM bouquets")
    fun getAllBouquets(): List<BouquetEntity>

    @Query("SELECT * FROM bouquets WHERE id = :bouquetId")
    fun getBouquetById(bouquetId: Long): BouquetEntity?

}