package com.seancoyle.launch_viewstate

import com.seancoyle.core.state.StateEvent
import com.seancoyle.core.state.StateMessage
import com.seancoyle.launch_models.model.PokemonInfo

sealed class PokemonStateEvent : StateEvent {

    class GetPokemonItemsFromNetworkAndInsertToCacheEvent
        constructor(

        ): PokemonStateEvent() {

        override fun errorInfo(): String {
            return "Error getting launch from network."
        }

        override fun eventName(): String {
            return "GetLaunchItemsFromNetworkAndInsertToCacheEvent"
        }

        override fun shouldDisplayProgressBar() = true
    }

    object GetAllPokemonItemsFromCacheEvent: PokemonStateEvent() {

        override fun errorInfo(): String {
            return "Error getting launch list from cache."
        }

        override fun eventName(): String {
            return "GetAllLaunchItemsFromCacheEvent"
        }

        override fun shouldDisplayProgressBar() = false
    }

    class GetPokemonItemFromCacheEvent
        constructor(
            private val id: Int
        ): PokemonStateEvent() {

        override fun errorInfo(): String {
            return "Error getting launch item from cache."
        }

        override fun eventName(): String {
            return "GetLaunchItemFromCacheEvent"
        }

        override fun shouldDisplayProgressBar() = false
    }

    object GetNumPokemonItemsInCacheEvent : PokemonStateEvent() {

        override fun errorInfo(): String {
            return "Error getting the number of launch items from the cache."
        }

        override fun eventName(): String {
            return "GetNumLaunchItemsInCacheEvent"
        }

        override fun shouldDisplayProgressBar() = false
    }

    class InsertPokemonItemsToCacheEvent
    constructor(
        private val pokemonInfoList: List<PokemonInfo>
    ): PokemonStateEvent() {

        override fun errorInfo(): String {
            return "Error inserting launch list."
        }

        override fun eventName(): String {
            return "InsertLaunchItemsToCacheEvent"
        }

        override fun shouldDisplayProgressBar() = false
    }

    class FilterPokemonItemsInCacheEvent(
        val clearLayoutManagerState: Boolean = true
    ): PokemonStateEvent(){

        override fun errorInfo(): String {
            return "Error getting list of launch items."
        }

        override fun eventName(): String {
            return "FilterLaunchItemsInCacheEvent"
        }

        override fun shouldDisplayProgressBar() = true
    }

    class CreateStateMessageEvent(
        val stateMessage: StateMessage
    ) : PokemonStateEvent() {

        override fun errorInfo(): String {
            return "Error creating a new state message."
        }

        override fun eventName(): String {
            return "CreateStateMessageEvent"
        }

        override fun shouldDisplayProgressBar() = false
    }

}




















