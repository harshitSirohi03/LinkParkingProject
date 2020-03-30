package com.example.linkmyparkingproject.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class SemiboldItalicTextview extends AppCompatTextView {
    public SemiboldItalicTextview(Context context) {
        super(context);
        createFont();
    }

    public SemiboldItalicTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public SemiboldItalicTextview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/SourceSansPro-SemiboldIt.otf");
        setTypeface(font);
    }
}
