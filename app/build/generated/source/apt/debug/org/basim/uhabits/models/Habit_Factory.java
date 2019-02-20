package org.basim.uhabits.models;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Habit_Factory implements Factory<Habit> {
  private final Provider<ModelFactory> factoryProvider;

  public Habit_Factory(Provider<ModelFactory> factoryProvider) {
    assert factoryProvider != null;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public Habit get() {
    return new Habit(factoryProvider.get());
  }

  public static Factory<Habit> create(Provider<ModelFactory> factoryProvider) {
    return new Habit_Factory(factoryProvider);
  }
}
