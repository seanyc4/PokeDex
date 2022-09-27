package com.seancoyle.core.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/seancoyle/core/network/NetworkErrors;", "", "()V", "ERROR_CHECK_NETWORK_CONNECTION", "", "NETWORK_DATA_NULL", "NETWORK_ERROR", "NETWORK_ERROR_TIMEOUT", "NETWORK_ERROR_UNKNOWN", "UNABLE_TODO_OPERATION_WO_INTERNET", "UNABLE_TO_RESOLVE_HOST", "isNetworkError", "", "msg", "core_debug"})
public final class NetworkErrors {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.core.network.NetworkErrors INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TO_RESOLVE_HOST = "Unable to resolve host";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNABLE_TODO_OPERATION_WO_INTERNET = "Can\'t do that operation without an internet connection";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_CHECK_NETWORK_CONNECTION = "Check network connection.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR_UNKNOWN = "Unknown network error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR = "Network error";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_ERROR_TIMEOUT = "Network timeout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NETWORK_DATA_NULL = "Network data is null";
    
    private NetworkErrors() {
        super();
    }
    
    public final boolean isNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        return false;
    }
}