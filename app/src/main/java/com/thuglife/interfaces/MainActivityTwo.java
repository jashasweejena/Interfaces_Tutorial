package com.thuglife.interfaces;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivityTwo extends AppCompatActivity implements OnWidgetClickListener {

    ButtonTwo buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTwo = new ButtonTwo();
        buttonTwo.setOnWidgetClickListener(this);
        ButtonOne buttonOne = new ButtonOne();
    }

    @Override
    public void onClick(int viewId) {
        //Handle event somehow
    }
}
