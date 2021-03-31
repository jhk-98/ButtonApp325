package com.example.buttonapp325;

import android.view.View;
import android.widget.TextView;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
       this.mainActivity  = mainActivity;

    }

    @Override
    public void onClick(View v) {
       mainActivity.mTextView1.setText("you clicked 김준혁의 button!");
    }
}
private class myOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public myOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("you clicked button 1");
    }
}