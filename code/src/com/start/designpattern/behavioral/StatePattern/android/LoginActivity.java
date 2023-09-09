package com.start.designpattern.behavioral.StatePattern.android;

import com.start.designpattern.behavioral.StatePattern.android.base.Activity;
import com.start.designpattern.behavioral.StatePattern.android.base.Bundle;
import com.start.designpattern.behavioral.StatePattern.android.base.EditText;

public class LoginActivity extends Activity {
    EditText usrNameEditText;
    EditText pwdEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        usrNameEditText = (EditText) findViewById(R.id.username_edittext);
//        pwdEditText = (EditText) findViewById(R.id.pwd_edittext);
//        // 登录按钮
//        findViewById(R.id.login_btn).setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                login();
//                finish();
//            }
//        });
    }

    private void login() {
        String usrName = usrNameEditText.getText().toString().trim();
        String pwd = pwdEditText.getText().toString().trim();
        // 执行网络请求,进行登录 .....
        // 登录成功后修改为己登录状态
        LoginContext.getLoginContext().setState(new LoginedState());
//        Toast.makeText(this, "登录成功", Toast.LENGTH_LONG).show();
    }
}