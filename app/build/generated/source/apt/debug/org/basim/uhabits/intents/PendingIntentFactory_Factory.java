package org.basim.uhabits.intents;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PendingIntentFactory_Factory implements Factory<PendingIntentFactory> {
  private final Provider<Context> contextProvider;

  private final Provider<IntentFactory> intentFactoryProvider;

  public PendingIntentFactory_Factory(
      Provider<Context> contextProvider, Provider<IntentFactory> intentFactoryProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert intentFactoryProvider != null;
    this.intentFactoryProvider = intentFactoryProvider;
  }

  @Override
  public PendingIntentFactory get() {
    return new PendingIntentFactory(contextProvider.get(), intentFactoryProvider.get());
  }

  public static Factory<PendingIntentFactory> create(
      Provider<Context> contextProvider, Provider<IntentFactory> intentFactoryProvider) {
    return new PendingIntentFactory_Factory(contextProvider, intentFactoryProvider);
  }
}
