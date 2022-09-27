package com.seancoyle.launch_datasource.network.abstraction.numberformatter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/seancoyle/launch_datasource/network/abstraction/numberformatter/NumberFormatter;", "", "formatNumber", "", "number", "", "(Ljava/lang/Long;)Ljava/lang/String;", "pokedex-datasource_debug"})
public abstract interface NumberFormatter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String formatNumber(@org.jetbrains.annotations.Nullable()
    java.lang.Long number);
}