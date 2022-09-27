package com.seancoyle.core_datastore;

import android.app.Application;
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
public final class DataStoreModule_ProvideDataStoreManagerFactory implements Factory<AppDataStore> {
  private final Provider<Application> applicationProvider;

  public DataStoreModule_ProvideDataStoreManagerFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDataStore get() {
    return provideDataStoreManager(applicationProvider.get());
  }

  public static DataStoreModule_ProvideDataStoreManagerFactory create(
      Provider<Application> applicationProvider) {
    return new DataStoreModule_ProvideDataStoreManagerFactory(applicationProvider);
  }

  public static AppDataStore provideDataStoreManager(Application application) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.provideDataStoreManager(application));
  }
}
