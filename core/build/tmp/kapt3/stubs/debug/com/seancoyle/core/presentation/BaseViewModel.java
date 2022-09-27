package com.seancoyle.core.presentation;

import androidx.lifecycle.*;
import com.seancoyle.core.di.IODispatcher;
import com.seancoyle.core.state.*;
import com.seancoyle.core.util.GenericErrors;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.Flow;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f0\u001e2\u0006\u0010 \u001a\u00020!J\"\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f0\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!J\u000b\u0010#\u001a\u00028\u0000\u00a2\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u001cJ\u0015\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010(J\r\u0010)\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010$J$\u0010*\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0014\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001eJ\u0006\u0010,\u001a\u00020\u0017J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H&J\u0013\u0010.\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00028\u0000\u00a2\u0006\u0002\u0010(J\u0006\u0010/\u001a\u00020\u0017R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010\u00a8\u00060"}, d2 = {"Lcom/seancoyle/core/presentation/BaseViewModel;", "ViewState", "Landroidx/lifecycle/ViewModel;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "dataChannelManager", "Lcom/seancoyle/core/state/DataChannelManager;", "getDataChannelManager", "()Lcom/seancoyle/core/state/DataChannelManager;", "shouldDisplayProgressBar", "Landroidx/lifecycle/LiveData;", "", "getShouldDisplayProgressBar", "()Landroidx/lifecycle/LiveData;", "stateMessage", "Lcom/seancoyle/core/state/StateMessage;", "getStateMessage", "viewState", "getViewState", "cancelActiveJobs", "", "clearActiveStateEvents", "clearAllStateMessages", "clearStateMessage", "index", "", "emitInvalidStateEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/seancoyle/core/state/DataState;", "stateEvent", "Lcom/seancoyle/core/state/StateEvent;", "emitStateMessageEvent", "getCurrentViewStateOrNew", "()Ljava/lang/Object;", "getMessageStackSize", "handleNewData", "data", "(Ljava/lang/Object;)V", "initNewViewState", "launchJob", "jobFunction", "printStateMessages", "setStateEvent", "setViewState", "setupChannel", "core_debug"})
public abstract class BaseViewModel<ViewState extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<ViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final com.seancoyle.core.state.DataChannelManager<ViewState> dataChannelManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> shouldDisplayProgressBar = null;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    @com.seancoyle.core.di.IODispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.core.state.DataChannelManager<ViewState> getDataChannelManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldDisplayProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.seancoyle.core.state.StateMessage> getStateMessage() {
        return null;
    }
    
    public final int getMessageStackSize() {
        return 0;
    }
    
    public final void setupChannel() {
    }
    
    public abstract void handleNewData(ViewState data);
    
    public abstract void setStateEvent(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent);
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.seancoyle.core.state.DataState<ViewState>> emitStateMessageEvent(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateMessage stateMessage, @org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.seancoyle.core.state.DataState<ViewState>> emitInvalidStateEvent(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent) {
        return null;
    }
    
    public final void launchJob(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateEvent stateEvent, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<com.seancoyle.core.state.DataState<ViewState>> jobFunction) {
    }
    
    public final ViewState getCurrentViewStateOrNew() {
        return null;
    }
    
    public final void setViewState(ViewState viewState) {
    }
    
    public final void clearStateMessage(int index) {
    }
    
    public final void clearActiveStateEvents() {
    }
    
    public final void clearAllStateMessages() {
    }
    
    public final void printStateMessages() {
    }
    
    public final void cancelActiveJobs() {
    }
    
    public abstract ViewState initNewViewState();
}