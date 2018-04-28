package com.thuglife.interfaces;

public class ButtonTwo {

    //  private MainActivityOne mainActivityOne;
    private OnWidgetClickListener onWidgetClickListener;

    public ButtonTwo() {

    }

    public void setOnWidgetClickListener(OnWidgetClickListener onWidgetClickListener) {
        this.onWidgetClickListener = onWidgetClickListener;
    }

    public void OnClick() {
        onWidgetClickListener.onClick(getViewId());
    }

    private int getViewId() {
        return 123456;
    }


}
