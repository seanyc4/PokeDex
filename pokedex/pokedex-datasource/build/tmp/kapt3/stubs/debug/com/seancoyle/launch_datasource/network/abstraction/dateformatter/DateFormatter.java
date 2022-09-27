package com.seancoyle.launch_datasource.network.abstraction.dateformatter;

import java.time.LocalDateTime;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/seancoyle/launch_datasource/network/abstraction/dateformatter/DateFormatter;", "", "formatDate", "Ljava/time/LocalDateTime;", "dateString", "", "pokedex-datasource_debug"})
public abstract interface DateFormatter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.time.LocalDateTime formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dateString);
}