package org.basim.uhabits.activities;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_GetActivityFactory implements Factory<BaseActivity> {
  private final ActivityModule module;

  public ActivityModule_GetActivityFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseActivity get() {
    return Preconditions.checkNotNull(
        module.getActivity(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseActivity> create(ActivityModule module) {
    return new ActivityModule_GetActivityFactory(module);
  }
}
