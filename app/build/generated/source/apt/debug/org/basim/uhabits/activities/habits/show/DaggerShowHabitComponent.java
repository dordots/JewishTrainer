package org.basim.uhabits.activities.habits.show;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.AppComponent;
import org.basim.uhabits.activities.ActivityModule_GetActivityFactory;
import org.basim.uhabits.activities.ActivityModule_GetContextFactory;
import org.basim.uhabits.activities.BaseActivity;
import org.basim.uhabits.activities.habits.edit.EditHabitDialogFactory_Factory;
import org.basim.uhabits.commands.CommandRunner;
import org.basim.uhabits.models.Habit;
import org.basim.uhabits.models.HabitList;
import org.basim.uhabits.tasks.ExportCSVTaskFactory;
import org.basim.uhabits.tasks.ExportCSVTaskFactory_Factory;
import org.basim.uhabits.tasks.TaskRunner;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerShowHabitComponent implements ShowHabitComponent {
  private Provider<BaseActivity> getActivityProvider;

  private Provider<Habit> getHabitProvider;

  private Provider<Context> getContextProvider;

  private Provider<ShowHabitRootView> showHabitRootViewProvider;

  private Provider<ShowHabitScreen> showHabitScreenProvider;

  private Provider<CommandRunner> getCommandRunnerProvider;

  private Provider<ShowHabitController> showHabitControllerProvider;

  private Provider<Context> getContextProvider2;

  private Provider<HabitList> getHabitListProvider;

  private Provider<ExportCSVTaskFactory> exportCSVTaskFactoryProvider;

  private Provider<TaskRunner> getTaskRunnerProvider;

  private Provider<ShowHabitsMenu> showHabitsMenuProvider;

  private DaggerShowHabitComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getActivityProvider = ActivityModule_GetActivityFactory.create(builder.showHabitModule);

    this.getHabitProvider = ShowHabitModule_GetHabitFactory.create(builder.showHabitModule);

    this.getContextProvider = ActivityModule_GetContextFactory.create(builder.showHabitModule);

    this.showHabitRootViewProvider =
        ScopedProvider.create(
            ShowHabitRootView_Factory.create(
                MembersInjectors.<ShowHabitRootView>noOp(), getContextProvider, getHabitProvider));

    this.showHabitScreenProvider =
        ScopedProvider.create(
            ShowHabitScreen_Factory.create(
                MembersInjectors.<ShowHabitScreen>noOp(),
                getActivityProvider,
                getHabitProvider,
                showHabitRootViewProvider,
                EditHabitDialogFactory_Factory.create()));

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

    this.showHabitControllerProvider =
        ScopedProvider.create(
            ShowHabitController_Factory.create(
                showHabitScreenProvider, getCommandRunnerProvider, getHabitProvider));

    this.getContextProvider2 =
        new Factory<Context>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public Context get() {
            return Preconditions.checkNotNull(
                appComponent.getContext(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.getHabitListProvider =
        new Factory<HabitList>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public HabitList get() {
            return Preconditions.checkNotNull(
                appComponent.getHabitList(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.exportCSVTaskFactoryProvider =
        ExportCSVTaskFactory_Factory.create(getContextProvider2, getHabitListProvider);

    this.getTaskRunnerProvider =
        new Factory<TaskRunner>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public TaskRunner get() {
            return Preconditions.checkNotNull(
                appComponent.getTaskRunner(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.showHabitsMenuProvider =
        ScopedProvider.create(
            ShowHabitsMenu_Factory.create(
                MembersInjectors.<ShowHabitsMenu>noOp(),
                getActivityProvider,
                showHabitScreenProvider,
                getHabitProvider,
                exportCSVTaskFactoryProvider,
                getTaskRunnerProvider));
  }

  @Override
  public ShowHabitController getController() {
    return showHabitControllerProvider.get();
  }

  @Override
  public ShowHabitsMenu getMenu() {
    return showHabitsMenuProvider.get();
  }

  @Override
  public ShowHabitRootView getRootView() {
    return showHabitRootViewProvider.get();
  }

  @Override
  public ShowHabitScreen getScreen() {
    return showHabitScreenProvider.get();
  }

  public static final class Builder {
    private ShowHabitModule showHabitModule;

    private AppComponent appComponent;

    private Builder() {}

    public ShowHabitComponent build() {
      if (showHabitModule == null) {
        throw new IllegalStateException(ShowHabitModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerShowHabitComponent(this);
    }

    public Builder showHabitModule(ShowHabitModule showHabitModule) {
      this.showHabitModule = Preconditions.checkNotNull(showHabitModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
