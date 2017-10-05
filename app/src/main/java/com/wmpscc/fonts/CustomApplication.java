package com.wmpscc.fonts;

import android.app.Application;

/**
 * Created by wmpscc on 2017/10/5.
 */

public class CustomApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        TypefaceUtil.replaceSystemDefaultFont(this,"fonts/honaji.ttf");

    }
}
