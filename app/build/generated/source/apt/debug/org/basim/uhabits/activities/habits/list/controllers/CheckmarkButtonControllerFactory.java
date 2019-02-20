package org.basim.uhabits.activities.habits.list.controllers;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public final class CheckmarkButtonControllerFactory {
  private final Provider<org.basim.uhabits.preferences.Preferences> prefsProvider;
  @Inject
  public CheckmarkButtonControllerFactory(Provider<org.basim.uhabits.preferences.Preferences> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }
  public CheckmarkButtonController create(org.basim.uhabits.models.Habit habit, long timestamp) {
    return new CheckmarkButtonController(prefsProvider.get(), habit, timestamp);
  }
}
