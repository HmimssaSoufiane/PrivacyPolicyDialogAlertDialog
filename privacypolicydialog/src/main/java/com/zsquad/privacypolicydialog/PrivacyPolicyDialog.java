package com.zsquad.privacypolicydialog;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
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
    private String _url;

    public PrivacyPolicyDialog(Context context) {
        super(context);
        mDialogView = View.inflate(context, R.layout.dialog_2, null);
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

        urlPrivacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InfoIntent;
                try {
                    InfoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(_url));
                    getContext().startActivity(InfoIntent);

                } catch (ActivityNotFoundException ignored) {

                }
            }
        });
    }


    public PrivacyPolicyDialog _btnContinueOnClickListener(View.OnClickListener onClickListener) {
        btnAccept.setOnClickListener(onClickListener);
        return this;
    }
    public PrivacyPolicyDialog _setURL(String url) {
        _url=url;
        return this;
    }
    //
    public PrivacyPolicyDialog _setMessage(CharSequence message) {
        dialogtextView.setText(message);
        return this;
    }

    public PrivacyPolicyDialog _setMessage(int message) {
        dialogtextView.setText(message);
        return this;
    }

    public PrivacyPolicyDialog _setBrandName(int brandName) {
        textViewBrand.setText(brandName);
        return this;
    }

    public PrivacyPolicyDialog _setBrandName(String brandName) {
        textViewBrand.setText(brandName);
        return this;
    }

    public PrivacyPolicyDialog _setTitle(int text) {
        dialogtitletextView.setText(text);
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

    public void _close() {
        this.dismiss();
    }

    public void _show() {
        this.show();
    }

}
