package com.example.myapp.uicomponents;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;


public class CustomWidthImageView extends AppCompatImageView {
    public CustomWidthImageView(@NonNull Context context) {
        super(context);
    }

    public CustomWidthImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomWidthImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
        int width = (int) (screenWidth * 0.4);
        int height = (int) (width * 0.75);
        setMeasuredDimension(width, height);
    }
}
