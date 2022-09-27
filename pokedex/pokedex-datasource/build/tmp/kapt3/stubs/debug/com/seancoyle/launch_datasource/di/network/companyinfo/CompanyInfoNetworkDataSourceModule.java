package com.seancoyle.launch_datasource.di.network.companyinfo;

import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource;
import com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi;
import com.seancoyle.launch_datasource.network.implementation.company.CompanyInfoNetworkDataSourceImpl;
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/seancoyle/launch_datasource/di/network/companyinfo/CompanyInfoNetworkDataSourceModule;", "", "()V", "provideCompanyInfoNetworkDataSource", "Lcom/seancoyle/launch_datasource/network/abstraction/company/CompanyInfoNetworkDataSource;", "api", "Lcom/seancoyle/launch_datasource/network/api/company/CompanyInfoApi;", "networkMapper", "Lcom/seancoyle/launch_datasource/network/mappers/company/CompanyInfoNetworkMapper;", "pokedex-datasource_debug"})
@dagger.Module()
public final class CompanyInfoNetworkDataSourceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_datasource.di.network.companyinfo.CompanyInfoNetworkDataSourceModule INSTANCE = null;
    
    private CompanyInfoNetworkDataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource provideCompanyInfoNetworkDataSource(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi api, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper networkMapper) {
        return null;
    }
}