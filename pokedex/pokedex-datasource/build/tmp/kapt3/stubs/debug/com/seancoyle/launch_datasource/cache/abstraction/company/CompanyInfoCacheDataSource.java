package com.seancoyle.launch_datasource.cache.abstraction.company;

import com.seancoyle.launch_models.model.company.CompanyInfoModel;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/seancoyle/launch_datasource/cache/abstraction/company/CompanyInfoCacheDataSource;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompanyInfo", "Lcom/seancoyle/launch_models/model/company/CompanyInfoModel;", "insert", "", "company", "(Lcom/seancoyle/launch_models/model/company/CompanyInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pokedex-datasource_debug"})
public abstract interface CompanyInfoCacheDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.company.CompanyInfoModel company, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompanyInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.launch_models.model.company.CompanyInfoModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}