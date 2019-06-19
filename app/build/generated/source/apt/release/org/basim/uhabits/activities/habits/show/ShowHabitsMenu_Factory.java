package org.basim.uhabits.activities.habits.show;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.BaseActivity;
import org.basim.uhabits.models.Habit;
import org.basim.uhabits.tasks.ExportCSVTaskFactory;
import org.basim.uhabits.tasks.TaskRunner;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ShowHabitsMenu_Factory implements Factory<ShowHabitsMenu> {
  private final MembersInjector<ShowHabitsMenu> showHabitsMenuMembersInjector;

  private final Provider<BaseActivity> activityProvider;

  private final Provider<ShowHabitScreen> screenProvider;

  private final Provider<Habit> habitProvider;

  private final Provider<ExportCSVTaskFactory> exportCSVFactoryProvider;

  private final Provider<TaskRunner> taskRunnerProvider;

  public ShowHabitsMenu_Factory(
      MembersInjector<ShowHabitsMenu> showHabitsMenuMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<ShowHabitScreen> screenProvider,
      Provider<Habit> habitProvider,
      Provider<ExportCSVTaskFactory> exportCSVFactoryProvider,
      Provider<TaskRunner> taskRunnerProvider) {
    assert showHabitsMenuMembersInjector != null;
    this.showHabitsMenuMembersInjector = showHabitsMenuMembersInjector;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
    assert screenProvider != null;
    this.screenProvider = screenProvider;
    assert habitProvider != null;
    this.habitProvider = habitProvider;
    assert exportCSVFactoryProvider != null;
    this.exportCSVFactoryProvider = exportCSVFactoryProvider;
    assert taskRunnerProvider != null;
    this.taskRunnerProvider = taskRunnerProvider;
  }

  @Override
  public ShowHabitsMenu get() {
    return MembersInjectors.injectMembers(
        showHabitsMenuMembersInjector,
        new ShowHabitsMenu(
            activityProvider.get(),
            screenProvider.get(),
            habitProvider.get(),
            exportCSVFactoryProvider.get(),
            taskRunnerProvider.get()));
  }

  public static Factory<ShowHabitsMenu> create(
      MembersInjector<ShowHabitsMenu> showHabitsMenuMembersInjector,
      Provider<BaseActivity> activityProvider,
      Provider<ShowHabitScreen> screenProvider,
      Provider<Habit> habitProvider,
      Provider<ExportCSVTaskFactory> exportCSVFactoryProvider,
      Provider<TaskRunner> taskRunnerProvider) {
    return new ShowHabitsMenu_Factory(
        showHabitsMenuMembersInjector,
        activityProvider,
        screenProvider,
        habitProvider,
        exportCSVFactoryProvider,
        taskRunnerProvider);
  }
}
