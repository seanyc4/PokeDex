package com.seancoyle.core.state;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.seancoyle.core.testing.EspressoIdlingResource;

/**
 * - Keeps track of active StateEvents in DataChannelManager
 * - Keeps track of whether the progress bar should show or not based on a boolean
 *     value in each StateEvent (shouldDisplayProgressBar)
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0010J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0016\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\b\u0010\u0017\u001a\u00020\u0010H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/seancoyle/core/state/StateEventManager;", "", "()V", "_shouldDisplayProgressBar", "Landroidx/lifecycle/MutableLiveData;", "", "activeStateEvents", "Ljava/util/HashMap;", "", "Lcom/seancoyle/core/state/StateEvent;", "Lkotlin/collections/HashMap;", "shouldDisplayProgressBar", "Landroidx/lifecycle/LiveData;", "getShouldDisplayProgressBar", "()Landroidx/lifecycle/LiveData;", "addStateEvent", "", "stateEvent", "clearActiveStateEventCounter", "getActiveJobNames", "", "isStateEventActive", "removeStateEvent", "syncNumActiveStateEvents", "core_debug"})
public final class StateEventManager {
    private final java.util.HashMap<java.lang.String, com.seancoyle.core.state.StateEvent> activeStateEvents = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _shouldDisplayProgressBar = null;
    
    public StateEventManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldDisplayProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getActiveJobNames() {
        return null;
    }
    
    public final void clearActiveStateEventCounter() {
    }
    
    public final void addStateEvent(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent) {
    }
    
    public final void removeStateEvent(@org.jetbrains.annotations.Nullable()
    com.seancoyle.core.state.StateEvent stateEvent) {
    }
    
    public final boolean isStateEventActive(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent) {
        return false;
    }
    
    private final void syncNumActiveStateEvents() {
    }
}