package com.seancoyle.launch_datasource.di.network.launch;

import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource;
import com.seancoyle.launch_datasource.network.api.launch.LaunchApi;
import com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper;
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
public final class LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory implements Factory<LaunchNetworkDataSource> {
  private final Provider<LaunchApi> apiProvider;

  private final Provider<LaunchNetworkMapper> networkMapperProvider;

  public LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory(
      Provider<LaunchApi> apiProvider, Provider<LaunchNetworkMapper> networkMapperProvider) {
    this.apiProvider = apiProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public LaunchNetworkDataSource get() {
    return provideLaunchNetworkDataSource(apiProvider.get(), networkMapperProvider.get());
  }

  public static LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory create(
      Provider<LaunchApi> apiProvider, Provider<LaunchNetworkMapper> networkMapperProvider) {
    return new LaunchNetworkDataSourceModule_ProvideLaunchNetworkDataSourceFactory(apiProvider, networkMapperProvider);
  }

  public static LaunchNetworkDataSource provideLaunchNetworkDataSource(LaunchApi api,
      LaunchNetworkMapper networkMapper) {
    return Preconditions.checkNotNullFromProvides(LaunchNetworkDataSourceModule.INSTANCE.provideLaunchNetworkDataSource(api, networkMapper));
  }
}
