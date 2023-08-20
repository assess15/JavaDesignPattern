package com.laychv.design.behavioral.StatePattern.android;

import com.laychv.design.behavioral.StatePattern.android.base.Context;

/**
 * 用户状态
 */
public interface UserState {
    /**
     * 转发
     */
    public void forward(Context context);

    /**
     * 评论
     */
    public void comment(Context context);
}