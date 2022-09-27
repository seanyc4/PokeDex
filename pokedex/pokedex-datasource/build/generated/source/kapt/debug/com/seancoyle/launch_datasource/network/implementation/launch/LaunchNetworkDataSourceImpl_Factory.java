package com.seancoyle.launch_datasource.network.implementation.launch;

import com.seancoyle.launch_datasource.network.api.launch.LaunchApi;
import com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper;
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
public final class LaunchNetworkDataSourceImpl_Factory implements Factory<LaunchNetworkDataSourceImpl> {
  private final Provider<LaunchApi> apiProvider;

  private final Provider<LaunchNetworkMapper> networkMapperProvider;

  public LaunchNetworkDataSourceImpl_Factory(Provider<LaunchApi> apiProvider,
      Provider<LaunchNetworkMapper> networkMapperProvider) {
    this.apiProvider = apiProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public LaunchNetworkDataSourceImpl get() {
    return newInstance(apiProvider.get(), networkMapperProvider.get());
  }

  public static LaunchNetworkDataSourceImpl_Factory create(Provider<LaunchApi> apiProvider,
      Provider<LaunchNetworkMapper> networkMapperProvider) {
    return new LaunchNetworkDataSourceImpl_Factory(apiProvider, networkMapperProvider);
  }

  public static LaunchNetworkDataSourceImpl newInstance(LaunchApi api,
      LaunchNetworkMapper networkMapper) {
    return new LaunchNetworkDataSourceImpl(api, networkMapper);
  }
}
