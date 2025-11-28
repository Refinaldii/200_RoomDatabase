package com.example.myroomsatu.viewmodel.provider

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myroomsatu.repositori.AplikasiSiswa
import com.example.myroomsatu.viewmodel.EntryViewModel
import com.example.myroomsatu.viewmodel.HomeViewModel

object PenyediaViewModel {

    val Factory = viewModelFactory {

        // --- HomeViewModel ---
        initializer {
            HomeViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        // --- EntryViewModel ---
        initializer {
            EntryViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

/**
 * Fungsi ekstensi untuk mengambil instance AplikasiSiswa dari CreationExtras
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa {
    return (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)
}