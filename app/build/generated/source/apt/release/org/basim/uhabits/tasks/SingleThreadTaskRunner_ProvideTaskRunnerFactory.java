package org.basim.uhabits.tasks;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum SingleThreadTaskRunner_ProvideTaskRunnerFactory implements Factory<TaskRunner> {
  INSTANCE;

  @Override
  public TaskRunner get() {
    return Preconditions.checkNotNull(
        SingleThreadTaskRunner.provideTaskRunner(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TaskRunner> create() {
    return INSTANCE;
  }
}
