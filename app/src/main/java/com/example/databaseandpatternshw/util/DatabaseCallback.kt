package com.example.databaseandpatternshw.util

import android.content.Context
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.data.entities.BouquetEntity
import com.example.data.entities.BouquetOfFlowersEntity
import com.example.data.entities.FlowerEntity
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
                val orchid = FlowerEntity(3, "orchid", 30)
                flowerDao.insert(rose)
                flowerDao.insert(tulip)
                flowerDao.insert(orchid)

                val bouquet1 = BouquetEntity(1, "First bouquet")
                val bouquet2 = BouquetEntity(2, "Second bouquet")
                bouquetDao.insert(bouquet1)
                bouquetDao.insert(bouquet2)

                bouquetFlowerDao.insert(BouquetOfFlowersEntity(1, 1, 3))
                bouquetFlowerDao.insert(BouquetOfFlowersEntity(1, 2, 2))
                bouquetFlowerDao.insert(BouquetOfFlowersEntity(2, 1, 5))
                bouquetFlowerDao.insert(BouquetOfFlowersEntity(2, 3, 3))
            }
        }
    }
}