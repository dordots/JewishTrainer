package org.basim.uhabits.activities;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.basim.uhabits.AppComponent;
import org.basim.uhabits.activities.common.dialogs.ColorPickerDialogFactory;
import org.basim.uhabits.activities.common.dialogs.ColorPickerDialogFactory_Factory;
import org.basim.uhabits.preferences.Preferences;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<Context> getContextProvider;

  private Provider<ColorPickerDialogFactory> colorPickerDialogFactoryProvider;

  private Provider<BaseActivity> getActivityProvider;

  private Provider<Preferences> getPreferencesProvider;

  private Provider<ThemeSwitcher> themeSwitcherProvider;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getContextProvider = ActivityModule_GetContextFactory.create(builder.activityModule);

    this.colorPickerDialogFactoryProvider =
        ScopedProvider.create(ColorPickerDialogFactory_Factory.create(getContextProvider));

    this.getActivityProvider = ActivityModule_GetActivityFactory.create(builder.activityModule);

    this.getPreferencesProvider =
        new Factory<Preferences>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public Preferences get() {
            return Preconditions.checkNotNull(
                appComponent.getPreferences(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.themeSwitcherProvider =
        ScopedProvider.create(
            ThemeSwitcher_Factory.create(getActivityProvider, getPreferencesProvider));
  }

  @Override
  public ColorPickerDialogFactory getColorPickerDialogFactory() {
    return colorPickerDialogFactoryProvider.get();
  }

  @Override
  public ThemeSwitcher getThemeSwitcher() {
    return themeSwitcherProvider.get();
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
