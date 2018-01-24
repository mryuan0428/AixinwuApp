package com.aixinwu.axw.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.aixinwu.axw.R;

import java.lang.reflect.Type;

/**
 * Created by lionel on 2018/1/23.
 */

public class MyFooterView extends FrameLayout {
    private ProgressBar mProgressBar;

    public MyFooterView(@NonNull Context context) {
        super(context);
    }

    public MyFooterView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyFooterView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public MyFooterView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        mProgressBar = new ProgressBar(context);
        int padding = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,4,getResources().getDisplayMetrics());
        mProgressBar.setPadding(padding, padding, padding, padding);
        int size = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,34,getResources().getDisplayMetrics());
        LayoutParams layoutParams = new LayoutParams(size, size, Gravity.CENTER);
        mProgressBar.setLayoutParams(layoutParams);
    }

    public void onBegin(){
        setVisibility(VISIBLE);
        mProgressBar.setVisibility(VISIBLE);
        setBackgroundColor(getResources().getColor(R.color.black));
    }

    public void onFinish(){
        setVisibility(GONE);
        mProgressBar.setVisibility(GONE);
    }
}
