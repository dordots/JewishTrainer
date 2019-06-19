// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.about;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class AboutRootView$$ViewBinder<T extends AboutRootView> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296575, "field 'tvVersion'");
    target.tvVersion = finder.castView(view, 2131296575, "field 'tvVersion'");
    view = finder.findRequiredView(source, 2131296569, "field 'tvRate' and method 'onClickRate'");
    target.tvRate = finder.castView(view, 2131296569, "field 'tvRate'");
    unbinder.view2131296569 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickRate();
      }
    });
    view = finder.findRequiredView(source, 2131296565, "field 'tvFeedback' and method 'onClickFeedback'");
    target.tvFeedback = finder.castView(view, 2131296565, "field 'tvFeedback'");
    unbinder.view2131296565 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickFeedback();
      }
    });
    view = finder.findRequiredView(source, 2131296572, "field 'tvSource' and method 'onClickSource'");
    target.tvSource = finder.castView(view, 2131296572, "field 'tvSource'");
    unbinder.view2131296572 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSource();
      }
    });
    view = finder.findRequiredView(source, 2131296552, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131296552, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131296574, "method 'onClickTranslate'");
    unbinder.view2131296574 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickTranslate();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends AboutRootView> implements Unbinder {
    private T target;

    View view2131296569;

    View view2131296565;

    View view2131296572;

    View view2131296574;

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
      target.tvVersion = null;
      view2131296569.setOnClickListener(null);
      target.tvRate = null;
      view2131296565.setOnClickListener(null);
      target.tvFeedback = null;
      view2131296572.setOnClickListener(null);
      target.tvSource = null;
      target.toolbar = null;
      view2131296574.setOnClickListener(null);
    }
  }
}
