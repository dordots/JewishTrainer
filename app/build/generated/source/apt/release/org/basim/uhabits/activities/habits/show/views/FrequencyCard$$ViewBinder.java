// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.show.views;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FrequencyCard$$ViewBinder<T extends FrequencyCard> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296549, "field 'title'");
    target.title = finder.castView(view, 2131296549, "field 'title'");
    view = finder.findRequiredView(source, 2131296380, "field 'chart'");
    target.chart = finder.castView(view, 2131296380, "field 'chart'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends FrequencyCard> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.title = null;
      target.chart = null;
    }
  }
}
