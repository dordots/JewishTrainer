package org.basim.uhabits.commands;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.tasks.TaskRunner;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommandRunner_Factory implements Factory<CommandRunner> {
  private final Provider<TaskRunner> taskRunnerProvider;

  public CommandRunner_Factory(Provider<TaskRunner> taskRunnerProvider) {
    assert taskRunnerProvider != null;
    this.taskRunnerProvider = taskRunnerProvider;
  }

  @Override
  public CommandRunner get() {
    return new CommandRunner(taskRunnerProvider.get());
  }

  public static Factory<CommandRunner> create(Provider<TaskRunner> taskRunnerProvider) {
    return new CommandRunner_Factory(taskRunnerProvider);
  }
}
