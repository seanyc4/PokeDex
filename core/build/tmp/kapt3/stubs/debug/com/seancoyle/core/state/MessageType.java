package com.seancoyle.core.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/seancoyle/core/state/MessageType;", "", "()V", "Error", "Info", "None", "Success", "Lcom/seancoyle/core/state/MessageType$Error;", "Lcom/seancoyle/core/state/MessageType$Info;", "Lcom/seancoyle/core/state/MessageType$None;", "Lcom/seancoyle/core/state/MessageType$Success;", "core_debug"})
public abstract class MessageType {
    
    private MessageType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/seancoyle/core/state/MessageType$Success;", "Lcom/seancoyle/core/state/MessageType;", "()V", "core_debug"})
    public static final class Success extends com.seancoyle.core.state.MessageType {
        @org.jetbrains.annotations.NotNull()
        public static final com.seancoyle.core.state.MessageType.Success INSTANCE = null;
        
        private Success() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/seancoyle/core/state/MessageType$Error;", "Lcom/seancoyle/core/state/MessageType;", "()V", "core_debug"})
    public static final class Error extends com.seancoyle.core.state.MessageType {
        @org.jetbrains.annotations.NotNull()
        public static final com.seancoyle.core.state.MessageType.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/seancoyle/core/state/MessageType$Info;", "Lcom/seancoyle/core/state/MessageType;", "()V", "core_debug"})
    public static final class Info extends com.seancoyle.core.state.MessageType {
        @org.jetbrains.annotations.NotNull()
        public static final com.seancoyle.core.state.MessageType.Info INSTANCE = null;
        
        private Info() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/seancoyle/core/state/MessageType$None;", "Lcom/seancoyle/core/state/MessageType;", "()V", "core_debug"})
    public static final class None extends com.seancoyle.core.state.MessageType {
        @org.jetbrains.annotations.NotNull()
        public static final com.seancoyle.core.state.MessageType.None INSTANCE = null;
        
        private None() {
            super();
        }
    }
}