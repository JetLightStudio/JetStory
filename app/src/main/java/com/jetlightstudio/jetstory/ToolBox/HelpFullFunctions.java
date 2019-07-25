package com.jetlightstudio.jetstory.ToolBox;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.view.View;

public class HelpFullFunctions {

    public static void setViewColor(View view, String color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ColorStateList stateList = ColorStateList.valueOf(Color.parseColor(color));
            view.setBackgroundTintList(stateList);
        } else {
            view.getBackground().getCurrent().setColorFilter(
                    new PorterDuffColorFilter(Color.parseColor(color),
                            PorterDuff.Mode.MULTIPLY));
        }
    }
}
