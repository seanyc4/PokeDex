package com.seancoyle.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.seancoyle.database.entities.PokeListEntity


@Dao
interface PokeListDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemon: PokeListEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(pokemons: List<PokeListEntity>): LongArray

    @Query("DELETE FROM poke_list WHERE name = :id")
    suspend fun deleteById(id: Int): Int

    @Query("DELETE FROM poke_list WHERE name IN (:ids)")
    suspend fun deleteList(ids: List<Int>): Int

    @Query("DELETE FROM poke_list")
    suspend fun deleteAll()

    @Query(
        """
        SELECT * 
        FROM poke_list
        WHERE name = :name
    """
    )
    suspend fun getById(name: String): PokeListEntity?

    @Query(
        """
        SELECT * 
        FROM poke_list
    """
    )
    suspend fun getAll(): List<PokeListEntity>?

    @Query("SELECT COUNT(*) FROM poke_list")
    suspend fun getTotalEntries(): Int

    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun launchItemsWithSuccessOrderByYearDESC(
       /* launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>

    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun launchItemsWithSuccessOrderByYearASC(
     /*   launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>


    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun searchLaunchItemsWithSuccessOrderByYearDESC(
    /*    year: String?,
        launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>

    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun searchLaunchItemsWithSuccessOrderByYearASC(
       /* year: String?,
        launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>

    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun searchLaunchItemsOrderByYearDESC(
      /*  year: String?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>

    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun searchLaunchItemsOrderByYearASC(
       /* year: String?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>

    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun launchItemsOrderByYearDESC(
       /* page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>

    @Query(
        """
        SELECT * FROM poke_list
        """
    )
    suspend fun launchItemsOrderByYearASC(
      /*  page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE*/
    ): List<PokeListEntity>

}


suspend fun PokeListDao.returnOrderedQuery(
   name: String?,
    order: String,
    numerical: Boolean?,
    typeFilter: Int?,
    page: Int
): List<PokeListEntity>? {

    when {

      /*  launchFilter != null && order.contains(LAUNCH_ORDER_DESC) && year.isNullOrEmpty() -> {
            return launchItemsWithSuccessOrderByYearDESC(
                launchFilter = launchFilter,
                page = page
            )
        }

        launchFilter != null && order.contains(LAUNCH_ORDER_ASC) && year.isNullOrEmpty() -> {
            return launchItemsWithSuccessOrderByYearASC(
                launchFilter = launchFilter,
                page = page
            )
        }

        !year.isNullOrEmpty() && order.contains(LAUNCH_ORDER_DESC) && launchFilter == null -> {
            return searchLaunchItemsOrderByYearDESC(
                year = year,
                page = page
            )
        }

        !year.isNullOrEmpty() && order.contains(LAUNCH_ORDER_ASC) && launchFilter == null -> {
            return searchLaunchItemsOrderByYearASC(
                year = year,
                page = page
            )
        }

        !year.isNullOrEmpty() && launchFilter != null && order.contains(LAUNCH_ORDER_ASC) ->
            return searchLaunchItemsWithSuccessOrderByYearASC(
                year = year,
                launchFilter = launchFilter,
                page = page
            )

        !year.isNullOrEmpty() && launchFilter != null && order.contains(LAUNCH_ORDER_DESC) ->
            return searchLaunchItemsWithSuccessOrderByYearDESC(
                year = year,
                launchFilter = launchFilter,
                page = page
            )

        order.contains(LAUNCH_ORDER_DESC) -> {
            return launchItemsOrderByYearDESC(
                page = page
            )
        }

        order.contains(LAUNCH_ORDER_ASC) -> {
            return launchItemsOrderByYearASC(
                page = page
            )
        }*/

        else ->
            return getAll()
    }
}














