package com.seancoyle.launch_models.model.launch;

import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import kotlinx.parcelize.Parcelize;
import java.time.LocalDateTime;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0004H\u00c6\u0003J\t\u0010(\u001a\u00020\u0004H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0004H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0004H\u00c6\u0003J\t\u00100\u001a\u00020\rH\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\u0088\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0002\u00104J\t\u00105\u001a\u00020\u0004H\u00d6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u00020\u0004H\u0016J\t\u0010;\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016\u00a8\u0006A"}, d2 = {"Lcom/seancoyle/launch_models/model/launch/LaunchModel;", "Landroid/os/Parcelable;", "Lcom/seancoyle/launch_models/model/launch/LaunchType;", "id", "", "launchDate", "", "launchDateLocalDateTime", "Ljava/time/LocalDateTime;", "launchYear", "isLaunchSuccess", "launchSuccessIcon", "links", "Lcom/seancoyle/launch_models/model/launch/Links;", "missionName", "rocket", "Lcom/seancoyle/launch_models/model/launch/Rocket;", "daysToFromTitle", "launchDaysDifference", "type", "(ILjava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/Integer;ILcom/seancoyle/launch_models/model/launch/Links;Ljava/lang/String;Lcom/seancoyle/launch_models/model/launch/Rocket;ILjava/lang/String;I)V", "getDaysToFromTitle", "()I", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLaunchDate", "()Ljava/lang/String;", "getLaunchDateLocalDateTime", "()Ljava/time/LocalDateTime;", "getLaunchDaysDifference", "getLaunchSuccessIcon", "getLaunchYear", "getLinks", "()Lcom/seancoyle/launch_models/model/launch/Links;", "getMissionName", "getRocket", "()Lcom/seancoyle/launch_models/model/launch/Rocket;", "getType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/Integer;ILcom/seancoyle/launch_models/model/launch/Links;Ljava/lang/String;Lcom/seancoyle/launch_models/model/launch/Rocket;ILjava/lang/String;I)Lcom/seancoyle/launch_models/model/launch/LaunchModel;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "pokedex-domain_debug"})
public final class LaunchModel extends com.seancoyle.launch_models.model.launch.LaunchType implements android.os.Parcelable {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String launchDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime launchDateLocalDateTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String launchYear = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer isLaunchSuccess = null;
    private final int launchSuccessIcon = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.seancoyle.launch_models.model.launch.Links links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String missionName = null;
    @org.jetbrains.annotations.NotNull()
    private final com.seancoyle.launch_models.model.launch.Rocket rocket = null;
    private final int daysToFromTitle = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String launchDaysDifference = null;
    private final int type = 0;
    public static final android.os.Parcelable.Creator<com.seancoyle.launch_models.model.launch.LaunchModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_models.model.launch.LaunchModel copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String launchDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime launchDateLocalDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String launchYear, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isLaunchSuccess, @androidx.annotation.DrawableRes()
    int launchSuccessIcon, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.Links links, @org.jetbrains.annotations.NotNull()
    java.lang.String missionName, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.Rocket rocket, @androidx.annotation.StringRes()
    int daysToFromTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String launchDaysDifference, int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public LaunchModel(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String launchDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime launchDateLocalDateTime, @org.jetbrains.annotations.NotNull()
    java.lang.String launchYear, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isLaunchSuccess, @androidx.annotation.DrawableRes()
    int launchSuccessIcon, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.Links links, @org.jetbrains.annotations.NotNull()
    java.lang.String missionName, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.Rocket rocket, @androidx.annotation.StringRes()
    int daysToFromTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String launchDaysDifference, int type) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getLaunchDateLocalDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer isLaunchSuccess() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getLaunchSuccessIcon() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_models.model.launch.Links component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_models.model.launch.Links getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMissionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_models.model.launch.Rocket component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_models.model.launch.Rocket getRocket() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getDaysToFromTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchDaysDifference() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @java.lang.Override()
    public int getType() {
        return 0;
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
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.seancoyle.launch_models.model.launch.LaunchModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.seancoyle.launch_models.model.launch.LaunchModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.seancoyle.launch_models.model.launch.LaunchModel[] newArray(int size) {
            return null;
        }
    }
}