package com.example.linkmyparkingproject.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class SourceSansProBoldTextView extends AppCompatTextView {
    public SourceSansProBoldTextView(Context context) {
        super(context);
        createFont();
    }

    public SourceSansProBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public SourceSansProBoldTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/SourceSansPro-Bold.otf");
        setTypeface(font);
    }
}
