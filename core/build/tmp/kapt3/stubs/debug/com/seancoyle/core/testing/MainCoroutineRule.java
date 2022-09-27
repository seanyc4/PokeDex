package com.seancoyle.core.testing;

import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.test.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/seancoyle/core/testing/MainCoroutineRule;", "Lorg/junit/rules/TestWatcher;", "testDispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "(Lkotlinx/coroutines/test/TestDispatcher;)V", "getTestDispatcher", "()Lkotlinx/coroutines/test/TestDispatcher;", "testScope", "Lkotlinx/coroutines/test/TestScope;", "getTestScope", "()Lkotlinx/coroutines/test/TestScope;", "finished", "", "description", "Lorg/junit/runner/Description;", "starting", "core_debug"})
public final class MainCoroutineRule extends org.junit.rules.TestWatcher {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.test.TestDispatcher testDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.test.TestScope testScope = null;
    
    public MainCoroutineRule() {
        super();
    }
    
    public MainCoroutineRule(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.test.TestDispatcher testDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.test.TestDispatcher getTestDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.test.TestScope getTestScope() {
        return null;
    }
    
    @java.lang.Override()
    protected void starting(@org.jetbrains.annotations.NotNull()
    org.junit.runner.Description description) {
    }
    
    @java.lang.Override()
    protected void finished(@org.jetbrains.annotations.NotNull()
    org.junit.runner.Description description) {
    }
}