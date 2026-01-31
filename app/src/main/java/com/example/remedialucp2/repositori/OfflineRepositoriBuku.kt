package com.example.remedialucp2.repositori

import com.example.remedialucp2.room.Buku
import com.example.remedialucp2.room.BukuDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriBuku(private val bukuDao: BukuDao) : RepositoriBuku {
    override fun getAllBukuStream(): Flow<List<Buku>> = bukuDao.ambilSemuaBuku()
    override fun getBukuStream(id: Int): Flow<Buku?> = bukuDao.getBukuById(id)
    override suspend fun insertBuku(buku: Buku) = bukuDao.insertBuku(buku)
    override suspend fun deleteBuku(buku: Buku) = bukuDao.deleteBuku(buku)
    override suspend fun updateBuku(buku: Buku) = bukuDao.updateBuku(buku)
}