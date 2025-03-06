package com.example.data.repository

import android.util.Log
import com.example.data.storage.database.AppDatabase
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class BouquetRepository(private val db: AppDatabase) {

    private val executor: Executor = Executors.newSingleThreadExecutor()

    fun logBouquetsInfo() {
        val bouquetDao = db.bouquetDao()
        val bouquetFlowerDao = db.bouquetFlowerDao()
        val flowerDao = db.flowerDao()

        executor.execute {
            runBlocking {
                val bouquets = bouquetFlowerDao.getAllBouquets()
                val flowers = flowerDao.getAllFlowers()

                for (bouquet in bouquets) {
                    val flowersInfo = mutableMapOf(bouquet.name to "")

                    for (flower in flowers) {
                        if (flower.id == bouquet.flower_id) {
                            flowersInfo[bouquet.name] += "${flower.name} - ${bouquet.quantity}, "
                        }
                    }

                    Log.d("TEST", "${bouquet.name}: ${flowersInfo[bouquet.name]}")
                }
            }
        }
    }

}