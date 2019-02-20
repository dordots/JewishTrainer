package org.basim.uhabits.receivers;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.notifications.NotificationTray;
import org.basim.uhabits.preferences.Preferences;
import org.basim.uhabits.utils.ReminderScheduler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReminderController_Factory implements Factory<ReminderController> {
  private final Provider<ReminderScheduler> reminderSchedulerProvider;

  private final Provider<NotificationTray> notificationTrayProvider;

  private final Provider<Preferences> preferencesProvider;

  public ReminderController_Factory(
      Provider<ReminderScheduler> reminderSchedulerProvider,
      Provider<NotificationTray> notificationTrayProvider,
      Provider<Preferences> preferencesProvider) {
    assert reminderSchedulerProvider != null;
    this.reminderSchedulerProvider = reminderSchedulerProvider;
    assert notificationTrayProvider != null;
    this.notificationTrayProvider = notificationTrayProvider;
    assert preferencesProvider != null;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public ReminderController get() {
    return new ReminderController(
        reminderSchedulerProvider.get(), notificationTrayProvider.get(), preferencesProvider.get());
  }

  public static Factory<ReminderController> create(
      Provider<ReminderScheduler> reminderSchedulerProvider,
      Provider<NotificationTray> notificationTrayProvider,
      Provider<Preferences> preferencesProvider) {
    return new ReminderController_Factory(
        reminderSchedulerProvider, notificationTrayProvider, preferencesProvider);
  }
}
