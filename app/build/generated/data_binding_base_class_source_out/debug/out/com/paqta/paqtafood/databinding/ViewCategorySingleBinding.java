// Generated by view binder compiler. Do not edit!
package com.paqta.paqtafood.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.paqta.paqtafood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewCategorySingleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnEditar;

  @NonNull
  public final MaterialButton btnEliminar;

  @NonNull
  public final MaterialCardView card;

  @NonNull
  public final TextView descriptionCat;

  @NonNull
  public final ImageView imageCat;

  @NonNull
  public final TextView tituloCat;

  private ViewCategorySingleBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnEditar, @NonNull MaterialButton btnEliminar,
      @NonNull MaterialCardView card, @NonNull TextView descriptionCat, @NonNull ImageView imageCat,
      @NonNull TextView tituloCat) {
    this.rootView = rootView;
    this.btnEditar = btnEditar;
    this.btnEliminar = btnEliminar;
    this.card = card;
    this.descriptionCat = descriptionCat;
    this.imageCat = imageCat;
    this.tituloCat = tituloCat;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewCategorySingleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewCategorySingleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_category_single, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewCategorySingleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnEditar;
      MaterialButton btnEditar = ViewBindings.findChildViewById(rootView, id);
      if (btnEditar == null) {
        break missingId;
      }

      id = R.id.btnEliminar;
      MaterialButton btnEliminar = ViewBindings.findChildViewById(rootView, id);
      if (btnEliminar == null) {
        break missingId;
      }

      id = R.id.card;
      MaterialCardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.descriptionCat;
      TextView descriptionCat = ViewBindings.findChildViewById(rootView, id);
      if (descriptionCat == null) {
        break missingId;
      }

      id = R.id.imageCat;
      ImageView imageCat = ViewBindings.findChildViewById(rootView, id);
      if (imageCat == null) {
        break missingId;
      }

      id = R.id.tituloCat;
      TextView tituloCat = ViewBindings.findChildViewById(rootView, id);
      if (tituloCat == null) {
        break missingId;
      }

      return new ViewCategorySingleBinding((ConstraintLayout) rootView, btnEditar, btnEliminar,
          card, descriptionCat, imageCat, tituloCat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}