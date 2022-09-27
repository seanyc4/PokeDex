package com.seancoyle.launch_datasource.cache.implementation.launch;

import com.seancoyle.database.daos.LaunchDao;
import com.seancoyle.launch_datasource.cache.mappers.launch.LaunchEntityMapper;
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
public final class LaunchCacheDataSourceImpl_Factory implements Factory<LaunchCacheDataSourceImpl> {
  private final Provider<LaunchDao> daoProvider;

  private final Provider<LaunchEntityMapper> entityMapperProvider;

  public LaunchCacheDataSourceImpl_Factory(Provider<LaunchDao> daoProvider,
      Provider<LaunchEntityMapper> entityMapperProvider) {
    this.daoProvider = daoProvider;
    this.entityMapperProvider = entityMapperProvider;
  }

  @Override
  public LaunchCacheDataSourceImpl get() {
    return newInstance(daoProvider.get(), entityMapperProvider.get());
  }

  public static LaunchCacheDataSourceImpl_Factory create(Provider<LaunchDao> daoProvider,
      Provider<LaunchEntityMapper> entityMapperProvider) {
    return new LaunchCacheDataSourceImpl_Factory(daoProvider, entityMapperProvider);
  }

  public static LaunchCacheDataSourceImpl newInstance(LaunchDao dao,
      LaunchEntityMapper entityMapper) {
    return new LaunchCacheDataSourceImpl(dao, entityMapper);
  }
}
