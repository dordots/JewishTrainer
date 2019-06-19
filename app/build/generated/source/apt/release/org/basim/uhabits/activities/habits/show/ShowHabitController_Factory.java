package org.basim.uhabits.activities.habits.show;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.models.Habit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShowHabitController_Factory implements Factory<ShowHabitController> {
  private final Provider<ShowHabitScreen> screenProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<Habit> habitProvider;

  public ShowHabitController_Factory(
      Provider<ShowHabitScreen> screenProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<Habit> habitProvider) {
    assert screenProvider != null;
    this.screenProvider = screenProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
    assert habitProvider != null;
    this.habitProvider = habitProvider;
  }

  @Override
  public ShowHabitController get() {
    return new ShowHabitController(
        screenProvider.get(), commandRunnerProvider.get(), habitProvider.get());
  }

  public static Factory<ShowHabitController> create(
      Provider<ShowHabitScreen> screenProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<Habit> habitProvider) {
    return new ShowHabitController_Factory(screenProvider, commandRunnerProvider, habitProvider);
  }
}
