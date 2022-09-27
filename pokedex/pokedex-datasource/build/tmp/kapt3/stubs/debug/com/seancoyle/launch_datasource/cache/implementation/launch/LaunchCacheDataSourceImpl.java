package com.seancoyle.launch_datasource.cache.implementation.launch;

import com.seancoyle.database.daos.LaunchDao;
import com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource;
import com.seancoyle.launch_datasource.cache.mappers.launch.LaunchEntityMapper;
import com.seancoyle.launch_models.model.launch.LaunchModel;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J=\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u001c\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001f\u0010!\u001a\u00020\"2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/seancoyle/launch_datasource/cache/implementation/launch/LaunchCacheDataSourceImpl;", "Lcom/seancoyle/launch_datasource/cache/abstraction/launch/LaunchCacheDataSource;", "dao", "Lcom/seancoyle/database/daos/LaunchDao;", "entityMapper", "Lcom/seancoyle/launch_datasource/cache/mappers/launch/LaunchEntityMapper;", "(Lcom/seancoyle/database/daos/LaunchDao;Lcom/seancoyle/launch_datasource/cache/mappers/launch/LaunchEntityMapper;)V", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteList", "launchList", "", "Lcom/seancoyle/launch_models/model/launch/LaunchModel;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterLaunchList", "year", "", "order", "launchFilter", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "getById", "getTotalEntries", "insert", "", "launch", "(Lcom/seancoyle/launch_models/model/launch/LaunchModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertList", "", "pokedex-datasource_debug"})
@javax.inject.Singleton()
public final class LaunchCacheDataSourceImpl implements com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource {
    private final com.seancoyle.database.daos.LaunchDao dao = null;
    private final com.seancoyle.launch_datasource.cache.mappers.launch.LaunchEntityMapper entityMapper = null;
    
    @javax.inject.Inject()
    public LaunchCacheDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.seancoyle.database.daos.LaunchDao dao, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.cache.mappers.launch.LaunchEntityMapper entityMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.LaunchModel launch, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.seancoyle.launch_models.model.launch.LaunchModel> launchList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super long[]> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.seancoyle.launch_models.model.launch.LaunchModel> launchList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.launch_models.model.launch.LaunchModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.seancoyle.launch_models.model.launch.LaunchModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTotalEntries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object filterLaunchList(@org.jetbrains.annotations.Nullable()
    java.lang.String year, @org.jetbrains.annotations.NotNull()
    java.lang.String order, @org.jetbrains.annotations.Nullable()
    java.lang.Integer launchFilter, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.seancoyle.launch_models.model.launch.LaunchModel>> continuation) {
        return null;
    }
}