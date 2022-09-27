package com.seancoyle.launch_datasource.network.implementation.company;

import com.seancoyle.launch_datasource.network.api.company.CompanyInfoApi;
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class CompanyInfoNetworkDataSourceImpl_Factory implements Factory<CompanyInfoNetworkDataSourceImpl> {
  private final Provider<CompanyInfoApi> apiProvider;

  private final Provider<CompanyInfoNetworkMapper> networkMapperProvider;

  public CompanyInfoNetworkDataSourceImpl_Factory(Provider<CompanyInfoApi> apiProvider,
      Provider<CompanyInfoNetworkMapper> networkMapperProvider) {
    this.apiProvider = apiProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public CompanyInfoNetworkDataSourceImpl get() {
    return newInstance(apiProvider.get(), networkMapperProvider.get());
  }

  public static CompanyInfoNetworkDataSourceImpl_Factory create(
      Provider<CompanyInfoApi> apiProvider,
      Provider<CompanyInfoNetworkMapper> networkMapperProvider) {
    return new CompanyInfoNetworkDataSourceImpl_Factory(apiProvider, networkMapperProvider);
  }

  public static CompanyInfoNetworkDataSourceImpl newInstance(CompanyInfoApi api,
      CompanyInfoNetworkMapper networkMapper) {
    return new CompanyInfoNetworkDataSourceImpl(api, networkMapper);
  }
}
