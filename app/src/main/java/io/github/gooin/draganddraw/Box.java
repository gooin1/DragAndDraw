package io.github.gooin.draganddraw;

import android.graphics.PointF;

/**
 * Created by gooin on 2016/7/16.
 */
public class Box {
    private PointF mOorigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOorigin = origin;
        mCurrent = origin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOorigin() {
        return mOorigin;
    }

}
