package com.seancoyle.core.network;

import com.seancoyle.core.state.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00028\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/seancoyle/core/network/ApiResponseHandler;", "ViewState", "Data", "", "response", "Lcom/seancoyle/core/network/ApiResult;", "stateEvent", "Lcom/seancoyle/core/state/StateEvent;", "(Lcom/seancoyle/core/network/ApiResult;Lcom/seancoyle/core/state/StateEvent;)V", "getResult", "Lcom/seancoyle/core/state/DataState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFailure", "handleSuccess", "resultObj", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract class ApiResponseHandler<ViewState extends java.lang.Object, Data extends java.lang.Object> {
    private final com.seancoyle.core.network.ApiResult<Data> response = null;
    private final com.seancoyle.core.state.StateEvent stateEvent = null;
    
    public ApiResponseHandler(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.network.ApiResult<? extends Data> response, @org.jetbrains.annotations.Nullable()
    com.seancoyle.core.state.StateEvent stateEvent) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getResult(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.core.state.DataState<ViewState>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object handleSuccess(Data resultObj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.core.state.DataState<ViewState>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object handleFailure(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.seancoyle.core.state.DataState<ViewState>> continuation);
}