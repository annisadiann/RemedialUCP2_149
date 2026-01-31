package com.example.remedialucp2.room

import androidx.room.Entity

@Entity(
    tableName = "buku_penulis",
    primaryKeys = ["idBuku", "idPenulis"]
)
data class BukuPenulis(
    val idBuku: Int,
    val idPenulis: Int
)