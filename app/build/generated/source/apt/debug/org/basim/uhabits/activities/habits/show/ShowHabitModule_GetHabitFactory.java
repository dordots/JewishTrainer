package org.basim.uhabits.activities.habits.show;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.basim.uhabits.models.Habit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShowHabitModule_GetHabitFactory implements Factory<Habit> {
  private final ShowHabitModule module;

  public ShowHabitModule_GetHabitFactory(ShowHabitModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Habit get() {
    return Preconditions.checkNotNull(
        module.getHabit(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Habit> create(ShowHabitModule module) {
    return new ShowHabitModule_GetHabitFactory(module);
  }
}
