package org.basim.uhabits.notifications;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.intents.PendingIntentFactory;
import org.basim.uhabits.preferences.Preferences;
import org.basim.uhabits.tasks.TaskRunner;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NotificationTray_Factory implements Factory<NotificationTray> {
  private final Provider<Context> contextProvider;

  private final Provider<TaskRunner> taskRunnerProvider;

  private final Provider<PendingIntentFactory> pendingIntentsProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<Preferences> preferencesProvider;

  public NotificationTray_Factory(
      Provider<Context> contextProvider,
      Provider<TaskRunner> taskRunnerProvider,
      Provider<PendingIntentFactory> pendingIntentsProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<Preferences> preferencesProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert taskRunnerProvider != null;
    this.taskRunnerProvider = taskRunnerProvider;
    assert pendingIntentsProvider != null;
    this.pendingIntentsProvider = pendingIntentsProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public NotificationTray get() {
    return new NotificationTray(
        contextProvider.get(),
        taskRunnerProvider.get(),
        pendingIntentsProvider.get(),
        commandRunnerProvider.get(),
        preferencesProvider.get());
  }

  public static Factory<NotificationTray> create(
      Provider<Context> contextProvider,
      Provider<TaskRunner> taskRunnerProvider,
      Provider<PendingIntentFactory> pendingIntentsProvider,
      Provider<CommandRunner> commandRunnerProvider,
      Provider<Preferences> preferencesProvider) {
    return new NotificationTray_Factory(
        contextProvider,
        taskRunnerProvider,
        pendingIntentsProvider,
        commandRunnerProvider,
        preferencesProvider);
  }
}
