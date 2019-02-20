package org.basim.uhabits.receivers;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.AppComponent;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.notifications.NotificationTray;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerWidgetReceiver_WidgetComponent implements WidgetReceiver.WidgetComponent {
  private Provider<CommandRunner> getCommandRunnerProvider;

  private Provider<NotificationTray> getNotificationTrayProvider;

  private Provider<WidgetController> widgetControllerProvider;

  private DaggerWidgetReceiver_WidgetComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getCommandRunnerProvider =
        new Factory<CommandRunner>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public CommandRunner get() {
            return Preconditions.checkNotNull(
                appComponent.getCommandRunner(),
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

    this.widgetControllerProvider =
        ScopedProvider.create(
            WidgetController_Factory.create(getCommandRunnerProvider, getNotificationTrayProvider));
  }

  @Override
  public WidgetController getWidgetController() {
    return widgetControllerProvider.get();
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public WidgetReceiver.WidgetComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerWidgetReceiver_WidgetComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
