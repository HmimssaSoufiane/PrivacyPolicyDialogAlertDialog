package com.zsquad.privacypolicydialog;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import static android.content.Context.MODE_PRIVATE;

public class DialogCheck {
    private static SharedPreferences pref;
    public static void setPreferencesContext(Context context) {

        DialogCheck.pref = PreferenceManager.getDefaultSharedPreferences(context);

    }
    public static boolean _DialogCheck() {
        return pref.getBoolean("isIntroOpnend", false);
    }

    public static void _DialogSaveState() {
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpnend", true);
        editor.apply();
    }
}
