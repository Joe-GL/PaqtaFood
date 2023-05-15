// Generated by view binder compiler. Do not edit!
package com.paqta.paqtafood.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.paqta.paqtafood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RecyclerItemProductBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView recCard;

  @NonNull
  public final TextView recCategory;

  @NonNull
  public final TextView recDescription;

  @NonNull
  public final ShapeableImageView recImage;

  @NonNull
  public final TextView recTitle;

  private RecyclerItemProductBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView recCard, @NonNull TextView recCategory,
      @NonNull TextView recDescription, @NonNull ShapeableImageView recImage,
      @NonNull TextView recTitle) {
    this.rootView = rootView;
    this.recCard = recCard;
    this.recCategory = recCategory;
    this.recDescription = recDescription;
    this.recImage = recImage;
    this.recTitle = recTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerItemProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recycler_item_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerItemProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recCard;
      MaterialCardView recCard = ViewBindings.findChildViewById(rootView, id);
      if (recCard == null) {
        break missingId;
      }

      id = R.id.recCategory;
      TextView recCategory = ViewBindings.findChildViewById(rootView, id);
      if (recCategory == null) {
        break missingId;
      }

      id = R.id.recDescription;
      TextView recDescription = ViewBindings.findChildViewById(rootView, id);
      if (recDescription == null) {
        break missingId;
      }

      id = R.id.recImage;
      ShapeableImageView recImage = ViewBindings.findChildViewById(rootView, id);
      if (recImage == null) {
        break missingId;
      }

      id = R.id.recTitle;
      TextView recTitle = ViewBindings.findChildViewById(rootView, id);
      if (recTitle == null) {
        break missingId;
      }

      return new RecyclerItemProductBinding((ConstraintLayout) rootView, recCard, recCategory,
          recDescription, recImage, recTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}