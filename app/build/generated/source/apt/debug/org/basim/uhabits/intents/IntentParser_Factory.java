package org.basim.uhabits.intents;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.models.HabitList;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IntentParser_Factory implements Factory<IntentParser> {
  private final Provider<HabitList> habitsProvider;

  public IntentParser_Factory(Provider<HabitList> habitsProvider) {
    assert habitsProvider != null;
    this.habitsProvider = habitsProvider;
  }

  @Override
  public IntentParser get() {
    return new IntentParser(habitsProvider.get());
  }

  public static Factory<IntentParser> create(Provider<HabitList> habitsProvider) {
    return new IntentParser_Factory(habitsProvider);
  }
}
