package com.example.zsquad.privacypolicydialog_alertdialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zsquad.privacypolicydialog.DialogCheck;
import com.zsquad.privacypolicydialog.PrivacyPolicyDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        final Intent nextActivity=new Intent(MainActivity.this,Main2Activity.class);
        //
        DialogCheck.setPreferencesContext(this);
        //
        //
        if (!DialogCheck._DialogCheck()) {

            final PrivacyPolicyDialog dialog = new PrivacyPolicyDialog(this);
            dialog._setBrandName("test");
            dialog._btnContinueOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("show", "from button");
                    DialogCheck._DialogSaveState();
                    dialog.dismiss();
                    startActivity(nextActivity);
                }
            });
            dialog.show();

        } else {
            startActivity(nextActivity);
        }

    }
}
