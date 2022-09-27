package com.seancoyle.core.testing;

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
public final class AndroidTestUtils_Factory implements Factory<AndroidTestUtils> {
  private final Provider<Boolean> isTestProvider;

  public AndroidTestUtils_Factory(Provider<Boolean> isTestProvider) {
    this.isTestProvider = isTestProvider;
  }

  @Override
  public AndroidTestUtils get() {
    return newInstance(isTestProvider.get());
  }

  public static AndroidTestUtils_Factory create(Provider<Boolean> isTestProvider) {
    return new AndroidTestUtils_Factory(isTestProvider);
  }

  public static AndroidTestUtils newInstance(boolean isTest) {
    return new AndroidTestUtils(isTest);
  }
}
