package com.seancoyle.launch_usecases.di;

import com.seancoyle.core.di.IODispatcher;
import com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource;
import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource;
import com.seancoyle.launch_models.model.company.CompanyInfoFactory;
import com.seancoyle.launch_usecases.company.CompanyInfoUseCases;
import com.seancoyle.launch_usecases.company.GetCompanyInfoFromCacheUseCase;
import com.seancoyle.launch_usecases.company.GetCompanyInfoFromNetworkAndInsertToCacheUseCase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;
import kotlinx.coroutines.CoroutineDispatcher;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/seancoyle/launch_usecases/di/CompanyInfoUseCaseModule;", "", "()V", "provideCompanyInfoUseCases", "Lcom/seancoyle/launch_usecases/company/CompanyInfoUseCases;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "companyInfoDataSource", "Lcom/seancoyle/launch_datasource/cache/abstraction/company/CompanyInfoCacheDataSource;", "companyInfoNetworkDataSource", "Lcom/seancoyle/launch_datasource/network/abstraction/company/CompanyInfoNetworkDataSource;", "companyInfoFactory", "Lcom/seancoyle/launch_models/model/company/CompanyInfoFactory;", "pokedex-usecases_debug"})
@dagger.Module()
public final class CompanyInfoUseCaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_usecases.di.CompanyInfoUseCaseModule INSTANCE = null;
    
    private CompanyInfoUseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.seancoyle.launch_usecases.company.CompanyInfoUseCases provideCompanyInfoUseCases(@org.jetbrains.annotations.NotNull()
    @com.seancoyle.core.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource companyInfoDataSource, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource companyInfoNetworkDataSource, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.company.CompanyInfoFactory companyInfoFactory) {
        return null;
    }
}