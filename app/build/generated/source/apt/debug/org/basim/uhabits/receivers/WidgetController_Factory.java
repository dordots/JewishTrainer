package org.basim.uhabits.receivers;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.notifications.NotificationTray;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WidgetController_Factory implements Factory<WidgetController> {
  private final Provider<CommandRunner> commandRunnerProvider;

  private final Provider<NotificationTray> notificationTrayProvider;

  public WidgetController_Factory(
      Provider<CommandRunner> commandRunnerProvider,
      Provider<NotificationTray> notificationTrayProvider) {
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
    assert notificationTrayProvider != null;
    this.notificationTrayProvider = notificationTrayProvider;
  }

  @Override
  public WidgetController get() {
    return new WidgetController(commandRunnerProvider.get(), notificationTrayProvider.get());
  }

  public static Factory<WidgetController> create(
      Provider<CommandRunner> commandRunnerProvider,
      Provider<NotificationTray> notificationTrayProvider) {
    return new WidgetController_Factory(commandRunnerProvider, notificationTrayProvider);
  }
}
