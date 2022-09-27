package com.seancoyle.launch_datasource.network.api.launch;

import com.seancoyle.launch_datasource.network.model.launch.LaunchDto;
import com.seancoyle.launch_models.model.launch.LaunchOptions;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/seancoyle/launch_datasource/network/api/launch/LaunchApi;", "", "getLaunchList", "Lcom/seancoyle/launch_datasource/network/model/launch/LaunchDto;", "options", "Lcom/seancoyle/launch_models/model/launch/LaunchOptions;", "(Lcom/seancoyle/launch_models/model/launch/LaunchOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pokedex-datasource_debug"})
public abstract interface LaunchApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/v4/launches/query")
    public abstract java.lang.Object getLaunchList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.seancoyle.launch_models.model.launch.LaunchOptions options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.launch_datasource.network.model.launch.LaunchDto> continuation);
}