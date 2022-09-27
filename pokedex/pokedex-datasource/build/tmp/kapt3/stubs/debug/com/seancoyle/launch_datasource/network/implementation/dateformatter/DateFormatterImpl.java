package com.seancoyle.launch_datasource.network.implementation.dateformatter;

import com.seancoyle.launch_datasource.network.abstraction.dateformatter.DateFormatter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/seancoyle/launch_datasource/network/implementation/dateformatter/DateFormatterImpl;", "Lcom/seancoyle/launch_datasource/network/abstraction/dateformatter/DateFormatter;", "dateFormat", "Ljava/time/format/DateTimeFormatter;", "(Ljava/time/format/DateTimeFormatter;)V", "formatDate", "Ljava/time/LocalDateTime;", "dateString", "", "pokedex-datasource_debug"})
@javax.inject.Singleton()
public final class DateFormatterImpl implements com.seancoyle.launch_datasource.network.abstraction.dateformatter.DateFormatter {
    private final java.time.format.DateTimeFormatter dateFormat = null;
    
    public DateFormatterImpl(@org.jetbrains.annotations.NotNull()
    java.time.format.DateTimeFormatter dateFormat) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.time.LocalDateTime formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dateString) {
        return null;
    }
}