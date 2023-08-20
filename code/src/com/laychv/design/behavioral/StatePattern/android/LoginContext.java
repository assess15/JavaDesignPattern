package com.laychv.design.behavioral.StatePattern.android;

import com.laychv.design.behavioral.StatePattern.android.base.Context;

/**
 * LoginContext，用户接口和状态管理类
 */
public class LoginContext {
    // 单例
    static LoginContext sLoginContext = new LoginContext();
    // 用户状态，默认为未登录状态
    UserState mState = new LogoutState();

    private LoginContext() {
    }

    public static LoginContext getLoginContext() {
        return sLoginContext;
    }

    public void setState(UserState aState) {
        this.mState = aState;
    }

    // 转发
    public void forward(Context context) {
        mState.forward(context);
    }

    public void comment(Context context) {
        mState.comment(context);
    }
}