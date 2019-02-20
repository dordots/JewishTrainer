package org.basim.uhabits.activities.habits.list.model;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.models.HabitList;
import org.basim.uhabits.tasks.TaskRunner;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HabitCardListCache_Factory implements Factory<HabitCardListCache> {
  private final Provider<HabitList> allHabitsProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<TaskRunner> taskRunnerProvider;

  public HabitCardListCache_Factory(
      Provider<HabitList> allHabitsProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<TaskRunner> taskRunnerProvider) {
    assert allHabitsProvider != null;
    this.allHabitsProvider = allHabitsProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
    assert taskRunnerProvider != null;
    this.taskRunnerProvider = taskRunnerProvider;
  }

  @Override
  public HabitCardListCache get() {
    return new HabitCardListCache(
        allHabitsProvider.get(), commandRunnerProvider.get(), taskRunnerProvider.get());
  }

  public static Factory<HabitCardListCache> create(
      Provider<HabitList> allHabitsProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<TaskRunner> taskRunnerProvider) {
    return new HabitCardListCache_Factory(
        allHabitsProvider, commandRunnerProvider, taskRunnerProvider);
  }
}
