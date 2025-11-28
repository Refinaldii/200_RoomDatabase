package com.example.myroomsatu.room

import androidx.room.Dao

@Dao
interface SiswaDao {
    @Query(value = "SELECT * FROM tblSiswa ORDER BY nama ASC")
}