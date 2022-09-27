package com.seancoyle.core.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/seancoyle/core/state/UIComponentType;", "", "()V", "Dialog", "None", "Toast", "Lcom/seancoyle/core/state/UIComponentType$Dialog;", "Lcom/seancoyle/core/state/UIComponentType$None;", "Lcom/seancoyle/core/state/UIComponentType$Toast;", "core_debug"})
public abstract class UIComponentType {
    
    private UIComponentType() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/seancoyle/core/state/UIComponentType$Toast;", "Lcom/seancoyle/core/state/UIComponentType;", "()V", "core_debug"})
    public static final class Toast extends com.seancoyle.core.state.UIComponentType {
        @org.jetbrains.annotations.NotNull()
        public static final com.seancoyle.core.state.UIComponentType.Toast INSTANCE = null;
        
        private Toast() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/seancoyle/core/state/UIComponentType$Dialog;", "Lcom/seancoyle/core/state/UIComponentType;", "()V", "core_debug"})
    public static final class Dialog extends com.seancoyle.core.state.UIComponentType {
        @org.jetbrains.annotations.NotNull()
        public static final com.seancoyle.core.state.UIComponentType.Dialog INSTANCE = null;
        
        private Dialog() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/seancoyle/core/state/UIComponentType$None;", "Lcom/seancoyle/core/state/UIComponentType;", "()V", "core_debug"})
    public static final class None extends com.seancoyle.core.state.UIComponentType {
        @org.jetbrains.annotations.NotNull()
        public static final com.seancoyle.core.state.UIComponentType.None INSTANCE = null;
        
        private None() {
            super();
        }
    }
}