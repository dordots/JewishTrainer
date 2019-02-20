// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.automation;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class EditSettingRootView$$ViewBinder<T extends EditSettingRootView> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296531, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296531, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131296383, "field 'habitSpinner'");
    target.habitSpinner = finder.castView(view, 2131296383, "field 'habitSpinner'");
    view = finder.findRequiredView(source, 2131296275, "field 'actionSpinner'");
    target.actionSpinner = finder.castView(view, 2131296275, "field 'actionSpinner'");
    view = finder.findRequiredView(source, 2131296321, "method 'onClickSave'");
    unbinder.view2131296321 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSave();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends EditSettingRootView> implements Unbinder {
    private T target;

    View view2131296321;

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
      target.toolbar = null;
      target.habitSpinner = null;
      target.actionSpinner = null;
      view2131296321.setOnClickListener(null);
    }
  }
}
