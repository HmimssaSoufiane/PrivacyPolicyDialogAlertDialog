package com.zsquad.privacypolicydialog;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
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
    Context mcontext;

    public PrivacyPolicyDialog(Context context) {
        super(context);
        mcontext=context;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mDialogView = View.inflate(mcontext, R.layout.dialog, null);
        setView(mDialogView);
        //
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        this.setCanceledOnTouchOutside(false);

        btnAccept = mDialogView.findViewById(R.id.dialogbtn);
        textViewBrand = mDialogView.findViewById(R.id.textViewBrand);
        urlPrivacyPolicy = mDialogView.findViewById(R.id.textViewPrivacyPolicy);
        dialogtitletextView = mDialogView.findViewById(R.id.dialogtitletextView);
        dialogtextView = mDialogView.findViewById(R.id.dialogtextView);
        mIcon = mDialogView.findViewById(R.id.imageView);
        super.onCreate(savedInstanceState);
    }

//    @Override
//    public PrivacyPolicyDialog setMessage(CharSequence message) {
//        dialogtextView.setText(message);
//        return this;
//    }

    public PrivacyPolicyDialog setBrandName(String brandName) {
        textViewBrand.setText(brandName);
        return this;
    }

    public PrivacyPolicyDialog urlPrivacyPolicy(String url) {
        urlPrivacyPolicy.setText(url);
        return this;
    }

//    @Override
//    public PrivacyPolicyDialog setTitle(CharSequence text) {
//        dialogtitletextView.setText(text);
//        return this;
//    }
//
//    @Override
//    public PrivacyPolicyDialog setIcon(int drawableResId) {
//        mIcon.setImageResource(drawableResId);
//        return this;
//    }

}
