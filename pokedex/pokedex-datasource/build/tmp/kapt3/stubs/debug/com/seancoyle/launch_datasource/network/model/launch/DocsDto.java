package com.seancoyle.launch_datasource.network.model.launch;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/seancoyle/launch_datasource/network/model/launch/DocsDto;", "", "flightNumber", "", "launchDate", "", "links", "Lcom/seancoyle/launch_datasource/network/model/launch/LinksDto;", "missionName", "rocket", "Lcom/seancoyle/launch_datasource/network/model/launch/RocketDto;", "isLaunchSuccess", "", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/seancoyle/launch_datasource/network/model/launch/LinksDto;Ljava/lang/String;Lcom/seancoyle/launch_datasource/network/model/launch/RocketDto;Ljava/lang/Boolean;)V", "getFlightNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLaunchDate", "()Ljava/lang/String;", "getLinks", "()Lcom/seancoyle/launch_datasource/network/model/launch/LinksDto;", "getMissionName", "getRocket", "()Lcom/seancoyle/launch_datasource/network/model/launch/RocketDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/seancoyle/launch_datasource/network/model/launch/LinksDto;Ljava/lang/String;Lcom/seancoyle/launch_datasource/network/model/launch/RocketDto;Ljava/lang/Boolean;)Lcom/seancoyle/launch_datasource/network/model/launch/DocsDto;", "equals", "other", "hashCode", "toString", "pokedex-datasource_debug"})
public final class DocsDto {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "flight_number")
    @com.google.gson.annotations.Expose()
    private final java.lang.Integer flightNumber = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "date_utc")
    @com.google.gson.annotations.Expose()
    private final java.lang.String launchDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "links")
    @com.google.gson.annotations.Expose()
    private final com.seancoyle.launch_datasource.network.model.launch.LinksDto links = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    @com.google.gson.annotations.Expose()
    private final java.lang.String missionName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rocket")
    @com.google.gson.annotations.Expose()
    private final com.seancoyle.launch_datasource.network.model.launch.RocketDto rocket = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "success")
    @com.google.gson.annotations.Expose()
    private final java.lang.Boolean isLaunchSuccess = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_datasource.network.model.launch.DocsDto copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer flightNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String launchDate, @org.jetbrains.annotations.Nullable()
    com.seancoyle.launch_datasource.network.model.launch.LinksDto links, @org.jetbrains.annotations.Nullable()
    java.lang.String missionName, @org.jetbrains.annotations.Nullable()
    com.seancoyle.launch_datasource.network.model.launch.RocketDto rocket, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isLaunchSuccess) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DocsDto(@org.jetbrains.annotations.Nullable()
    java.lang.Integer flightNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String launchDate, @org.jetbrains.annotations.Nullable()
    com.seancoyle.launch_datasource.network.model.launch.LinksDto links, @org.jetbrains.annotations.Nullable()
    java.lang.String missionName, @org.jetbrains.annotations.Nullable()
    com.seancoyle.launch_datasource.network.model.launch.RocketDto rocket, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isLaunchSuccess) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFlightNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLaunchDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.seancoyle.launch_datasource.network.model.launch.LinksDto component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.seancoyle.launch_datasource.network.model.launch.LinksDto getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMissionName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.seancoyle.launch_datasource.network.model.launch.RocketDto component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.seancoyle.launch_datasource.network.model.launch.RocketDto getRocket() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isLaunchSuccess() {
        return null;
    }
}