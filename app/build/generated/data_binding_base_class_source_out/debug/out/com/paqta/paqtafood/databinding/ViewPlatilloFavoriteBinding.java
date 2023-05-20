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
import com.paqta.paqtafood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewPlatilloFavoriteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final ImageView imageViewFavorite;

  @NonNull
  public final ImageView imgViewIconFavorite;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView titleViewFavorite;

  private ViewPlatilloFavoriteBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageViewFavorite,
      @NonNull ImageView imgViewIconFavorite, @NonNull TextView textView3,
      @NonNull TextView textView5, @NonNull TextView titleViewFavorite) {
    this.rootView = rootView;
    this.constraintLayout3 = constraintLayout3;
    this.imageViewFavorite = imageViewFavorite;
    this.imgViewIconFavorite = imgViewIconFavorite;
    this.textView3 = textView3;
    this.textView5 = textView5;
    this.titleViewFavorite = titleViewFavorite;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewPlatilloFavoriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewPlatilloFavoriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_platillo_favorite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewPlatilloFavoriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.image_view_favorite;
      ImageView imageViewFavorite = ViewBindings.findChildViewById(rootView, id);
      if (imageViewFavorite == null) {
        break missingId;
      }

      id = R.id.img_view_icon_favorite;
      ImageView imgViewIconFavorite = ViewBindings.findChildViewById(rootView, id);
      if (imgViewIconFavorite == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.title_view_favorite;
      TextView titleViewFavorite = ViewBindings.findChildViewById(rootView, id);
      if (titleViewFavorite == null) {
        break missingId;
      }

      return new ViewPlatilloFavoriteBinding((ConstraintLayout) rootView, constraintLayout3,
          imageViewFavorite, imgViewIconFavorite, textView3, textView5, titleViewFavorite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}