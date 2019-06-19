package org.basim.uhabits.tasks;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
@Generated("com.google.auto.factory.processor.AutoFactoryProcessor")
public class ExportCSVTaskFactory {
  private final Provider<android.content.Context> contextProvider;
  private final Provider<org.basim.uhabits.models.HabitList> habitListProvider;
  @Inject
  public ExportCSVTaskFactory(@org.basim.uhabits.AppContext Provider<android.content.Context> contextProvider, Provider<org.basim.uhabits.models.HabitList> habitListProvider) {
    this.contextProvider = contextProvider;
    this.habitListProvider = habitListProvider;
  }
  public ExportCSVTask create(java.util.List<org.basim.uhabits.models.Habit> selectedHabits, ExportCSVTask.Listener listener) {
    return new ExportCSVTask(contextProvider.get(), habitListProvider.get(), selectedHabits, listener);
  }
}
