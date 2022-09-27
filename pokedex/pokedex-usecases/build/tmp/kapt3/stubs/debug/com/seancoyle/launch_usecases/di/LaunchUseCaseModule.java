package com.seancoyle.launch_usecases.di;

import com.seancoyle.core.di.IODispatcher;
import com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource;
import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource;
import com.seancoyle.launch_usecases.launch.*;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;
import kotlinx.coroutines.CoroutineDispatcher;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/seancoyle/launch_usecases/di/LaunchUseCaseModule;", "", "()V", "provideLaunchUseCases", "Lcom/seancoyle/launch_usecases/launch/LaunchUseCases;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "launchCacheDataSource", "Lcom/seancoyle/launch_datasource/cache/abstraction/launch/LaunchCacheDataSource;", "launchNetworkDataSource", "Lcom/seancoyle/launch_datasource/network/abstraction/launch/LaunchNetworkDataSource;", "pokedex-usecases_debug"})
@dagger.Module()
public final class LaunchUseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_usecases.di.LaunchUseCaseModule INSTANCE = null;
    
    private LaunchUseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.seancoyle.launch_usecases.launch.LaunchUseCases provideLaunchUseCases(@org.jetbrains.annotations.NotNull()
    @com.seancoyle.core.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource launchCacheDataSource, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource launchNetworkDataSource) {
        return null;
    }
}