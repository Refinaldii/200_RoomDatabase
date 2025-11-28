package com.example.myroomsatu.repositori
import android.app.Application
import android.content.Context

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
) : RepositoriSiswa {

    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()

    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}

class AplikasiSiswa : Application() {

    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk men[dapatkan dependensi].
     * (AppContainer instance is used by other classes to get dependencies.)
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(context = this)
    }
}
