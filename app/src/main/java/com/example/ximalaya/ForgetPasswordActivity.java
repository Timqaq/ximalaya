package com.example.ximalaya;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ForgetPasswordActivity extends AppCompatActivity {

    private EditText emailPhoneEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        // 找到 UI 元素
        emailPhoneEditText = findViewById(R.id.email_phone_edittext);
        submitButton = findViewById(R.id.submit_button);

        // 提交按钮点击事件
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取输入的邮箱或手机号
                String emailOrPhone = emailPhoneEditText.getText().toString();

                // TODO: 进行找回密码的逻辑
            }
        });

        // 关闭按钮点击事件
        ImageButton closeButton = findViewById(R.id.close_button);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
