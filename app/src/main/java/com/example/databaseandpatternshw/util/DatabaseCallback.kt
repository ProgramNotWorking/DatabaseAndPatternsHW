package com.example.databaseandpatternshw.util

import android.content.Context
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.data.entities.BouquetEntity
import com.example.data.entities.BouquetOfFlowersEntity
import com.example.data.entities.FlowerEntity
import com.example.data.entities.flower_type.FlowerType
import com.example.data.storage.database.AppDatabase
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class DatabaseCallback(private val context: Context) : RoomDatabase.Callback() {

    private val executor: Executor = Executors.newSingleThreadExecutor()

    override fun onCreate(db: SupportSQLiteDatabase) {
        super.onCreate(db)

        executor.execute {
            runBlocking {
                val flowerDao = AppDatabase.getDatabase(context).flowerDao()
                val bouquetDao = AppDatabase.getDatabase(context).bouquetDao()
                val bouquetFlowerDao = AppDatabase.getDatabase(context).bouquetFlowerDao()

                val rose = FlowerEntity(1, "rose", 100)
                val tulip = FlowerEntity(2, "tulip", 50)
                flowerDao.insert(rose)
                flowerDao.insert(tulip)

                val bouquet = BouquetEntity(1)
                bouquetDao.insert(bouquet)

                // Составление букета с 3-мя розами и 2-мя тюльпанами
                val bouquetFlower1 = BouquetOfFlowersEntity(
                    1, 1, "Spring mix", 3
                )
                val bouquetFlower2 = BouquetOfFlowersEntity(
                    1, 2, "Spring mix",  2
                )
                bouquetFlowerDao.insert(bouquetFlower1)
                bouquetFlowerDao.insert(bouquetFlower2)
            }
        }
    }
}