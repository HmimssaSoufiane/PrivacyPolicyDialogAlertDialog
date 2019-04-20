package com.zsquad.privacypolicydialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PrivacyPolicyDialog extends AlertDialog {
    private View mDialogView;
    private Button btnAccept;
    private TextView textViewBrand;
    private TextView urlPrivacyPolicy;
    private TextView dialogtitletextView;
    private TextView dialogtextView;
    private ImageView mIcon;
    private SharedPreferences pref;

    public PrivacyPolicyDialog(Context context) {
        super(context);
        mDialogView = View.inflate(context, R.layout.dialog, null);
        setView(mDialogView);
        btnAccept = mDialogView.findViewById(R.id.dialogbtn);
        textViewBrand = mDialogView.findViewById(R.id.textViewBrand);
        urlPrivacyPolicy = mDialogView.findViewById(R.id.textViewPrivacyPolicy);
        dialogtitletextView = mDialogView.findViewById(R.id.dialogtitletextView);
        dialogtextView = mDialogView.findViewById(R.id.dialogtextView);
        mIcon = mDialogView.findViewById(R.id.imageView);
        //

        this.setCancelable(false);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("show", "from button");
                Close();
            }
        });


    }


    public PrivacyPolicyDialog _setMessage(CharSequence message) {
        dialogtextView.setText(message);
        return this;
    }

    public PrivacyPolicyDialog _setBrandName(String brandName) {
        textViewBrand.setText(brandName);
        return this;
    }

    public PrivacyPolicyDialog _urlPrivacyPolicy(String url) {
        urlPrivacyPolicy.setText(url);
        return this;
    }

    public PrivacyPolicyDialog _setTitle(CharSequence text) {
        dialogtitletextView.setText(text);
        return this;
    }

    public PrivacyPolicyDialog _setIcon(int drawableResId) {
        mIcon.setImageResource(drawableResId);
        return this;
    }

    public void Close() {
        this.dismiss();
    }

}
