package com.yalantis.ucrop.view;

import android.animation.TypeEvaluator;
import android.graphics.RectF;

public class RectTypeEvaluator implements TypeEvaluator<RectF> {
    @Override
    public RectF evaluate(float fraction, RectF startValue, RectF endValue) {
        RectF rect = new RectF();
        rect.left =  startValue.left + (endValue.left - startValue.left) * fraction;
        rect.top = startValue.top + (endValue.top - startValue.top) * fraction;
        rect.right = startValue.right + (endValue.right - startValue.right) * fraction;
        rect.bottom = startValue.bottom + (endValue.bottom - startValue.bottom) * fraction;
        return rect;
    }
}
