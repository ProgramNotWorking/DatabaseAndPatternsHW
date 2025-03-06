package com.example.data.repository

import android.util.Log
import com.example.data.entities.BouquetEntity
import com.example.data.storage.database.AppDatabase

class BouquetRepository(private val db: AppDatabase) {

    private val bouquetDao = db.bouquetDao()
    private val bouquetFlowerDao = db.bouquetFlowerDao()
    private val flowerDao = db.flowerDao()

    suspend fun purchaseBouquet(bouquet: BouquetEntity) {
        val bouquetFlowers = bouquetFlowerDao.getFlowerForBouquet(bouquet.id)

        for (bouquetFlower in bouquetFlowers) {
            val flower = flowerDao.getFlowerById(bouquetFlower.flower_id)
            if (flower != null) {
                flower.quantity -= bouquetFlower.quantity
                flowerDao.update(flower)
            }
        }

        bouquetDao.delete(bouquet)
        bouquetFlowerDao.deleteFlowerForBouquet(bouquet.id)
    }

    suspend fun logBouquetInfo() {
        val bouquets = bouquetDao.getAllBouquets()

        for (bouquet in bouquets) {
            val bouquetFlowers = bouquetFlowerDao.getFlowerForBouquet(bouquet.id)

            val flowersInfo = StringBuilder()
            for (bouquetFlower in bouquetFlowers) {
                val flower = flowerDao.getFlowerById(bouquetFlower.flower_id)
                if (flower != null) {
                    flowersInfo.append("${flower.name} = ${flower.quantity} ")
                }
            }

            Log.d("TEST", "Bouquets: ${bouquet.name}, $flowersInfo")
        }
    }

}