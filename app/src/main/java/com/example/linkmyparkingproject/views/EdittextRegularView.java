package com.example.linkmyparkingproject.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class EdittextRegularView extends AppCompatEditText {
    public EdittextRegularView(Context context) {
        super(context);
        createFont();
    }

    public EdittextRegularView(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public EdittextRegularView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/SourceSansPro-Regular.otf");
        setTypeface(font);
    }
}

