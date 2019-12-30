// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.list;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ListHabitsRootView$$ViewBinder<T extends ListHabitsRootView> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131361968, "field 'listView'");
    target.listView = finder.castView(view, 2131361968, "field 'listView'");
    view = finder.findRequiredView(source, 2131361971, "field 'llEmpty'");
    target.llEmpty = finder.castView(view, 2131361971, "field 'llEmpty'");
    view = finder.findRequiredView(source, 2131362110, "field 'tvStarEmpty'");
    target.tvStarEmpty = finder.castView(view, 2131362110, "field 'tvStarEmpty'");
    view = finder.findRequiredView(source, 2131362089, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131362089, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131362005, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131362005, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131361925, "field 'hintView'");
    target.hintView = finder.castView(view, 2131361925, "field 'hintView'");
    view = finder.findRequiredView(source, 2131361922, "field 'header'");
    target.header = finder.castView(view, 2131361922, "field 'header'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ListHabitsRootView> implements Unbinder {
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
      target.listView = null;
      target.llEmpty = null;
      target.tvStarEmpty = null;
      target.toolbar = null;
      target.progressBar = null;
      target.hintView = null;
      target.header = null;
    }
  }
}
