package com.example.data.storage.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.data.entities.FlowerEntity

@Dao
interface FlowerDao {

    @Insert
    suspend fun insert(flowerEntity: FlowerEntity)

    @Update
    suspend fun update(flowerEntity: FlowerEntity)

    @Query("SELECT * FROM flowers")
    suspend fun getAllFlowers(): List<FlowerEntity>

    @Query("SELECT * FROM flowers WHERE id = :flowerId")
    suspend fun getFlowerById(flowerId: Long): FlowerEntity?

}