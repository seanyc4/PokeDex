package com.seancoyle.launch_models.model.di;

import com.seancoyle.launch_models.model.company.CompanyInfoFactory;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/seancoyle/launch_models/model/di/CompanyInfoFactoryModule;", "", "()V", "provideCompanyInfoFactory", "Lcom/seancoyle/launch_models/model/company/CompanyInfoFactory;", "pokedex-domain_debug"})
@dagger.Module()
public final class CompanyInfoFactoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_models.model.di.CompanyInfoFactoryModule INSTANCE = null;
    
    private CompanyInfoFactoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.seancoyle.launch_models.model.company.CompanyInfoFactory provideCompanyInfoFactory() {
        return null;
    }
}