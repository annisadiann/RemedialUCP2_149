package com.example.remedialucp2.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface BukuDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBuku(buku: Buku)

    @Update
    suspend fun updateBuku(buku: Buku)

    @Delete
    suspend fun deleteBuku(buku: Buku)

    @Query("SELECT * FROM buku WHERE hapus = 0 ORDER BY judul ASC")
    fun ambilSemuaBuku(): Flow<List<Buku>>

    @Query("SELECT * FROM buku WHERE id = :id")
    fun getBukuById(id: Int): Flow<Buku?>

    @Insert
    suspend fun insertKategori(kategori: Kategori)

    @Query("SELECT * FROM buku WHERE idKategori = :katId AND hapus = 0")
    fun getBukuByKategori(katId: Int): Flow<List<Buku>>
}