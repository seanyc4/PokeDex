package com.seancoyle.core.state;

import com.seancoyle.core.di.IODispatcher;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.*;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u001b\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014J\u0010\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020 J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010*\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010,\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/0.J\u0006\u00100\u001a\u00020\u0014J\u0010\u00101\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u00102\u001a\u00020\u0014J\u0010\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/seancoyle/core/state/DataChannelManager;", "ViewState", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "channelScope", "Lkotlinx/coroutines/CoroutineScope;", "messageStack", "Lcom/seancoyle/core/state/MessageStack;", "getMessageStack", "()Lcom/seancoyle/core/state/MessageStack;", "shouldDisplayProgressBar", "Landroidx/lifecycle/LiveData;", "", "getShouldDisplayProgressBar", "()Landroidx/lifecycle/LiveData;", "stateEventManager", "Lcom/seancoyle/core/state/StateEventManager;", "addStateEvent", "", "stateEvent", "Lcom/seancoyle/core/state/StateEvent;", "appendStateMessage", "stateMessage", "Lcom/seancoyle/core/state/StateMessage;", "canExecuteNewStateEvent", "cancelJobs", "clearActiveStateEventCounter", "clearAllStateMessages", "clearStateMessage", "index", "", "getActiveJobs", "", "", "getChannelScope", "handleNewData", "data", "(Ljava/lang/Object;)V", "handleNewStateMessage", "isJobAlreadyActive", "isMessageStackEmpty", "isStateEventActive", "launchJob", "jobFunction", "Lkotlinx/coroutines/flow/Flow;", "Lcom/seancoyle/core/state/DataState;", "printStateMessages", "removeStateEvent", "setupChannel", "setupNewChannelScope", "coroutineScope", "core_debug"})
public abstract class DataChannelManager<ViewState extends java.lang.Object> {
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private kotlinx.coroutines.CoroutineScope channelScope;
    private final com.seancoyle.core.state.StateEventManager stateEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.seancoyle.core.state.MessageStack messageStack = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> shouldDisplayProgressBar = null;
    
    public DataChannelManager(@org.jetbrains.annotations.NotNull()
    @com.seancoyle.core.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.core.state.MessageStack getMessageStack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldDisplayProgressBar() {
        return null;
    }
    
    public final void setupChannel() {
    }
    
    public abstract void handleNewData(ViewState data);
    
    public final void launchJob(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<com.seancoyle.core.state.DataState<ViewState>> jobFunction) {
    }
    
    private final boolean canExecuteNewStateEvent(com.seancoyle.core.state.StateEvent stateEvent) {
        return false;
    }
    
    public final boolean isMessageStackEmpty() {
        return false;
    }
    
    private final void handleNewStateMessage(com.seancoyle.core.state.StateMessage stateMessage) {
    }
    
    private final void appendStateMessage(com.seancoyle.core.state.StateMessage stateMessage) {
    }
    
    public final void clearStateMessage(int index) {
    }
    
    public final void clearAllStateMessages() {
    }
    
    public final void printStateMessages() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getActiveJobs() {
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
    
    private final boolean isStateEventActive(com.seancoyle.core.state.StateEvent stateEvent) {
        return false;
    }
    
    public final boolean isJobAlreadyActive(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getChannelScope(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        return null;
    }
    
    private final kotlinx.coroutines.CoroutineScope setupNewChannelScope(kotlinx.coroutines.CoroutineScope coroutineScope) {
        return null;
    }
    
    public final void cancelJobs() {
    }
}