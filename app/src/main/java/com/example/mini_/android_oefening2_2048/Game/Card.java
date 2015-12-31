package com.example.mini_.android_oefening2_2048.Game;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.mini_.android_oefening2_2048.GameActivity;
import com.example.mini_.android_oefening2_2048.R;

/**
 * Created by mini_ on 31/12/2015.
 */
public class Card extends FrameLayout{

    TextView textView;
    private int number;

    public Card(Context context) {
        super(context);
        textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.BLACK);
        LayoutParams lp = new LayoutParams(-1, -1);
        lp.setMargins(10, 10, 0, 0);
        textView.setBackgroundColor(Color.parseColor("#eee4da"));
        addView(textView, lp);
    }
    public Card(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public Card(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public Card(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public TextView getTextView() {
        return textView;
    }
    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;}

    public void setTextViewValue(int textViewValue) {
        textView.setText(String.valueOf(textViewValue));
    }


}
