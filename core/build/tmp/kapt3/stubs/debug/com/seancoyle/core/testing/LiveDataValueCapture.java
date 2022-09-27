package com.seancoyle.core.testing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0015\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/seancoyle/core/testing/LiveDataValueCapture;", "T", "", "()V", "_values", "", "lock", "getLock", "()Ljava/lang/Object;", "values", "", "getValues", "()Ljava/util/List;", "addValue", "", "value", "(Ljava/lang/Object;)V", "core_debug"})
public final class LiveDataValueCapture<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object lock = null;
    private final java.util.List<T> _values = null;
    
    public LiveDataValueCapture() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getValues() {
        return null;
    }
    
    public final void addValue(@org.jetbrains.annotations.Nullable()
    T value) {
    }
}