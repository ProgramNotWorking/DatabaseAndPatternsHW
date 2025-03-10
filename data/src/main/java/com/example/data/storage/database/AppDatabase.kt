package com.example.data.storage.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.entities.BouquetEntity
import com.example.data.entities.BouquetOfFlowersEntity
import com.example.data.entities.FlowerEntity
import com.example.data.storage.dao.BouquetDao
import com.example.data.storage.dao.BouquetFlowerDao
import com.example.data.storage.dao.FlowerDao

@Database(
    entities = [
        FlowerEntity::class,
        BouquetEntity::class,
        BouquetOfFlowersEntity::class
    ],
    version = 2
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun flowerDao(): FlowerDao
    abstract fun bouquetDao(): BouquetDao
    abstract fun bouquetFlowerDao(): BouquetFlowerDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "flower_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

}