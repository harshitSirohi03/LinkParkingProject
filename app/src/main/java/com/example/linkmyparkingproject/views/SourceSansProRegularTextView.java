package com.example.linkmyparkingproject.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

/**
 * Created by mahipal on 27/12/18.
 * HelveticRegulaarTextView-Regular font TextView
 */

public class SourceSansProRegularTextView extends AppCompatTextView {
    public SourceSansProRegularTextView(Context context) {
        super(context);
        createFont();
    }

    public SourceSansProRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public SourceSansProRegularTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/SourceSansPro-Regular.otf");
        setTypeface(font);
    }

}
