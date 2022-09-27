package com.seancoyle.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.seancoyle.core.di.MainDispatcher")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutineDispatcherModule_ProvideCoroutineDispatcherMainFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideCoroutineDispatcherMain();
  }

  public static CoroutineDispatcherModule_ProvideCoroutineDispatcherMainFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideCoroutineDispatcherMain() {
    return Preconditions.checkNotNullFromProvides(CoroutineDispatcherModule.INSTANCE.provideCoroutineDispatcherMain());
  }

  private static final class InstanceHolder {
    private static final CoroutineDispatcherModule_ProvideCoroutineDispatcherMainFactory INSTANCE = new CoroutineDispatcherModule_ProvideCoroutineDispatcherMainFactory();
  }
}
