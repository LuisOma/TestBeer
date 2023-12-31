// Generated by Dagger (https://dagger.dev).
package com.example.newbase.ui.main.beers;

import com.example.newbase.domain.useCase.GetBeerUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BeersViewModel_Factory implements Factory<BeersViewModel> {
  private final Provider<GetBeerUseCase> getBeerUseCaseProvider;

  public BeersViewModel_Factory(Provider<GetBeerUseCase> getBeerUseCaseProvider) {
    this.getBeerUseCaseProvider = getBeerUseCaseProvider;
  }

  @Override
  public BeersViewModel get() {
    return newInstance(getBeerUseCaseProvider.get());
  }

  public static BeersViewModel_Factory create(Provider<GetBeerUseCase> getBeerUseCaseProvider) {
    return new BeersViewModel_Factory(getBeerUseCaseProvider);
  }

  public static BeersViewModel newInstance(GetBeerUseCase getBeerUseCase) {
    return new BeersViewModel(getBeerUseCase);
  }
}
