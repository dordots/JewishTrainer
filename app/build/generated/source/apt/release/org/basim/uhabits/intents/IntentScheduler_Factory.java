package org.basim.uhabits.intents;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class IntentScheduler_Factory implements Factory<IntentScheduler> {
  private final Provider<Context> contextProvider;

  public IntentScheduler_Factory(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public IntentScheduler get() {
    return new IntentScheduler(contextProvider.get());
  }

  public static Factory<IntentScheduler> create(Provider<Context> contextProvider) {
    return new IntentScheduler_Factory(contextProvider);
  }
}
