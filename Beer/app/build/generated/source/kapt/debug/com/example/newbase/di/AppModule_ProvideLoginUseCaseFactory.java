// Generated by Dagger (https://dagger.dev).
package com.example.newbase.di;

import com.example.newbase.data.repo.LoginRepository;
import com.example.newbase.domain.useCase.LoginUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideLoginUseCaseFactory implements Factory<LoginUseCase> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  public AppModule_ProvideLoginUseCaseFactory(Provider<LoginRepository> loginRepositoryProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
  }

  @Override
  public LoginUseCase get() {
    return provideLoginUseCase(loginRepositoryProvider.get());
  }

  public static AppModule_ProvideLoginUseCaseFactory create(
      Provider<LoginRepository> loginRepositoryProvider) {
    return new AppModule_ProvideLoginUseCaseFactory(loginRepositoryProvider);
  }

  public static LoginUseCase provideLoginUseCase(LoginRepository loginRepository) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLoginUseCase(loginRepository));
  }
}