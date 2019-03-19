// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.show.views;

import android.view.View;
import android.widget.AdapterView;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ScoreCard$$ViewBinder<T extends ScoreCard> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296498, "field 'spinner' and method 'onItemSelected'");
    target.spinner = finder.castView(view, 2131296498, "field 'spinner'");
    unbinder.view2131296498 = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onItemSelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    view = finder.findRequiredView(source, 2131296467, "field 'chart'");
    target.chart = finder.castView(view, 2131296467, "field 'chart'");
    view = finder.findRequiredView(source, 2131296529, "field 'title'");
    target.title = finder.castView(view, 2131296529, "field 'title'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ScoreCard> implements Unbinder {
    private T target;

    View view2131296498;

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
      ((AdapterView<?>) view2131296498).setOnItemSelectedListener(null);
      target.spinner = null;
      target.chart = null;
      target.title = null;
    }
  }
}
