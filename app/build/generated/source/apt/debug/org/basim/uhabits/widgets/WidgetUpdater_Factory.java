package org.basim.uhabits.widgets;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.commands.CommandRunner;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WidgetUpdater_Factory implements Factory<WidgetUpdater> {
  private final Provider<Context> contextProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  public WidgetUpdater_Factory(
      Provider<Context> contextProvider, Provider<CommandRunner> commandRunnerProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
  }

  @Override
  public WidgetUpdater get() {
    return new WidgetUpdater(contextProvider.get(), commandRunnerProvider.get());
  }

  public static Factory<WidgetUpdater> create(
      Provider<Context> contextProvider, Provider<CommandRunner> commandRunnerProvider) {
    return new WidgetUpdater_Factory(contextProvider, commandRunnerProvider);
  }
}
