package org.basim.uhabits.receivers;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.AppComponent;
import org.basim.uhabits.notifications.NotificationTray;
import org.basim.uhabits.preferences.Preferences;
import org.basim.uhabits.utils.ReminderScheduler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerReminderReceiver_ReminderComponent
    implements ReminderReceiver.ReminderComponent {
  private Provider<ReminderScheduler> getReminderSchedulerProvider;

  private Provider<NotificationTray> getNotificationTrayProvider;

  private Provider<Preferences> getPreferencesProvider;

  private Provider<ReminderController> reminderControllerProvider;

  private DaggerReminderReceiver_ReminderComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getReminderSchedulerProvider =
        new Factory<ReminderScheduler>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public ReminderScheduler get() {
            return Preconditions.checkNotNull(
                appComponent.getReminderScheduler(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.getNotificationTrayProvider =
        new Factory<NotificationTray>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public NotificationTray get() {
            return Preconditions.checkNotNull(
                appComponent.getNotificationTray(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.getPreferencesProvider =
        new Factory<Preferences>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public Preferences get() {
            return Preconditions.checkNotNull(
                appComponent.getPreferences(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.reminderControllerProvider =
        ScopedProvider.create(
            ReminderController_Factory.create(
                getReminderSchedulerProvider, getNotificationTrayProvider, getPreferencesProvider));
  }

  @Override
  public ReminderController getReminderController() {
    return reminderControllerProvider.get();
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public ReminderReceiver.ReminderComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerReminderReceiver_ReminderComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
