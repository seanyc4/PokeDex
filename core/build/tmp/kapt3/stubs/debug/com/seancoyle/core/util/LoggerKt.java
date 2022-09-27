package com.seancoyle.core.util;

import timber.log.Timber;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0000\u0010\u0002\"\u0004\b\u0003\u0010\u0004\u00a8\u0006\n"}, d2 = {"isUnitTest", "", "()Z", "setUnitTest", "(Z)V", "printLogDebug", "", "className", "", "message", "core_debug"})
public final class LoggerKt {
    private static boolean isUnitTest = false;
    
    public static final boolean isUnitTest() {
        return false;
    }
    
    public static final void setUnitTest(boolean p0) {
    }
    
    public static final void printLogDebug(@org.jetbrains.annotations.Nullable()
    java.lang.String className, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}