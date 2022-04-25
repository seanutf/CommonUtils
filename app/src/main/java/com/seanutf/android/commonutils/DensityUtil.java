package com.seanutf.android.commonutils;

import android.content.Context;

public class DensityUtil {

    public static float getScreenDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float getScreenDensityDpi(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static float getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static float getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static float getScaledDensity(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int dp2px(Context context, float dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dp * density + 0.5F);
    }


    public static int sp2px(Context context, float sp) {
        float density = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (sp * density + 0.5F);
    }

    public static int px2dp(Context context, float px) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (px / density + 0.5F);
    }

    public static int px2sp(Context context, float px) {
        float density = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (px / density + 0.5F);
    }
}
