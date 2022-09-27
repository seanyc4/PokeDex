package com.seancoyle.launch_datasource.network.model.launch;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/seancoyle/launch_datasource/network/model/launch/LinksDto;", "", "patch", "Lcom/seancoyle/launch_datasource/network/model/launch/PatchDto;", "articleLink", "", "videoLink", "wikipedia", "(Lcom/seancoyle/launch_datasource/network/model/launch/PatchDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArticleLink", "()Ljava/lang/String;", "getPatch", "()Lcom/seancoyle/launch_datasource/network/model/launch/PatchDto;", "getVideoLink", "getWikipedia", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "pokedex-datasource_debug"})
public final class LinksDto {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "patch")
    @com.google.gson.annotations.Expose()
    private final com.seancoyle.launch_datasource.network.model.launch.PatchDto patch = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "article")
    @com.google.gson.annotations.Expose()
    private final java.lang.String articleLink = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "webcast")
    @com.google.gson.annotations.Expose()
    private final java.lang.String videoLink = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "wikipedia")
    @com.google.gson.annotations.Expose()
    private final java.lang.String wikipedia = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_datasource.network.model.launch.LinksDto copy(@org.jetbrains.annotations.Nullable()
    com.seancoyle.launch_datasource.network.model.launch.PatchDto patch, @org.jetbrains.annotations.Nullable()
    java.lang.String articleLink, @org.jetbrains.annotations.Nullable()
    java.lang.String videoLink, @org.jetbrains.annotations.Nullable()
    java.lang.String wikipedia) {
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
    
    public LinksDto(@org.jetbrains.annotations.Nullable()
    com.seancoyle.launch_datasource.network.model.launch.PatchDto patch, @org.jetbrains.annotations.Nullable()
    java.lang.String articleLink, @org.jetbrains.annotations.Nullable()
    java.lang.String videoLink, @org.jetbrains.annotations.Nullable()
    java.lang.String wikipedia) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.seancoyle.launch_datasource.network.model.launch.PatchDto component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.seancoyle.launch_datasource.network.model.launch.PatchDto getPatch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArticleLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVideoLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWikipedia() {
        return null;
    }
}