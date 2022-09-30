package com.seancoyle.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.seancoyle.database.entities.PokeInfoEntity


@Dao
interface PokeInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemon: PokeInfoEntity): Long

    @Query(
        """
        SELECT * 
        FROM poke_info
        WHERE name = :name
    """
    )
    suspend fun getById(name: String): PokeInfoEntity?

}












