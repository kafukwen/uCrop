package com.yalantis.ucrop.callback;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/**
 * Created by Oleksii Shliama.
 */
public interface OverlayViewChangeListener {

    void onCropRectUpdated(RectF cropRect);

    void onCropAnimationUpdate(ValueAnimator animation);
}