package com.seancoyle.launch_datasource.network.mappers.company;

import com.seancoyle.launch_datasource.network.abstraction.numberformatter.NumberFormatter;
import com.seancoyle.launch_datasource.network.model.company.CompanyInfoDto;
import com.seancoyle.launch_models.model.company.CompanyInfoModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/seancoyle/launch_datasource/network/mappers/company/CompanyInfoNetworkMapper;", "", "numberFormatter", "Lcom/seancoyle/launch_datasource/network/abstraction/numberformatter/NumberFormatter;", "(Lcom/seancoyle/launch_datasource/network/abstraction/numberformatter/NumberFormatter;)V", "mapFromEntity", "Lcom/seancoyle/launch_models/model/company/CompanyInfoModel;", "dto", "Lcom/seancoyle/launch_datasource/network/model/company/CompanyInfoDto;", "pokedex-datasource_debug"})
public final class CompanyInfoNetworkMapper {
    private final com.seancoyle.launch_datasource.network.abstraction.numberformatter.NumberFormatter numberFormatter = null;
    
    @javax.inject.Inject()
    public CompanyInfoNetworkMapper(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.abstraction.numberformatter.NumberFormatter numberFormatter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.seancoyle.launch_models.model.company.CompanyInfoModel mapFromEntity(@org.jetbrains.annotations.NotNull()
    com.seancoyle.launch_datasource.network.model.company.CompanyInfoDto dto) {
        return null;
    }
}