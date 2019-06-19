package org.basim.uhabits.activities.habits.list.model;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public final class HintListFactory {
  private final Provider<org.basim.uhabits.preferences.Preferences> prefsProvider;
  @Inject
  public HintListFactory(Provider<org.basim.uhabits.preferences.Preferences> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }
  public HintList create(String[] hints) {
    return new HintList(prefsProvider.get(), hints);
  }
}
