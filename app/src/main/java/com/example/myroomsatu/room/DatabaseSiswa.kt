package com.example.myroomsatu.room

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun siswaDao() : SiswaDao
    companion object {
        @Volatile
        private var Instance: DatabaseSiswa? = null
        fun getDatabase(context: Context): DatabaseSiswa {
            return (Instance ?: synchronized(lock = this) {
        }
    }
}


