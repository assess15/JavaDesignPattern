package com.start.designpattern.behavioral.StatePattern.android;

import com.start.designpattern.behavioral.StatePattern.android.base.Context;

/**
 * 己登录状态
 */
public class LoginedState implements UserState {
    @Override
    public void forward(Context context) {
//        Toast.makeText(context, "转发微博", Toast.LENGTH_LONG).show();
    }

    @Override
    public void comment(Context context) {
//        Toast.makeText(context, "评论微博", Toast.LENGTH_LONG).show();
    }
}
