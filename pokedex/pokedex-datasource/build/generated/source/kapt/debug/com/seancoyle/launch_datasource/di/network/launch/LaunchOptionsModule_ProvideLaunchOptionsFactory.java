package com.seancoyle.launch_datasource.di.network.launch;

import com.seancoyle.launch_datasource.di.network.LaunchOptionsModule;
import com.seancoyle.launch_models.model.launch.LaunchOptions;
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
public final class LaunchOptionsModule_ProvideLaunchOptionsFactory implements Factory<LaunchOptions> {
  @Override
  public LaunchOptions get() {
    return provideLaunchOptions();
  }

  public static LaunchOptionsModule_ProvideLaunchOptionsFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LaunchOptions provideLaunchOptions() {
    return Preconditions.checkNotNullFromProvides(LaunchOptionsModule.INSTANCE.provideLaunchOptions());
  }

  private static final class InstanceHolder {
    private static final LaunchOptionsModule_ProvideLaunchOptionsFactory INSTANCE = new LaunchOptionsModule_ProvideLaunchOptionsFactory();
  }
}
