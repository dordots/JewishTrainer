package org.basim.uhabits.tasks;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.models.HabitList;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExportCSVTaskFactory_Factory implements Factory<ExportCSVTaskFactory> {
  private final Provider<Context> contextProvider;

  private final Provider<HabitList> habitListProvider;

  public ExportCSVTaskFactory_Factory(
      Provider<Context> contextProvider, Provider<HabitList> habitListProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert habitListProvider != null;
    this.habitListProvider = habitListProvider;
  }

  @Override
  public ExportCSVTaskFactory get() {
    return new ExportCSVTaskFactory(contextProvider, habitListProvider);
  }

  public static Factory<ExportCSVTaskFactory> create(
      Provider<Context> contextProvider, Provider<HabitList> habitListProvider) {
    return new ExportCSVTaskFactory_Factory(contextProvider, habitListProvider);
  }
}
