package com.seancoyle.launch_usecases.launch;

import com.seancoyle.launch_models.model.launch.LaunchModel;
import com.seancoyle.core.state.*;
import com.seancoyle.core.cache.CacheResponseHandler;
import com.seancoyle.core.di.IODispatcher;
import com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource;
import com.seancoyle.core.network.ApiResponseHandler;
import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource;
import com.seancoyle.launch_models.model.launch.LaunchOptions;
import com.seancoyle.launch_viewstate.LaunchViewState;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/seancoyle/launch_usecases/launch/GetLaunchListFromNetworkAndInsertToCacheUseCase;", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "cacheDataSource", "Lcom/seancoyle/launch_datasource/cache/abstraction/launch/LaunchCacheDataSource;", "launchNetworkDataSource", "Lcom/seancoyle/launch_datasource/network/abstraction/launch/LaunchNetworkDataSource;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/seancoyle/launch_datasource/cache/abstraction/launch/LaunchCacheDataSource;Lcom/seancoyle/launch_datasource/network/abstraction/launch/LaunchNetworkDataSource;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/seancoyle/core/state/DataState;", "Lcom/seancoyle/launch_viewstate/LaunchViewState;", "launchOptions", "Lcom/seancoyle/launch_models/model/launch/LaunchOptions;", "stateEvent", "Lcom/seancoyle/core/state/StateEvent;", "Companion", "pokedex-usecases_debug"})
public final class GetLaunchListFromNetworkAndInsertToCacheUseCase {
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private final com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource cacheDataSource = null;
    private final com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource launchNetworkDataSource = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_usecases.launch.GetLaunchListFromNetworkAndInsertToCacheUseCase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAUNCH_NETWORK_EMPTY = "No data returned from network.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAUNCH_ERROR = "Error updating launch items from network.\n\nReason: Network error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAUNCH_INSERT_SUCCESS = "Successfully inserted launch items from network.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAUNCH_INSERT_FAILED = "Failed to insert launch items from network.";
    
    public GetLaunchListFromNetworkAndInsertToCacheUseCase(@org.jetbrains.annotations.NotNull()
    @com.seancoyle.core.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource cacheDataSource, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource launchNetworkDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.seancoyle.core.state.DataState<com.seancoyle.launch_viewstate.LaunchViewState>> invoke(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.LaunchOptions launchOptions, @org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/seancoyle/launch_usecases/launch/GetLaunchListFromNetworkAndInsertToCacheUseCase$Companion;", "", "()V", "LAUNCH_ERROR", "", "LAUNCH_INSERT_FAILED", "LAUNCH_INSERT_SUCCESS", "LAUNCH_NETWORK_EMPTY", "pokedex-usecases_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}