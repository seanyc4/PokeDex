package com.seancoyle.core_datastore;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/seancoyle/core_datastore/DataStoreModule;", "", "()V", "provideDataStoreManager", "Lcom/seancoyle/core_datastore/AppDataStore;", "application", "Landroid/app/Application;", "core-datastore_debug"})
@dagger.Module()
public final class DataStoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.core_datastore.DataStoreModule INSTANCE = null;
    
    private DataStoreModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seancoyle.core_datastore.AppDataStore provideDataStoreManager(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
}