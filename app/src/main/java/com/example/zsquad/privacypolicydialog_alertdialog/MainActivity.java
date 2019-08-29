package com.example.zsquad.privacypolicydialog_alertdialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zsquad.privacypolicydialog.DialogCheck;
import com.zsquad.privacypolicydialog.PrivacyPolicyDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        final Intent nextActivity = new Intent(MainActivity.this, Main2Activity.class);
        //
        DialogCheck.setPreferencesContext(this);
        //
        if (!DialogCheck._DialogCheck()) {

            final PrivacyPolicyDialog _dialog = new PrivacyPolicyDialog(this);
            _dialog._setTitle("Privacy Policy").
                    _setMessage(R.string.dialogMessage).
                    _setBrandName("AraSof").
                    _setURL("Your privacy url").
                    _btnContinueOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            DialogCheck._DialogSaveState();
                            _dialog._close();
                            startActivity(nextActivity);
                        }
                    }).
                    _show();
        } else {
            startActivity(nextActivity);
        }

    }
}
