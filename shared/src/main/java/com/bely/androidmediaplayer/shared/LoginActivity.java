package com.bely.androidmediaplayer.shared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLogin(View view) {
        if (((CheckBox)findViewById(R.id.checkBox_success)).isChecked()) {
            Utils.play();
        }
        Utils.setNormalPlay(((CheckBox)findViewById(R.id.checkBox_success)).isChecked());
        finish();
    }
}