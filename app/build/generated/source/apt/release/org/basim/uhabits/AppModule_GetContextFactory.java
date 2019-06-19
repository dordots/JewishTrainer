package org.basim.uhabits;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_GetContextFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_GetContextFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.getContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(AppModule module) {
    return new AppModule_GetContextFactory(module);
  }
}
