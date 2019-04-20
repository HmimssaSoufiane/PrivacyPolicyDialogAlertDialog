package com.example.zsquad.privacypolicydialog_alertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zsquad.privacypolicydialog.PrivacyPolicyDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrivacyPolicyDialog dialog=new PrivacyPolicyDialog(this);
        dialog.show();
    }
}
