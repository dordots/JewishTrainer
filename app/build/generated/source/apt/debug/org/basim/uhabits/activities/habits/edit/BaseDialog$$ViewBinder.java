// Generated code from Butter Knife. Do not modify!
package org.basim.uhabits.activities.habits.edit;

import android.view.View;
import android.widget.AdapterView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BaseDialog$$ViewBinder<T extends BaseDialog> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131296318, "method 'onButtonDiscardClick'");
    unbinder.view2131296318 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonDiscardClick();
      }
    });
    view = finder.findRequiredView(source, 2131296551, "method 'onDateSpinnerClick'");
    unbinder.view2131296551 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDateSpinnerClick();
      }
    });
    view = finder.findRequiredView(source, 2131296322, "method 'onSaveButtonClick'");
    unbinder.view2131296322 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSaveButtonClick();
      }
    });
    view = finder.findRequiredView(source, 2131296550, "method 'onWeekdayClick'");
    unbinder.view2131296550 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onWeekdayClick();
      }
    });
    view = finder.findRequiredView(source, 2131296321, "method 'showColorPicker'");
    unbinder.view2131296321 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showColorPicker();
      }
    });
    view = finder.findRequiredView(source, 2131296460, "method 'onFrequencySelected'");
    unbinder.view2131296460 = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onFrequencySelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends BaseDialog> implements Unbinder {
    private T target;

    View view2131296318;

    View view2131296551;

    View view2131296322;

    View view2131296550;

    View view2131296321;

    View view2131296460;

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
      view2131296318.setOnClickListener(null);
      view2131296551.setOnClickListener(null);
      view2131296322.setOnClickListener(null);
      view2131296550.setOnClickListener(null);
      view2131296321.setOnClickListener(null);
      ((AdapterView<?>) view2131296460).setOnItemSelectedListener(null);
    }
  }
}
