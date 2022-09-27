package com.seancoyle.launch_datasource.di.cache.companyinfo;

import com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource;
import com.seancoyle.database.daos.CompanyInfoDao;
import com.seancoyle.launch_datasource.cache.implementation.company.CompanyInfoCacheDataSourceImpl;
import com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/seancoyle/launch_datasource/di/cache/companyinfo/CompanyInfoCacheDataSourceModule;", "", "()V", "provideCompanyInfoCacheDataSource", "Lcom/seancoyle/launch_datasource/cache/abstraction/company/CompanyInfoCacheDataSource;", "dao", "Lcom/seancoyle/database/daos/CompanyInfoDao;", "companyInfoEntityMapper", "Lcom/seancoyle/launch_datasource/cache/mappers/company/CompanyInfoEntityMapper;", "pokedex-datasource_debug"})
@dagger.Module()
public final class CompanyInfoCacheDataSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_datasource.di.cache.companyinfo.CompanyInfoCacheDataSourceModule INSTANCE = null;
    
    private CompanyInfoCacheDataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource provideCompanyInfoCacheDataSource(@org.jetbrains.annotations.NotNull()
    com.seancoyle.database.daos.CompanyInfoDao dao, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper companyInfoEntityMapper) {
        return null;
    }
}