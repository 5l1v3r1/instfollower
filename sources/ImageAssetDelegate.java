package com.airbnb.lottie;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;

public interface ImageAssetDelegate {
    @Nullable
    Bitmap fetchBitmap(LottieImageAsset lottieImageAsset);
}
