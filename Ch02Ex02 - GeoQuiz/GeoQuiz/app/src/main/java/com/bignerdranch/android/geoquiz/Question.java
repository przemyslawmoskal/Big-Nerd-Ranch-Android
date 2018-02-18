package com.bignerdranch.android.geoquiz;

/**
 * Created by Przemek on 2017-12-28.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int TextResId, boolean AnswerTrue) {
        mTextResId = TextResId;
        mAnswerTrue = AnswerTrue;
    }
}
