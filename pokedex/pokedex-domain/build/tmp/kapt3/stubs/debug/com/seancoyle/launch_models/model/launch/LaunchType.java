package com.seancoyle.launch_models.model.launch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/seancoyle/launch_models/model/launch/LaunchType;", "", "()V", "type", "", "getType", "()I", "Companion", "pokedex-domain_debug"})
public abstract class LaunchType {
    @org.jetbrains.annotations.NotNull()
    public static final com.seancoyle.launch_models.model.launch.LaunchType.Companion Companion = null;
    public static final int TYPE_TITLE = 0;
    public static final int TYPE_COMPANY = 1;
    public static final int TYPE_LAUNCH = 2;
    
    public LaunchType() {
        super();
    }
    
    public abstract int getType();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/seancoyle/launch_models/model/launch/LaunchType$Companion;", "", "()V", "TYPE_COMPANY", "", "TYPE_LAUNCH", "TYPE_TITLE", "pokedex-domain_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}