package com.seancoyle.launch_datasource.network.implementation.datetransformer;

import com.seancoyle.launch_datasource.network.abstraction.datetransformer.DateTransformer;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\f\u0010\f\u001a\u00020\u0004*\u00020\rH\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/seancoyle/launch_datasource/network/implementation/datetransformer/DateTransformerImpl;", "Lcom/seancoyle/launch_datasource/network/abstraction/datetransformer/DateTransformer;", "()V", "formatDateTimeToString", "", "dateTime", "Ljava/time/LocalDateTime;", "getLaunchDaysDifference", "isPastLaunch", "", "launchDate", "returnYearOfLaunch", "addZeroToSingleDateValue", "", "pokedex-datasource_debug"})
@javax.inject.Singleton()
public final class DateTransformerImpl implements com.seancoyle.launch_datasource.network.abstraction.datetransformer.DateTransformer {
    
    public DateTransformerImpl() {
        super();
    }
    
    private final java.lang.String addZeroToSingleDateValue(int $this$addZeroToSingleDateValue) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isPastLaunch(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime launchDate) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String formatDateTimeToString(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime dateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLaunchDaysDifference(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime dateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String returnYearOfLaunch(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime launchDate) {
        return null;
    }
}