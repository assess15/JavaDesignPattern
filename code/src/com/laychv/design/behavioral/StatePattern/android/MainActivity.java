package com.laychv.design.behavioral.StatePattern.android;

import com.laychv.design.behavioral.StatePattern.android.base.Activity;
import com.laychv.design.behavioral.StatePattern.android.base.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        // 转发按钮
//        findViewById(R.id.forward_btn).setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                 调用LoginContext的转发函数
//                LoginContext.getLoginContext().forward(MainActivity.this);
//            }
//        });
        // 注销按钮
//        findViewById(R.id.logout_btn).setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                 设置为注销状态
//                LoginContext.getLoginContext().setState(new LogoutState());
//            }
//        });
    }
}