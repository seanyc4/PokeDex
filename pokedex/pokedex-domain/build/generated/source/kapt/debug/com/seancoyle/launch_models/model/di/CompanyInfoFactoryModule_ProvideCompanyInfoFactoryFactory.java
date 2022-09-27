package com.seancoyle.launch_models.model.di;

import com.seancoyle.launch_models.model.company.CompanyInfoFactory;
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
public final class CompanyInfoFactoryModule_ProvideCompanyInfoFactoryFactory implements Factory<CompanyInfoFactory> {
  @Override
  public CompanyInfoFactory get() {
    return provideCompanyInfoFactory();
  }

  public static CompanyInfoFactoryModule_ProvideCompanyInfoFactoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CompanyInfoFactory provideCompanyInfoFactory() {
    return Preconditions.checkNotNullFromProvides(CompanyInfoFactoryModule.INSTANCE.provideCompanyInfoFactory());
  }

  private static final class InstanceHolder {
    private static final CompanyInfoFactoryModule_ProvideCompanyInfoFactoryFactory INSTANCE = new CompanyInfoFactoryModule_ProvideCompanyInfoFactoryFactory();
  }
}
