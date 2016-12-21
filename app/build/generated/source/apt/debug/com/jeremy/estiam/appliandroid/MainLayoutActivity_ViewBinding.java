// Generated code from Butter Knife. Do not modify!
package com.jeremy.estiam.appliandroid;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainLayoutActivity_ViewBinding<T extends MainLayoutActivity> implements Unbinder {
  protected T target;

  private View view2131624081;

  private View view2131624102;

  @UiThread
  public MainLayoutActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.SeConnecter_button, "method 'onClickSeConnecter'");
    view2131624081 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSeConnecter(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.Sinscrire_button, "method 'onClickSinscrire'");
    view2131624102 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSinscrire(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (this.target == null) throw new IllegalStateException("Bindings already cleared.");

    view2131624081.setOnClickListener(null);
    view2131624081 = null;
    view2131624102.setOnClickListener(null);
    view2131624102 = null;

    this.target = null;
  }
}
