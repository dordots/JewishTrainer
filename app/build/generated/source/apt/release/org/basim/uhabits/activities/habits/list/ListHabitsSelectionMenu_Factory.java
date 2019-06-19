package org.basim.uhabits.activities.habits.list;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.activities.habits.list.model.HabitCardListAdapter;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.models.HabitList;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListHabitsSelectionMenu_Factory implements Factory<ListHabitsSelectionMenu> {
  private final MembersInjector<ListHabitsSelectionMenu> listHabitsSelectionMenuMembersInjector;

  private final Provider<HabitList> habitListProvider;

  private final Provider<ListHabitsScreen> screenProvider;

  private final Provider<HabitCardListAdapter> listAdapterProvider;

  private final Provider<CommandRunner> commandRunnerProvider;

  public ListHabitsSelectionMenu_Factory(
      MembersInjector<ListHabitsSelectionMenu> listHabitsSelectionMenuMembersInjector,
      Provider<HabitList> habitListProvider,
      Provider<ListHabitsScreen> screenProvider,
      Provider<HabitCardListAdapter> listAdapterProvider,
      Provider<CommandRunner> commandRunnerProvider) {
    assert listHabitsSelectionMenuMembersInjector != null;
    this.listHabitsSelectionMenuMembersInjector = listHabitsSelectionMenuMembersInjector;
    assert habitListProvider != null;
    this.habitListProvider = habitListProvider;
    assert screenProvider != null;
    this.screenProvider = screenProvider;
    assert listAdapterProvider != null;
    this.listAdapterProvider = listAdapterProvider;
    assert commandRunnerProvider != null;
    this.commandRunnerProvider = commandRunnerProvider;
  }

  @Override
  public ListHabitsSelectionMenu get() {
    return MembersInjectors.injectMembers(
        listHabitsSelectionMenuMembersInjector,
        new ListHabitsSelectionMenu(
            habitListProvider.get(),
            screenProvider.get(),
            listAdapterProvider.get(),
            commandRunnerProvider.get()));
  }

  public static Factory<ListHabitsSelectionMenu> create(
      MembersInjector<ListHabitsSelectionMenu> listHabitsSelectionMenuMembersInjector,
      Provider<HabitList> habitListProvider,
      Provider<ListHabitsScreen> screenProvider,
      Provider<HabitCardListAdapter> listAdapterProvider,
      Provider<CommandRunner> commandRunnerProvider) {
    return new ListHabitsSelectionMenu_Factory(
        listHabitsSelectionMenuMembersInjector,
        habitListProvider,
        screenProvider,
        listAdapterProvider,
        commandRunnerProvider);
  }
}
