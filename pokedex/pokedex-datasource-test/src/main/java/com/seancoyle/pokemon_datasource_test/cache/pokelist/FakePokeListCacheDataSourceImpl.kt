package com.seancoyle.pokemon_datasource_test.cache.pokelist

import com.seancoyle.launch_datasource.cache.pokelist.PokeListCacheDataSource
import com.seancoyle.launch_models.model.Pokemon

const val FORCE_DELETE_LAUNCH_EXCEPTION = -2
const val FORCE_DELETES_LAUNCH_EXCEPTION = -3
const val FORCE_INSERT_EXCEPTION = "FORCE_INSERT_EXCEPTION"
const val FORCE_GENERAL_FAILURE = "FORCE_GENERAL_FAILURE"
const val FORCE_SEARCH_LAUNCH_EXCEPTION = "FORCE_SEARCH_LAUNCH_EXCEPTION"
const val INSERT_LAUNCH_LIST_FAILED = "Failed to insert new launch list."


class FakePokeListCacheDataSourceImpl
constructor(
    private val fakePokeListDatabase: FakePokeListDatabase
) : PokeListCacheDataSource {

    override suspend fun insert(pokemon: Pokemon): Long {
        if (pokemon.name == FORCE_INSERT_EXCEPTION) {
            throw Exception("Something went wrong inserting the launch.")
        }
        if (pokemon.name == FORCE_GENERAL_FAILURE) {
            return -1 // fail
        }
        fakePokeListDatabase.pokeList.add(pokemon)
        return 1 // success
    }

    override suspend fun getById(name: String): Pokemon? {
        return fakePokeListDatabase.pokeList.find { it.name == name }
    }

    override suspend fun getAll(): List<Pokemon> {
        return fakePokeListDatabase.pokeList
    }

    override suspend fun getTotalEntries(): Int {
        return fakePokeListDatabase.pokeList.size
    }

    override suspend fun insertList(pokemons: List<Pokemon>): LongArray {
        var results = LongArray(pokemons.size)
        for (item in pokemons.withIndex()) {
            when (item.value.name) {

                FORCE_GENERAL_FAILURE -> {
                    results = LongArray(0)
                }

                FORCE_INSERT_EXCEPTION -> {
                    throw Exception(INSERT_LAUNCH_LIST_FAILED)
                }

                else -> {
                    results[item.index] = 1
                    fakePokeListDatabase.pokeList.add(item.value)
                }

            }
        }
        return results
    }

    override suspend fun filterLaunchList(
        name: String?,
        order: String,
        numerical: Boolean?,
        typeFilter: Int?,
        page: Int
    ): List<Pokemon> {
       /* if (year == FORCE_SEARCH_LAUNCH_EXCEPTION) {
            throw Exception("Something went searching the cache for launch items.")
        }*/
        val results: ArrayList<Pokemon> = ArrayList()
        for (item in fakePokeListDatabase.pokeList) {

            /*when {

                year?.isNotEmpty() == true && launchFilter == LAUNCH_ALL -> {
                    results.add(item)
                }

                launchFilter == LAUNCH_ALL -> {
                    results.add(item)
                }

                launchFilter != null && year?.isEmpty() == true -> {
                    if (item.isLaunchSuccess == launchFilter) {
                        results.add(item)
                    }
                }

                year?.isNotEmpty() == true && launchFilter == null -> {
                    if (item.launchYear == year) {
                        results.add(item)
                    }
                }

                year?.isNotEmpty() == true && launchFilter != null ->
                    if (item.launchYear == year && item.isLaunchSuccess == launchFilter) {
                        results.add(item)
                    }

                else -> results.add(item)

            }*/

          /*  if (launchFilter != LAUNCH_ALL) {
                if (results.size > (page * LAUNCH_PAGINATION_PAGE_SIZE)) {
                    break
                }
            }*/

        }

     /*   // Apply filter to data
        if (order == LAUNCH_ORDER_DESC) {
            results.sortByDescending { it.launchDateLocalDateTime }
        } else {
            results.sortBy { it.launchDateLocalDateTime }
        }*/

        return results
    }
}















