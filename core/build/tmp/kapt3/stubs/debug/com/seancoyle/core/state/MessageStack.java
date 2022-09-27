package com.seancoyle.core.state;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlinx.parcelize.IgnoredOnParcel;
import java.lang.IndexOutOfBoundsException;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0016\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0004R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8F\u00a2\u0006\f\u0012\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/seancoyle/core/state/MessageStack;", "Ljava/util/ArrayList;", "Lcom/seancoyle/core/state/StateMessage;", "Lkotlin/collections/ArrayList;", "()V", "_stateMessage", "Landroidx/lifecycle/MutableLiveData;", "get_stateMessage$annotations", "stateMessage", "Landroidx/lifecycle/LiveData;", "getStateMessage$annotations", "getStateMessage", "()Landroidx/lifecycle/LiveData;", "add", "", "element", "addAll", "elements", "", "isStackEmpty", "removeAt", "index", "", "setStateMessage", "", "core_debug"})
public final class MessageStack extends java.util.ArrayList<com.seancoyle.core.state.StateMessage> {
    private final androidx.lifecycle.MutableLiveData<com.seancoyle.core.state.StateMessage> _stateMessage = null;
    
    public MessageStack() {
        super(0);
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    private static void get_stateMessage$annotations() {
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getStateMessage$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.seancoyle.core.state.StateMessage> getStateMessage() {
        return null;
    }
    
    public final boolean isStackEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean addAll(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends com.seancoyle.core.state.StateMessage> elements) {
        return false;
    }
    
    @java.lang.Override()
    public boolean add(@org.jetbrains.annotations.NotNull()
    com.seancoyle.core.state.StateMessage element) {
        return false;
    }
    
    @java.lang.Override()
    public final com.seancoyle.core.state.StateMessage remove(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.seancoyle.core.state.StateMessage removeAt(int index) {
        return null;
    }
    
    private final void setStateMessage(com.seancoyle.core.state.StateMessage stateMessage) {
    }
    
    @java.lang.Override()
    public boolean contains(com.seancoyle.core.state.StateMessage element) {
        return false;
    }
    
    @java.lang.Override()
    public final boolean contains(java.lang.Object element) {
        return false;
    }
    
    @java.lang.Override()
    public int getSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int indexOf(com.seancoyle.core.state.StateMessage element) {
        return 0;
    }
    
    @java.lang.Override()
    public final int indexOf(java.lang.Object element) {
        return 0;
    }
    
    @java.lang.Override()
    public int lastIndexOf(com.seancoyle.core.state.StateMessage element) {
        return 0;
    }
    
    @java.lang.Override()
    public final int lastIndexOf(java.lang.Object element) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean remove(com.seancoyle.core.state.StateMessage element) {
        return false;
    }
    
    @java.lang.Override()
    public final boolean remove(java.lang.Object element) {
        return false;
    }
    
    @java.lang.Override()
    public final int size() {
        return 0;
    }
}