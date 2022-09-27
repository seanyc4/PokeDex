package com.seancoyle.launch_datasource.network.abstraction.datetransformer;

import java.time.LocalDateTime;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/seancoyle/launch_datasource/network/abstraction/datetransformer/DateTransformer;", "", "formatDateTimeToString", "", "dateTime", "Ljava/time/LocalDateTime;", "getLaunchDaysDifference", "isPastLaunch", "", "launchDate", "returnYearOfLaunch", "pokedex-datasource_debug"})
public abstract interface DateTransformer {
    
    public abstract boolean isPastLaunch(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime launchDate);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String formatDateTimeToString(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime dateTime);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLaunchDaysDifference(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime dateTime);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String returnYearOfLaunch(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime launchDate);
}