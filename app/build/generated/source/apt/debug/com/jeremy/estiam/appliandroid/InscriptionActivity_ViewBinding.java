// Generated code from Butter Knife. Do not modify!
package com.jeremy.estiam.appliandroid;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class InscriptionActivity_ViewBinding<T extends InscriptionActivity> implements Unbinder {
  protected T target;

  private View view2131624073;

  private TextWatcher view2131624073TextWatcher;

  private View view2131624080;

  private View view2131624081;

  @UiThread
  public InscriptionActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.nom = Utils.findRequiredViewAsType(source, R.id.nom_edit, "field 'nom'", EditText.class);
    target.prenom = Utils.findRequiredViewAsType(source, R.id.prenom_edit, "field 'prenom'", EditText.class);
    target.pseudo = Utils.findRequiredViewAsType(source, R.id.pseudo__edit, "field 'pseudo'", EditText.class);
    target.mail = Utils.findRequiredViewAsType(source, R.id.mail_edit, "field 'mail'", EditText.class);
    view = Utils.findRequiredView(source, R.id.dateNaissance_edit, "field 'dateNaissance' and method 'handleTextChange'");
    target.dateNaissance = Utils.castView(view, R.id.dateNaissance_edit, "field 'dateNaissance'", EditText.class);
    view2131624073 = view;
    view2131624073TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.handleTextChange(Utils.<Editable>castParam(p0, "onTextChanged", 0, "handleTextChange", 0));
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view2131624073TextWatcher);
    target.passwordNouveau = Utils.findRequiredViewAsType(source, R.id.passwordNouveau_edit, "field 'passwordNouveau'", EditText.class);
    target.passwordConfirm = Utils.findRequiredViewAsType(source, R.id.passwordConfirm_edit, "field 'passwordConfirm'", EditText.class);
    view = Utils.findRequiredView(source, R.id.inscription_button, "method 'onClickInscription'");
    view2131624080 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickInscription(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.SeConnecter_button, "method 'onClickSeConnecter'");
    view2131624081 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickSeConnecter(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.nom = null;
    target.prenom = null;
    target.pseudo = null;
    target.mail = null;
    target.dateNaissance = null;
    target.passwordNouveau = null;
    target.passwordConfirm = null;

    ((TextView) view2131624073).removeTextChangedListener(view2131624073TextWatcher);
    view2131624073TextWatcher = null;
    view2131624073 = null;
    view2131624080.setOnClickListener(null);
    view2131624080 = null;
    view2131624081.setOnClickListener(null);
    view2131624081 = null;

    this.target = null;
  }
}
