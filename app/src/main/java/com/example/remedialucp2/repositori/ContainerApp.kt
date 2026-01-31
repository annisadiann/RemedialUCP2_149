package com.example.remedialucp2.repositori

import android.content.Context
import com.example.remedialucp2.room.DatabasePerpustakaan

interface AppContainer {
    val repositoriBuku: RepositoriBuku
}

class ContainerApp(private val context: Context) : AppContainer {
    override val repositoriBuku: RepositoriBuku by lazy {
        OfflineRepositoriBuku(DatabasePerpustakaan.getDatabase(context).bukuDao())
    }
}