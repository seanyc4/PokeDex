package com.seancoyle.launch_datasource.network.mappers.launch;

import com.seancoyle.launch_datasource.R;
import com.seancoyle.launch_datasource.network.abstraction.dateformatter.DateFormatter;
import com.seancoyle.launch_datasource.network.abstraction.datetransformer.DateTransformer;
import com.seancoyle.launch_datasource.network.model.launch.LaunchDto;
import com.seancoyle.launch_models.model.launch.LaunchModel;
import com.seancoyle.launch_models.model.launch.LaunchType;
import com.seancoyle.launch_models.model.launch.Links;
import com.seancoyle.launch_models.model.launch.Rocket;
import java.time.LocalDateTime;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0017\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002J\u0017\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/seancoyle/launch_datasource/network/mappers/launch/LaunchNetworkMapper;", "", "dateFormatter", "Lcom/seancoyle/launch_datasource/network/abstraction/dateformatter/DateFormatter;", "dateTransformer", "Lcom/seancoyle/launch_datasource/network/abstraction/datetransformer/DateTransformer;", "(Lcom/seancoyle/launch_datasource/network/abstraction/dateformatter/DateFormatter;Lcom/seancoyle/launch_datasource/network/abstraction/datetransformer/DateTransformer;)V", "isLaunchPastOrFuture", "", "localDateTime", "Ljava/time/LocalDateTime;", "mapEntityToList", "", "Lcom/seancoyle/launch_models/model/launch/LaunchModel;", "entity", "Lcom/seancoyle/launch_datasource/network/model/launch/LaunchDto;", "mapIsLaunchSuccessToInt", "", "isLaunchSuccess", "(Ljava/lang/Boolean;)I", "setCorrectLaunchText", "setIsLaunchSuccessIcon", "pokedex-datasource_debug"})
public final class LaunchNetworkMapper {
    private final com.seancoyle.launch_datasource.network.abstraction.dateformatter.DateFormatter dateFormatter = null;
    private final com.seancoyle.launch_datasource.network.abstraction.datetransformer.DateTransformer dateTransformer = null;
    
    @javax.inject.Inject()
    public LaunchNetworkMapper(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.abstraction.dateformatter.DateFormatter dateFormatter, @org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.abstraction.datetransformer.DateTransformer dateTransformer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.seancoyle.launch_models.model.launch.LaunchModel> mapEntityToList(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.model.launch.LaunchDto entity) {
        return null;
    }
    
    private final int mapIsLaunchSuccessToInt(java.lang.Boolean isLaunchSuccess) {
        return 0;
    }
    
    private final int setIsLaunchSuccessIcon(java.lang.Boolean isLaunchSuccess) {
        return 0;
    }
    
    private final int setCorrectLaunchText(java.time.LocalDateTime localDateTime) {
        return 0;
    }
    
    private final boolean isLaunchPastOrFuture(java.time.LocalDateTime localDateTime) {
        return false;
    }
}