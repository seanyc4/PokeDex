package com.seancoyle.launch_datasource.network.implementation.launch;

import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource;
import com.seancoyle.launch_datasource.network.api.launch.LaunchApi;
import com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper;
import com.seancoyle.launch_models.model.launch.LaunchModel;
import com.seancoyle.launch_models.model.launch.LaunchOptions;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/seancoyle/launch_datasource/network/implementation/launch/LaunchNetworkDataSourceImpl;", "Lcom/seancoyle/launch_datasource/network/abstraction/launch/LaunchNetworkDataSource;", "api", "Lcom/seancoyle/launch_datasource/network/api/launch/LaunchApi;", "networkMapper", "Lcom/seancoyle/launch_datasource/network/mappers/launch/LaunchNetworkMapper;", "(Lcom/seancoyle/launch_datasource/network/api/launch/LaunchApi;Lcom/seancoyle/launch_datasource/network/mappers/launch/LaunchNetworkMapper;)V", "getLaunchList", "", "Lcom/seancoyle/launch_models/model/launch/LaunchModel;", "launchOptions", "Lcom/seancoyle/launch_models/model/launch/LaunchOptions;", "(Lcom/seancoyle/launch_models/model/launch/LaunchOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pokedex-datasource_debug"})
@javax.inject.Singleton()
public final class LaunchNetworkDataSourceImpl implements com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource {
    private final com.seancoyle.launch_datasource.network.api.launch.LaunchApi api = null;
    private final com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper networkMapper = null;
    
    @javax.inject.Inject()
    public LaunchNetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.api.launch.LaunchApi api, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper networkMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLaunchList(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.LaunchOptions launchOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.seancoyle.launch_models.model.launch.LaunchModel>> continuation) {
        return null;
    }
}