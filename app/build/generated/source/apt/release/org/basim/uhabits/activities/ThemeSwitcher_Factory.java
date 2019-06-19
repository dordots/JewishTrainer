package org.basim.uhabits.activities;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.preferences.Preferences;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThemeSwitcher_Factory implements Factory<ThemeSwitcher> {
  private final Provider<BaseActivity> activityProvider;

  private final Provider<Preferences> preferencesProvider;

  public ThemeSwitcher_Factory(
      Provider<BaseActivity> activityProvider, Provider<Preferences> preferencesProvider) {
    assert activityProvider != null;
    this.activityProvider = activityProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public ThemeSwitcher get() {
    return new ThemeSwitcher(activityProvider.get(), preferencesProvider.get());
  }

  public static Factory<ThemeSwitcher> create(
      Provider<BaseActivity> activityProvider, Provider<Preferences> preferencesProvider) {
    return new ThemeSwitcher_Factory(activityProvider, preferencesProvider);
  }
}
