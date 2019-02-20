package org.basim.uhabits.activities.habits.list.controllers;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.preferences.Preferences;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CheckmarkButtonControllerFactory_Factory
    implements Factory<CheckmarkButtonControllerFactory> {
  private final Provider<Preferences> prefsProvider;

  public CheckmarkButtonControllerFactory_Factory(Provider<Preferences> prefsProvider) {
    assert prefsProvider != null;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public CheckmarkButtonControllerFactory get() {
    return new CheckmarkButtonControllerFactory(prefsProvider);
  }

  public static Factory<CheckmarkButtonControllerFactory> create(
      Provider<Preferences> prefsProvider) {
    return new CheckmarkButtonControllerFactory_Factory(prefsProvider);
  }
}
