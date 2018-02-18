package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mPoliceRequired;

    public boolean isPoliceRequired() {
        return mPoliceRequired;
    }

    public void setPoliceRequired(boolean policeRequired) {
        this.mPoliceRequired = policeRequired;
    }

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
        Random rand = new Random();
        if (rand.nextInt(2) == 0) {
            mPoliceRequired = false;
        } else {
            mPoliceRequired = true;
        }
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
