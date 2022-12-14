package com.seancoyle.pokedex.framework.datasource.network.company

import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper
import com.seancoyle.launch_models.model.company.CompanyInfoModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeCompanyInfoNetworkDataSourceImpl
@Inject
constructor(
    private val fakeApi: FakeCompanyInfoApi,
    private val networkMapper: CompanyInfoNetworkMapper
) : CompanyInfoNetworkDataSource {

    override suspend fun getCompanyInfo(): CompanyInfoModel {
        return networkMapper.mapFromEntity(
            fakeApi.getCompanyInfo()
        )
    }
}
