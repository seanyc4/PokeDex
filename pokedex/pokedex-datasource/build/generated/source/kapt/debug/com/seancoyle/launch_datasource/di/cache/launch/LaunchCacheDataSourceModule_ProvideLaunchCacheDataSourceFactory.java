package com.seancoyle.launch_datasource.di.cache.launch;

import com.seancoyle.database.daos.LaunchDao;
import com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource;
import com.seancoyle.launch_datasource.cache.mappers.launch.LaunchEntityMapper;
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
public final class LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory implements Factory<LaunchCacheDataSource> {
  private final Provider<LaunchDao> daoProvider;

  private final Provider<LaunchEntityMapper> launchEntityMapperProvider;

  public LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory(
      Provider<LaunchDao> daoProvider, Provider<LaunchEntityMapper> launchEntityMapperProvider) {
    this.daoProvider = daoProvider;
    this.launchEntityMapperProvider = launchEntityMapperProvider;
  }

  @Override
  public LaunchCacheDataSource get() {
    return provideLaunchCacheDataSource(daoProvider.get(), launchEntityMapperProvider.get());
  }

  public static LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory create(
      Provider<LaunchDao> daoProvider, Provider<LaunchEntityMapper> launchEntityMapperProvider) {
    return new LaunchCacheDataSourceModule_ProvideLaunchCacheDataSourceFactory(daoProvider, launchEntityMapperProvider);
  }

  public static LaunchCacheDataSource provideLaunchCacheDataSource(LaunchDao dao,
      LaunchEntityMapper launchEntityMapper) {
    return Preconditions.checkNotNullFromProvides(LaunchCacheDataSourceModule.INSTANCE.provideLaunchCacheDataSource(dao, launchEntityMapper));
  }
}
