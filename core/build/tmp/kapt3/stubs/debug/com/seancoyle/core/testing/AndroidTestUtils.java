package com.seancoyle.core.testing;

import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/seancoyle/core/testing/AndroidTestUtils;", "", "isTest", "", "(Z)V", "core_debug"})
@javax.inject.Singleton()
public final class AndroidTestUtils {
    private final boolean isTest = false;
    
    @javax.inject.Inject()
    public AndroidTestUtils(boolean isTest) {
        super();
    }
    
    public final boolean isTest() {
        return false;
    }
}