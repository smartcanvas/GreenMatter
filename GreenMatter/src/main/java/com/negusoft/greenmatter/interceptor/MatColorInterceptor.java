package com.negusoft.greenmatter.interceptor;

import android.content.res.Resources;

import com.negusoft.greenmatter.MatPalette;
import com.negusoft.greenmatter.MatResources;
import com.negusoft.greenmatter.R;

/** Replace the color references by actual colors */
public class MatColorInterceptor implements MatResources.ColorInterceptor {

    @Override
    public int getColor(Resources res, MatPalette palette, int resId) {
        if (resId == R.color.gm__primary_reference)
            return palette.colorPrimary;
        return 0;
    }

}