package org.basim.uhabits.automation;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.AppComponent;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.notifications.NotificationTray;
import org.basim.uhabits.receivers.WidgetController;
import org.basim.uhabits.receivers.WidgetController_Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerFireSettingReceiver_ReceiverComponent
    implements FireSettingReceiver.ReceiverComponent {
  private Provider<CommandRunner> getCommandRunnerProvider;

  private Provider<NotificationTray> getNotificationTrayProvider;

  private Provider<WidgetController> widgetControllerProvider;

  private DaggerFireSettingReceiver_ReceiverComponent(Builder builder) {
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

    public FireSettingReceiver.ReceiverComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerFireSettingReceiver_ReceiverComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
