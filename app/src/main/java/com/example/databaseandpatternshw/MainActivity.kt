package com.example.databaseandpatternshw

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.data.entities.BouquetEntity
import com.example.data.repository.BouquetRepository
import com.example.data.storage.database.AppDatabase
import com.example.databaseandpatternshw.util.DatabaseCallback
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val databaseCallback = DatabaseCallback(this)
        val db = Room.databaseBuilder(
            this.applicationContext,
            AppDatabase::class.java,
            "flower_database"
        ).addCallback(databaseCallback).build()
        val repository = BouquetRepository(db)

        lifecycleScope.launch {
            Log.d("TEST", "All flowers: ${db.flowerDao().getAllFlowers()}")
        }
    }
}