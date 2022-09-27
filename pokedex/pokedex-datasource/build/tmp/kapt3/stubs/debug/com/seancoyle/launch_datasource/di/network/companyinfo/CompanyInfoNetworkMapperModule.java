package com.seancoyle.launch_datasource.di.network.companyinfo;

import com.seancoyle.launch_datasource.network.abstraction.numberformatter.NumberFormatter;
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/seancoyle/launch_datasource/di/network/companyinfo/CompanyInfoNetworkMapperModule;", "", "()V", "provideCompanyInfoNetworkMapper", "Lcom/seancoyle/launch_datasource/network/mappers/company/CompanyInfoNetworkMapper;", "numberFormatter", "Lcom/seancoyle/launch_datasource/network/abstraction/numberformatter/NumberFormatter;", "pokedex-datasource_debug"})
@dagger.Module()
public final class CompanyInfoNetworkMapperModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_datasource.di.network.companyinfo.CompanyInfoNetworkMapperModule INSTANCE = null;
    
    private CompanyInfoNetworkMapperModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper provideCompanyInfoNetworkMapper(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.abstraction.numberformatter.NumberFormatter numberFormatter) {
        return null;
    }
}