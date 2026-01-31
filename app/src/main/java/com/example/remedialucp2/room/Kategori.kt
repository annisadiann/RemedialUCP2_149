package com.example.remedialucp2.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kategori_buku")
data class Kategori(
    @PrimaryKey(autoGenerate = true)
    val idKategori: Int = 0,
    val namaKategori: String,
    val idInduk:Int? = null
)