package com.example.remedialucp2.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Buku::class, Kategori::class, Penulis::class, BukuPenulis::class], version = 1, exportSchema = false)
abstract class DatabasePerpustakaan : RoomDatabase() {
    abstract fun bukuDao() : BukuDao

    companion object {
        @Volatile
        private var Instance: DatabasePerpustakaan? = null

        fun getDatabase(context: Context): DatabasePerpustakaan {
            return(Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context, DatabasePerpustakaan::class.java,
                    "perpustakaan_database")
                    .build().also { Instance = it }
            })
        }
    }
}