package com.seancoyle.launch_datasource.di.network.launch;

import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource;
import com.seancoyle.launch_datasource.network.api.launch.LaunchApi;
import com.seancoyle.launch_datasource.network.implementation.launch.LaunchNetworkDataSourceImpl;
import com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/seancoyle/launch_datasource/di/network/launch/LaunchNetworkDataSourceModule;", "", "()V", "provideLaunchNetworkDataSource", "Lcom/seancoyle/launch_datasource/network/abstraction/launch/LaunchNetworkDataSource;", "api", "Lcom/seancoyle/launch_datasource/network/api/launch/LaunchApi;", "networkMapper", "Lcom/seancoyle/launch_datasource/network/mappers/launch/LaunchNetworkMapper;", "pokedex-datasource_debug"})
@dagger.Module()
public final class LaunchNetworkDataSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_datasource.di.network.launch.LaunchNetworkDataSourceModule INSTANCE = null;
    
    private LaunchNetworkDataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource provideLaunchNetworkDataSource(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.api.launch.LaunchApi api, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper networkMapper) {
        return null;
    }
}