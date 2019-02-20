package org.basim.uhabits.models.sqlite;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.basim.uhabits.models.HabitList;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum SQLModelFactory_ProvideHabitListFactory implements Factory<HabitList> {
  INSTANCE;

  @Override
  public HabitList get() {
    return Preconditions.checkNotNull(
        SQLModelFactory.provideHabitList(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HabitList> create() {
    return INSTANCE;
  }
}
