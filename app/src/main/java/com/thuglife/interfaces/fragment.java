package com.thuglife.interfaces;

import android.app.Fragment;
import android.os.Bundle;

    public class fragment extends Fragment implements OnWidgetClickListener {

    ButtonTwo buttonTwo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buttonTwo = new ButtonTwo();
        buttonTwo.setOnWidgetClickListener(this);

        //This 'd Allow the imageButton object to use the overridden onClick class.
        ImageButton imageButton = new ImageButton();
        imageButton.setOnWidgetClickListener(this);
  }

    @Override
    public void onClick(int viewId) {
        //Handle event somehow
    }
}
