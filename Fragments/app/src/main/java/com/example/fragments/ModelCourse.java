package com.example.fragments;

public enum ModelCourse {


    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);


    public int getmTitleID() {
        return mTitleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }

    ModelCourse(int mTitleID, int mLayoutID) {
        this.mTitleID = mTitleID;
        this.mLayoutID = mLayoutID;
    }

    private int mTitleID, mLayoutID;

}
