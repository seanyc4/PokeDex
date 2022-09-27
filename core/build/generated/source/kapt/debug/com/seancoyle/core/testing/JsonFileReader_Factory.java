package com.seancoyle.core.testing;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class JsonFileReader_Factory implements Factory<JsonFileReader> {
  private final Provider<Application> applicationProvider;

  public JsonFileReader_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public JsonFileReader get() {
    return newInstance(applicationProvider.get());
  }

  public static JsonFileReader_Factory create(Provider<Application> applicationProvider) {
    return new JsonFileReader_Factory(applicationProvider);
  }

  public static JsonFileReader newInstance(Application application) {
    return new JsonFileReader(application);
  }
}
