package org.basim.uhabits.activities;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_GetContextFactory implements Factory<Context> {
  private final ActivityModule module;

  public ActivityModule_GetContextFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.getContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(ActivityModule module) {
    return new ActivityModule_GetContextFactory(module);
  }
}
