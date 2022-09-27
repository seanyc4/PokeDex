package com.seancoyle.launch_datasource.di.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

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
public final class RetrofitModule_ProvideLaunchRetrofitBuilderFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideLaunchRetrofitBuilder();
  }

  public static RetrofitModule_ProvideLaunchRetrofitBuilderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideLaunchRetrofitBuilder() {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideLaunchRetrofitBuilder());
  }

  private static final class InstanceHolder {
    private static final RetrofitModule_ProvideLaunchRetrofitBuilderFactory INSTANCE = new RetrofitModule_ProvideLaunchRetrofitBuilderFactory();
  }
}
