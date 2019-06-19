package org.basim.uhabits.activities.habits.list;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.BaseSystem;
import org.basim.uhabits.activities.habits.list.model.HabitCardListAdapter;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.models.HabitList;
import org.basim.uhabits.preferences.Preferences;
import org.basim.uhabits.tasks.ExportCSVTaskFactory;
import org.basim.uhabits.tasks.ExportDBTaskFactory;
import org.basim.uhabits.tasks.ImportDataTaskFactory;
import org.basim.uhabits.tasks.TaskRunner;
import org.basim.uhabits.utils.ReminderScheduler;
import org.basim.uhabits.widgets.WidgetUpdater;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListHabitsController_Factory implements Factory<ListHabitsController> {
  private final Provider<BaseSystem> systemProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<HabitList> habitListProvider;

  private final Provider<HabitCardListAdapter> adapterProvider;

  private final Provider<ListHabitsScreen> screenProvider;

  private final Provider<Preferences> prefsProvider;

  private final Provider<ReminderScheduler> reminderSchedulerProvider;

  private final Provider<TaskRunner> taskRunnerProvider;

  private final Provider<WidgetUpdater> widgetUpdaterProvider;

  private final Provider<ImportDataTaskFactory> importTaskFactoryProvider;

  private final Provider<ExportCSVTaskFactory> exportCSVFactoryProvider;

  private final Provider<ExportDBTaskFactory> exportDBFactoryProvider;

  public ListHabitsController_Factory(
      Provider<BaseSystem> systemProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<HabitList> habitListProvider,
      Provider<HabitCardListAdapter> adapterProvider,
      Provider<ListHabitsScreen> screenProvider,
      Provider<Preferences> prefsProvider,
      Provider<ReminderScheduler> reminderSchedulerProvider,
      Provider<TaskRunner> taskRunnerProvider,
      Provider<WidgetUpdater> widgetUpdaterProvider,
      Provider<ImportDataTaskFactory> importTaskFactoryProvider,
      Provider<ExportCSVTaskFactory> exportCSVFactoryProvider,
      Provider<ExportDBTaskFactory> exportDBFactoryProvider) {
    assert systemProvider != null;
    this.systemProvider = systemProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
    assert habitListProvider != null;
    this.habitListProvider = habitListProvider;
    assert adapterProvider != null;
    this.adapterProvider = adapterProvider;
    assert screenProvider != null;
    this.screenProvider = screenProvider;
    assert prefsProvider != null;
    this.prefsProvider = prefsProvider;
    assert reminderSchedulerProvider != null;
    this.reminderSchedulerProvider = reminderSchedulerProvider;
    assert taskRunnerProvider != null;
    this.taskRunnerProvider = taskRunnerProvider;
    assert widgetUpdaterProvider != null;
    this.widgetUpdaterProvider = widgetUpdaterProvider;
    assert importTaskFactoryProvider != null;
    this.importTaskFactoryProvider = importTaskFactoryProvider;
    assert exportCSVFactoryProvider != null;
    this.exportCSVFactoryProvider = exportCSVFactoryProvider;
    assert exportDBFactoryProvider != null;
    this.exportDBFactoryProvider = exportDBFactoryProvider;
  }

  @Override
  public ListHabitsController get() {
    return new ListHabitsController(
        systemProvider.get(),
        commandRunnerProvider.get(),
        habitListProvider.get(),
        adapterProvider.get(),
        screenProvider.get(),
        prefsProvider.get(),
        reminderSchedulerProvider.get(),
        taskRunnerProvider.get(),
        widgetUpdaterProvider.get(),
        importTaskFactoryProvider.get(),
        exportCSVFactoryProvider.get(),
        exportDBFactoryProvider.get());
  }

  public static Factory<ListHabitsController> create(
      Provider<BaseSystem> systemProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<HabitList> habitListProvider,
      Provider<HabitCardListAdapter> adapterProvider,
      Provider<ListHabitsScreen> screenProvider,
      Provider<Preferences> prefsProvider,
      Provider<ReminderScheduler> reminderSchedulerProvider,
      Provider<TaskRunner> taskRunnerProvider,
      Provider<WidgetUpdater> widgetUpdaterProvider,
      Provider<ImportDataTaskFactory> importTaskFactoryProvider,
      Provider<ExportCSVTaskFactory> exportCSVFactoryProvider,
      Provider<ExportDBTaskFactory> exportDBFactoryProvider) {
    return new ListHabitsController_Factory(
        systemProvider,
        commandRunnerProvider,
        habitListProvider,
        adapterProvider,
        screenProvider,
        prefsProvider,
        reminderSchedulerProvider,
        taskRunnerProvider,
        widgetUpdaterProvider,
        importTaskFactoryProvider,
        exportCSVFactoryProvider,
        exportDBFactoryProvider);
  }
}
