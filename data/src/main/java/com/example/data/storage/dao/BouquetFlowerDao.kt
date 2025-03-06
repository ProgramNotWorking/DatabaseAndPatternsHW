package com.example.data.storage.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.data.entities.BouquetOfFlowersEntity

@Dao
interface BouquetFlowerDao {

    @Insert
    suspend fun insert(bouquetOfFlowers: BouquetOfFlowersEntity)

    @Query("SELECT * FROM bouquet_flowers")
    fun getAllBouquets(): List<BouquetOfFlowersEntity>

    @Query("SELECT * FROM bouquet_flowers WHERE bouquet_id = :bouquetId")
    fun getFlowerForBouquet(bouquetId: Long): List<BouquetOfFlowersEntity>

}