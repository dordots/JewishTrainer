package org.basim.uhabits.utils;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.HabitLogger;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.intents.IntentScheduler;
import org.basim.uhabits.intents.PendingIntentFactory;
import org.basim.uhabits.models.HabitList;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReminderScheduler_Factory implements Factory<ReminderScheduler> {
  private final Provider<PendingIntentFactory> pendingIntentFactoryProvider;

  private final Provider<IntentScheduler> intentSchedulerProvider;

  private final Provider<HabitLogger> loggerProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<HabitList> habitListProvider;

  public ReminderScheduler_Factory(
      Provider<PendingIntentFactory> pendingIntentFactoryProvider,
      Provider<IntentScheduler> intentSchedulerProvider,
      Provider<HabitLogger> loggerProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<HabitList> habitListProvider) {
    assert pendingIntentFactoryProvider != null;
    this.pendingIntentFactoryProvider = pendingIntentFactoryProvider;
    assert intentSchedulerProvider != null;
    this.intentSchedulerProvider = intentSchedulerProvider;
    assert loggerProvider != null;
    this.loggerProvider = loggerProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
    assert habitListProvider != null;
    this.habitListProvider = habitListProvider;
  }

  @Override
  public ReminderScheduler get() {
    return new ReminderScheduler(
        pendingIntentFactoryProvider.get(),
        intentSchedulerProvider.get(),
        loggerProvider.get(),
        commandRunnerProvider.get(),
        habitListProvider.get());
  }

  public static Factory<ReminderScheduler> create(
      Provider<PendingIntentFactory> pendingIntentFactoryProvider,
      Provider<IntentScheduler> intentSchedulerProvider,
      Provider<HabitLogger> loggerProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<HabitList> habitListProvider) {
    return new ReminderScheduler_Factory(
        pendingIntentFactoryProvider,
        intentSchedulerProvider,
        loggerProvider,
        commandRunnerProvider,
        habitListProvider);
  }
}
