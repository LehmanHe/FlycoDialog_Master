package com.flyco.dialog.entity;

public class DialogMenuItem {
    public String mOperName;
    public int mResId;
    public int addressId;

    public DialogMenuItem(String operName, int resId,int addressId) {
        mOperName = operName;
        mResId = resId;
        this.addressId=addressId;
    }
}
