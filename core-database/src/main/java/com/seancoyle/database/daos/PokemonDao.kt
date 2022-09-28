package com.seancoyle.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.seancoyle.database.entities.PokemonEntity


@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemon: PokemonEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(pokemons: List<PokemonEntity>): LongArray

    @Query("DELETE FROM pokemon WHERE id = :id")
    suspend fun deleteById(id: Int): Int

    @Query("DELETE FROM pokemon WHERE id IN (:ids)")
    suspend fun deleteList(ids: List<Int>): Int

    @Query("DELETE FROM pokemon")
    suspend fun deleteAll()

    @Query(
        """
        SELECT * 
        FROM pokemon
        WHERE id = :id
    """
    )
    suspend fun getById(id: Int): PokemonEntity?

    @Query(
        """
        SELECT * 
        FROM pokemon
    """
    )
    suspend fun getAll(): List<PokemonEntity>?

    @Query("SELECT COUNT(*) FROM pokemon")
    suspend fun getTotalEntries(): Int

   /* @Query(
        """
        SELECT * FROM pokemon
        WHERE isLaunchSuccess = :launchFilter
        ORDER BY launchDateLocalDateTime DESC LIMIT (:page * :pageSize)
        """
    )
    suspend fun launchItemsWithSuccessOrderByYearDESC(
        launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>

    @Query(
        """
        SELECT * FROM pokemon
        WHERE isLaunchSuccess = :launchFilter
        ORDER BY launchDateLocalDateTime ASC LIMIT (:page * :pageSize)
        """
    )
    suspend fun launchItemsWithSuccessOrderByYearASC(
        launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>


    @Query(
        """
        SELECT * FROM pokemon
        WHERE launchYear = :year
        AND isLaunchSuccess = :launchFilter
        ORDER BY launchDateLocalDateTime DESC LIMIT (:page * :pageSize)
        """
    )
    suspend fun searchLaunchItemsWithSuccessOrderByYearDESC(
        year: String?,
        launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>

    @Query(
        """
        SELECT * FROM pokemon
        WHERE launchYear = :year
        AND isLaunchSuccess = :launchFilter
        ORDER BY launchDateLocalDateTime ASC LIMIT (:page * :pageSize)
        """
    )
    suspend fun searchLaunchItemsWithSuccessOrderByYearASC(
        year: String?,
        launchFilter: Int?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>

    @Query(
        """
        SELECT * FROM pokemon
        WHERE launchYear = :year
        ORDER BY launchDateLocalDateTime DESC LIMIT (:page * :pageSize)
        """
    )
    suspend fun searchLaunchItemsOrderByYearDESC(
        year: String?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>

    @Query(
        """
        SELECT * FROM pokemon
        WHERE launchYear = :year
        ORDER BY launchDateLocalDateTime ASC LIMIT (:page * :pageSize)
        """
    )
    suspend fun searchLaunchItemsOrderByYearASC(
        year: String?,
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>

    @Query(
        """
        SELECT * FROM pokemon
        ORDER BY launchDateLocalDateTime DESC LIMIT (:page * :pageSize)
        """
    )
    suspend fun launchItemsOrderByYearDESC(
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>

    @Query(
        """
        SELECT * FROM pokemon
        ORDER BY launchDateLocalDateTime ASC LIMIT (:page * :pageSize)
        """
    )
    suspend fun launchItemsOrderByYearASC(
        page: Int,
        pageSize: Int = LAUNCH_PAGINATION_PAGE_SIZE
    ): List<PokemonEntity>*/

}

/*
suspend fun PokemonDao.returnOrderedQuery(
    year: String?,
    order: String,
    launchFilter: Int?,
    page: Int
): List<PokemonEntity>? {

    when {

        launchFilter != null && order.contains(LAUNCH_ORDER_DESC) && year.isNullOrEmpty() -> {
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
        }

        else ->
            return getAll()
    }
}

*/












