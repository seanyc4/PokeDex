package com.seancoyle.pokedex.di.data.companyinfo

import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper
import com.seancoyle.launch_datasource.di.network.companyinfo.CompanyInfoNetworkDataSourceModule
import com.seancoyle.pokedex.framework.datasource.network.company.FakeCompanyInfoApi
import com.seancoyle.pokedex.framework.datasource.network.company.FakeCompanyInfoNetworkDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [CompanyInfoNetworkDataSourceModule::class]
)
object TestCompanyInfoNetworkDataSourceModule {

    @Singleton
    @Provides
    fun provideCompanyInfoNetworkDataSource(
        fakeApi: FakeCompanyInfoApi,
        networkMapper: CompanyInfoNetworkMapper
    ): CompanyInfoNetworkDataSource {
        return FakeCompanyInfoNetworkDataSourceImpl(
            fakeApi = fakeApi,
            networkMapper = networkMapper
        )
    }

}