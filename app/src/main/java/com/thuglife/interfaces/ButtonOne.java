package com.thuglife.interfaces;

public class ButtonOne {

    public void setMainActivityOne(MainActivityOne mainActivityOne) {
        this.mainActivityOne = mainActivityOne;
    }

    private MainActivityOne mainActivityOne;
    public ButtonOne()
    {

    }

    public void OnClick()
    {
        mainActivityOne.onClick(getViewId());
    }

    //ID is actually generated at runtime.
    private int getViewId() {
        return 123456;
    }


}
