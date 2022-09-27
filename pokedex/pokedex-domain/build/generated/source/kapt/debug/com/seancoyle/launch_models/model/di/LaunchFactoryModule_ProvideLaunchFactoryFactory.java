package com.seancoyle.launch_models.model.di;

import com.seancoyle.launch_models.model.launch.LaunchFactory;
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
public final class LaunchFactoryModule_ProvideLaunchFactoryFactory implements Factory<LaunchFactory> {
  @Override
  public LaunchFactory get() {
    return provideLaunchFactory();
  }

  public static LaunchFactoryModule_ProvideLaunchFactoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LaunchFactory provideLaunchFactory() {
    return Preconditions.checkNotNullFromProvides(LaunchFactoryModule.INSTANCE.provideLaunchFactory());
  }

  private static final class InstanceHolder {
    private static final LaunchFactoryModule_ProvideLaunchFactoryFactory INSTANCE = new LaunchFactoryModule_ProvideLaunchFactoryFactory();
  }
}
