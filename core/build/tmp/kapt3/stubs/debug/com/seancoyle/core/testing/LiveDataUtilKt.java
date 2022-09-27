package com.seancoyle.core.testing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001d\u0010\u0004\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0007H\u0086\b\u00f8\u0001\u0000\u001a?\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\u0010\u000f\u001a?\u0010\u0010\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0005H\u0086@\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"captureValues", "", "T", "Landroidx/lifecycle/LiveData;", "block", "Lkotlin/Function1;", "Lcom/seancoyle/core/testing/LiveDataValueCapture;", "Lkotlin/ExtensionFunctionType;", "getOrAwaitValue", "time", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "afterObserve", "Lkotlin/Function0;", "(Landroidx/lifecycle/LiveData;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "observeForTesting", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class LiveDataUtilKt {
    
    /**
     * Gets the value of a [LiveData] or waits for it to have one, with a timeout.
     *
     * Use this extension from host-side (JVM) tests. It's recommended to use it alongside
     * `InstantTaskExecutorRule` or a similar mechanism to execute tasks synchronously.
     */
    public static final <T extends java.lang.Object>T getOrAwaitValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$getOrAwaitValue, long time, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> afterObserve) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void captureValues(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$captureValues, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.seancoyle.core.testing.LiveDataValueCapture<T>, kotlin.Unit> block) {
    }
    
    /**
     * Observes a [LiveData] until the `block` is done executing.
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object observeForTesting(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeForTesting, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
}