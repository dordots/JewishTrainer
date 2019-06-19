package org.basim.uhabits.activities.habits.list;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.habits.list.model.HabitCardListAdapter;
import org.basim.uhabits.activities.habits.list.model.HintListFactory;
import org.basim.uhabits.tasks.TaskRunner;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListHabitsRootView_Factory implements Factory<ListHabitsRootView> {
  private final MembersInjector<ListHabitsRootView> listHabitsRootViewMembersInjector;

  private final Provider<Context> contextProvider;

  private final Provider<HintListFactory> hintListFactoryProvider;

  private final Provider<HabitCardListAdapter> listAdapterProvider;

  private final Provider<TaskRunner> runnerProvider;

  public ListHabitsRootView_Factory(
      MembersInjector<ListHabitsRootView> listHabitsRootViewMembersInjector,
      Provider<Context> contextProvider,
      Provider<HintListFactory> hintListFactoryProvider,
      Provider<HabitCardListAdapter> listAdapterProvider,
      Provider<TaskRunner> runnerProvider) {
    assert listHabitsRootViewMembersInjector != null;
    this.listHabitsRootViewMembersInjector = listHabitsRootViewMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert hintListFactoryProvider != null;
    this.hintListFactoryProvider = hintListFactoryProvider;
    assert listAdapterProvider != null;
    this.listAdapterProvider = listAdapterProvider;
    assert runnerProvider != null;
    this.runnerProvider = runnerProvider;
  }

  @Override
  public ListHabitsRootView get() {
    return MembersInjectors.injectMembers(
        listHabitsRootViewMembersInjector,
        new ListHabitsRootView(
            contextProvider.get(),
            hintListFactoryProvider.get(),
            listAdapterProvider.get(),
            runnerProvider.get()));
  }

  public static Factory<ListHabitsRootView> create(
      MembersInjector<ListHabitsRootView> listHabitsRootViewMembersInjector,
      Provider<Context> contextProvider,
      Provider<HintListFactory> hintListFactoryProvider,
      Provider<HabitCardListAdapter> listAdapterProvider,
      Provider<TaskRunner> runnerProvider) {
    return new ListHabitsRootView_Factory(
        listHabitsRootViewMembersInjector,
        contextProvider,
        hintListFactoryProvider,
        listAdapterProvider,
        runnerProvider);
  }
}
