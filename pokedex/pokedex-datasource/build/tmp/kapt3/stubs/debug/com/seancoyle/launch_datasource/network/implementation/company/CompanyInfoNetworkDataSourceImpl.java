package com.seancoyle.launch_datasource.network.implementation.company;

import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource;
import com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi;
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper;
import com.seancoyle.launch_models.model.company.CompanyInfoModel;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/seancoyle/launch_datasource/network/implementation/company/CompanyInfoNetworkDataSourceImpl;", "Lcom/seancoyle/launch_datasource/network/abstraction/company/CompanyInfoNetworkDataSource;", "api", "Lcom/seancoyle/launch_datasource/network/api/company/CompanyInfoApi;", "networkMapper", "Lcom/seancoyle/launch_datasource/network/mappers/company/CompanyInfoNetworkMapper;", "(Lcom/seancoyle/launch_datasource/network/api/company/CompanyInfoApi;Lcom/seancoyle/launch_datasource/network/mappers/company/CompanyInfoNetworkMapper;)V", "getCompanyInfo", "Lcom/seancoyle/launch_models/model/company/CompanyInfoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pokedex-datasource_debug"})
@javax.inject.Singleton()
public final class CompanyInfoNetworkDataSourceImpl implements com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource {
    private final com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi api = null;
    private final com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper networkMapper = null;
    
    @javax.inject.Inject()
    public CompanyInfoNetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi api, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper networkMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCompanyInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.launch_models.model.company.CompanyInfoModel> continuation) {
        return null;
    }
}