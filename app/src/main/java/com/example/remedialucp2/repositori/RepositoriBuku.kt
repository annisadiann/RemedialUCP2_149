package com.example.remedialucp2.repositori

import com.example.remedialucp2.room.Buku
import kotlinx.coroutines.flow.Flow

interface RepositoriBuku {
    fun getAllBukuStream(): Flow<List<Buku>>
    fun getBukuStream(id: Int): Flow<Buku?>
    suspend fun insertBuku(buku: Buku)
    suspend fun deleteBuku(buku: Buku)
    suspend fun updateBuku(buku: Buku)
}