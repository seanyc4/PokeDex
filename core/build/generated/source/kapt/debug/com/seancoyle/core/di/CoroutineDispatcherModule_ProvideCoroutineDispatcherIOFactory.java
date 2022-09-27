package com.seancoyle.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.seancoyle.core.di.IODispatcher")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutineDispatcherModule_ProvideCoroutineDispatcherIOFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideCoroutineDispatcherIO();
  }

  public static CoroutineDispatcherModule_ProvideCoroutineDispatcherIOFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideCoroutineDispatcherIO() {
    return Preconditions.checkNotNullFromProvides(CoroutineDispatcherModule.INSTANCE.provideCoroutineDispatcherIO());
  }

  private static final class InstanceHolder {
    private static final CoroutineDispatcherModule_ProvideCoroutineDispatcherIOFactory INSTANCE = new CoroutineDispatcherModule_ProvideCoroutineDispatcherIOFactory();
  }
}
