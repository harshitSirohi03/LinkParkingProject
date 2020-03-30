package com.example.linkmyparkingproject.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class SourceSansProSemiboldTextView extends AppCompatTextView {
    public SourceSansProSemiboldTextView(Context context) {
        super(context);
        createFont();
    }

    public SourceSansProSemiboldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public SourceSansProSemiboldTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/SourceSansPro-Semibold.otf");
        setTypeface(font);
    }
}
