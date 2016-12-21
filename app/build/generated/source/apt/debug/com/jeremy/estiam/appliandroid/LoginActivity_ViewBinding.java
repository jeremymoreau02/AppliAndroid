// Generated code from Butter Knife. Do not modify!
package com.jeremy.estiam.appliandroid;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding<T extends LoginActivity> implements Unbinder {
  protected T target;

  private View view2131624102;

  private View view2131624101;

  @UiThread
  public LoginActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.loginView = Utils.findRequiredViewAsType(source, R.id.login_editText, "field 'loginView'", EditText.class);
    target.passwordView = Utils.findRequiredViewAsType(source, R.id.password_edittext, "field 'passwordView'", EditText.class);
    view = Utils.findRequiredView(source, R.id.Sinscrire_button, "method 'onClickSinscrire'");
    view2131624102 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSinscrire(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.connect_button, "method 'onClickConnexion'");
    view2131624101 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickConnexion(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.loginView = null;
    target.passwordView = null;

    view2131624102.setOnClickListener(null);
    view2131624102 = null;
    view2131624101.setOnClickListener(null);
    view2131624101 = null;

    this.target = null;
  }
}
