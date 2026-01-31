package com.example.remedialucp2.room

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "buku",
    foreignKeys = [ForeignKey(entity = Kategori::class, parentColumns = ["id"], childColumns = ["idKat"], onDelete = ForeignKey.RESTRICT)]
)
data class Buku(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val judul: String,
    val idKategori: Int,
    val pinjam: Boolean = false,
    val hapus: Int = 0
)