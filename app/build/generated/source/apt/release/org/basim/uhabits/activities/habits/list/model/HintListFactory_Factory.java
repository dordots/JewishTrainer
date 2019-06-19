package org.basim.uhabits.activities.habits.list.model;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.preferences.Preferences;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HintListFactory_Factory implements Factory<HintListFactory> {
  private final Provider<Preferences> prefsProvider;

  public HintListFactory_Factory(Provider<Preferences> prefsProvider) {
    assert prefsProvider != null;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public HintListFactory get() {
    return new HintListFactory(prefsProvider);
  }

  public static Factory<HintListFactory> create(Provider<Preferences> prefsProvider) {
    return new HintListFactory_Factory(prefsProvider);
  }
}
