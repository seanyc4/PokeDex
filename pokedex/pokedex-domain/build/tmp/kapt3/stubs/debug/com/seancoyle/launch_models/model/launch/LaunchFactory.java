package com.seancoyle.launch_models.model.launch;

import java.time.LocalDateTime;
import java.util.*;
import javax.inject.Singleton;
import kotlin.collections.ArrayList;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002Jm\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0016J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/seancoyle/launch_models/model/launch/LaunchFactory;", "", "()V", "createLaunchItem", "Lcom/seancoyle/launch_models/model/launch/LaunchModel;", "id", "", "launchDate", "", "launchDateLocalDateTime", "Ljava/time/LocalDateTime;", "isLaunchSuccess", "launchSuccessIcon", "launchYear", "links", "Lcom/seancoyle/launch_models/model/launch/Links;", "missionName", "rocket", "Lcom/seancoyle/launch_models/model/launch/Rocket;", "daysToFromTitle", "launchDaysDifference", "type", "(ILjava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/Integer;ILjava/lang/String;Lcom/seancoyle/launch_models/model/launch/Links;Ljava/lang/String;Lcom/seancoyle/launch_models/model/launch/Rocket;ILjava/lang/String;I)Lcom/seancoyle/launch_models/model/launch/LaunchModel;", "createLaunchListTest", "", "num", "(ILjava/lang/Integer;)Ljava/util/List;", "pokedex-domain_debug"})
@javax.inject.Singleton()
public final class LaunchFactory {
    
    public LaunchFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_models.model.launch.LaunchModel createLaunchItem(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String launchDate, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime launchDateLocalDateTime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isLaunchSuccess, int launchSuccessIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String launchYear, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.Links links, @org.jetbrains.annotations.NotNull()
    java.lang.String missionName, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_models.model.launch.Rocket rocket, int daysToFromTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String launchDaysDifference, int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.seancoyle.launch_models.model.launch.LaunchModel> createLaunchListTest(int num, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
}