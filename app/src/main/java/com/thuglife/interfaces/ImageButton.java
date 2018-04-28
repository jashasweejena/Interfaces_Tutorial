package com.thuglife.interfaces;

public class ImageButton {

    //Contains reference to a class implementing onWidgetClickListener interface and assigned using setOnWidgetClickListener().
    private OnWidgetClickListener onWidgetClickListener;

    public ImageButton() {

    }


    //Brings actual masala into the game by setting onWidgetClickListener to a widget or an activity or fragment or whatever.
    public void setOnWidgetClickListener(OnWidgetClickListener onWidgetClickListener) {
        this.onWidgetClickListener = onWidgetClickListener;
    }


    public void OnClick() {
        onWidgetClickListener.onClick(getViewId());
    }

    //Hypothetical af
    private int getViewId() {
        return 123456;
    }


}
