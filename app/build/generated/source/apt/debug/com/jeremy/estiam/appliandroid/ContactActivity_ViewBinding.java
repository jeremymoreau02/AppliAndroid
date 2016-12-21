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

public class ContactActivity_ViewBinding<T extends ContactActivity> implements Unbinder {
  protected T target;

  private View view2131624052;

  private View view2131624054;

  private View view2131624055;

  private View view2131624053;

  @UiThread
  public ContactActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.valeurMessage = Utils.findRequiredViewAsType(source, R.id.valeurMessage, "field 'valeurMessage'", EditText.class);
    target.valeurObjet = Utils.findRequiredViewAsType(source, R.id.valeurObjet, "field 'valeurObjet'", EditText.class);
    view = Utils.findRequiredView(source, R.id.boutonEnvoiMessage, "method 'onClickInscription'");
    view2131624052 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickInscription(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.button_parametres, "method 'onClickUserInfo'");
    view2131624054 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickUserInfo();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_deconnexion, "method 'onClickDeconnexion'");
    view2131624055 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickDeconnexion();
      }
    });
    view = Utils.findRequiredView(source, R.id.button_home, "method 'onClickHome'");
    view2131624053 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickHome();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.valeurMessage = null;
    target.valeurObjet = null;

    view2131624052.setOnClickListener(null);
    view2131624052 = null;
    view2131624054.setOnClickListener(null);
    view2131624054 = null;
    view2131624055.setOnClickListener(null);
    view2131624055 = null;
    view2131624053.setOnClickListener(null);
    view2131624053 = null;

    this.target = null;
  }
}
