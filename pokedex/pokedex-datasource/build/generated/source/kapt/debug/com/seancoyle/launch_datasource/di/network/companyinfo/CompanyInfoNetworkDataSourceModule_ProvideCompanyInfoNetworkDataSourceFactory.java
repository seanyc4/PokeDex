package com.seancoyle.launch_datasource.di.network.companyinfo;

import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource;
import com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi;
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CompanyInfoNetworkDataSourceModule_ProvideCompanyInfoNetworkDataSourceFactory implements Factory<CompanyInfoNetworkDataSource> {
  private final Provider<CompanyInfoApi> apiProvider;

  private final Provider<CompanyInfoNetworkMapper> networkMapperProvider;

  public CompanyInfoNetworkDataSourceModule_ProvideCompanyInfoNetworkDataSourceFactory(
      Provider<CompanyInfoApi> apiProvider,
      Provider<CompanyInfoNetworkMapper> networkMapperProvider) {
    this.apiProvider = apiProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public CompanyInfoNetworkDataSource get() {
    return provideCompanyInfoNetworkDataSource(apiProvider.get(), networkMapperProvider.get());
  }

  public static CompanyInfoNetworkDataSourceModule_ProvideCompanyInfoNetworkDataSourceFactory create(
      Provider<CompanyInfoApi> apiProvider,
      Provider<CompanyInfoNetworkMapper> networkMapperProvider) {
    return new CompanyInfoNetworkDataSourceModule_ProvideCompanyInfoNetworkDataSourceFactory(apiProvider, networkMapperProvider);
  }

  public static CompanyInfoNetworkDataSource provideCompanyInfoNetworkDataSource(CompanyInfoApi api,
      CompanyInfoNetworkMapper networkMapper) {
    return Preconditions.checkNotNullFromProvides(CompanyInfoNetworkDataSourceModule.INSTANCE.provideCompanyInfoNetworkDataSource(api, networkMapper));
  }
}
