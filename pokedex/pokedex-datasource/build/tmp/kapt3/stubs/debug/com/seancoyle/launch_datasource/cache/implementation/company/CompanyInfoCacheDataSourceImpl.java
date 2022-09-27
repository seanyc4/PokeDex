package com.seancoyle.launch_datasource.cache.implementation.company;

import com.seancoyle.database.daos.CompanyInfoDao;
import com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource;
import com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper;
import com.seancoyle.launch_models.model.company.CompanyInfoModel;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/seancoyle/launch_datasource/cache/implementation/company/CompanyInfoCacheDataSourceImpl;", "Lcom/seancoyle/launch_datasource/cache/abstraction/company/CompanyInfoCacheDataSource;", "dao", "Lcom/seancoyle/database/daos/CompanyInfoDao;", "entityMapper", "Lcom/seancoyle/launch_datasource/cache/mappers/company/CompanyInfoEntityMapper;", "(Lcom/seancoyle/database/daos/CompanyInfoDao;Lcom/seancoyle/launch_datasource/cache/mappers/company/CompanyInfoEntityMapper;)V", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompanyInfo", "Lcom/seancoyle/launch_models/model/company/CompanyInfoModel;", "insert", "", "company", "(Lcom/seancoyle/launch_models/model/company/CompanyInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pokedex-datasource_debug"})
@javax.inject.Singleton()
public final class CompanyInfoCacheDataSourceImpl implements com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource {
    private final com.seancoyle.database.daos.CompanyInfoDao dao = null;
    private final com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper entityMapper = null;
    
    @javax.inject.Inject()
    public CompanyInfoCacheDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.seancoyle.database.daos.CompanyInfoDao dao, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.cache.mappers.company.CompanyInfoEntityMapper entityMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.company.CompanyInfoModel company, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCompanyInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.launch_models.model.company.CompanyInfoModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}