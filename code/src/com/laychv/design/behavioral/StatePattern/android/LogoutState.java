package com.laychv.design.behavioral.StatePattern.android;

import com.laychv.design.behavioral.StatePattern.android.base.Context;
import com.laychv.design.behavioral.StatePattern.android.base.Intent;

/**
 * 注销状态，即未登录状态
 */
public class LogoutState implements UserState {

    private boolean isLogin = true;

    @Override
    public void forward(Context context) {
        if (isLogin) {
            gotoLoginActivity(context);
        } else {
            // todo 未登录
        }
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}