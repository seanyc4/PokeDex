package com.seancoyle.launch_usecases.launch;

import com.seancoyle.launch_models.model.launch.LaunchModel;
import com.seancoyle.core.state.*;
import com.seancoyle.core.cache.CacheResponseHandler;
import com.seancoyle.core.di.IODispatcher;
import com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource;
import com.seancoyle.launch_viewstate.LaunchViewState;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/seancoyle/launch_usecases/launch/GetAllLaunchItemsFromCacheUseCase;", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "cacheDataSource", "Lcom/seancoyle/launch_datasource/cache/abstraction/launch/LaunchCacheDataSource;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/seancoyle/launch_datasource/cache/abstraction/launch/LaunchCacheDataSource;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/seancoyle/core/state/DataState;", "Lcom/seancoyle/launch_viewstate/LaunchViewState;", "stateEvent", "Lcom/seancoyle/core/state/StateEvent;", "Companion", "pokedex-usecases_debug"})
public final class GetAllLaunchItemsFromCacheUseCase {
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private final com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource cacheDataSource = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_usecases.launch.GetAllLaunchItemsFromCacheUseCase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_ALL_LAUNCH_ITEMS_SUCCESS = "Successfully retrieved all launch items";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_ALL_LAUNCH_ITEMS_NO_MATCHING_RESULTS = "There are no launch items that match that query.";
    
    public GetAllLaunchItemsFromCacheUseCase(@org.jetbrains.annotations.NotNull()
    @com.seancoyle.core.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource cacheDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.seancoyle.core.state.DataState<com.seancoyle.launch_viewstate.LaunchViewState>> invoke(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/seancoyle/launch_usecases/launch/GetAllLaunchItemsFromCacheUseCase$Companion;", "", "()V", "GET_ALL_LAUNCH_ITEMS_NO_MATCHING_RESULTS", "", "GET_ALL_LAUNCH_ITEMS_SUCCESS", "pokedex-usecases_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}