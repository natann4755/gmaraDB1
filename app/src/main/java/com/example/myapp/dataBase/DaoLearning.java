package com.example.myapp.dataBase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.model.Daf;

import java.util.Collection;
import java.util.List;

@Dao
public interface DaoLearning {

    @Query("SELECT * FROM Daf")
    List<Daf> getAllShas();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllShas(Collection <Daf> AllShas);

    @Query("DELETE FROM Daf")
    void deleteAll();

}
