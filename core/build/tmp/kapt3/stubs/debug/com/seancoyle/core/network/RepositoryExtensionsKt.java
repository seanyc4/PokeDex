package com.seancoyle.core.network;

import com.seancoyle.core.cache.CacheResult;
import kotlinx.coroutines.*;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001aG\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\u000f\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\u0010\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"convertErrorBody", "", "throwable", "Lretrofit2/HttpException;", "safeApiCall", "Lcom/seancoyle/core/network/ApiResult;", "T", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeCacheCall", "Lcom/seancoyle/core/cache/CacheResult;", "cacheCall", "core_debug"})
public final class RepositoryExtensionsKt {
    
    /**
     * Reference: https://medium.com/@douglas.iacovelli/how-to-handle-errors-with-retrofit-and-coroutines-33e7492a912
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.core.network.ApiResult<? extends T>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object safeCacheCall(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> cacheCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.core.cache.CacheResult<? extends T>> continuation) {
        return null;
    }
    
    private static final java.lang.String convertErrorBody(retrofit2.HttpException throwable) {
        return null;
    }
}