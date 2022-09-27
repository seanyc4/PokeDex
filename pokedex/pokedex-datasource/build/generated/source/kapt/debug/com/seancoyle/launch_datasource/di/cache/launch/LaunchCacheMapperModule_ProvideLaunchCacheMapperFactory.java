package com.seancoyle.launch_datasource.di.cache.launch;

import com.seancoyle.launch_datasource.cache.mappers.launch.LaunchEntityMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory implements Factory<LaunchEntityMapper> {
  @Override
  public LaunchEntityMapper get() {
    return provideLaunchCacheMapper();
  }

  public static LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LaunchEntityMapper provideLaunchCacheMapper() {
    return Preconditions.checkNotNullFromProvides(LaunchCacheMapperModule.INSTANCE.provideLaunchCacheMapper());
  }

  private static final class InstanceHolder {
    private static final LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory INSTANCE = new LaunchCacheMapperModule_ProvideLaunchCacheMapperFactory();
  }
}
