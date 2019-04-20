# Privacy Policy Dialog

<img src="Screenshot.png" width="250" >

# Step 1. Add the JitPack repository to your build file
 Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

# Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.HmimssaSoufiane:PrivacyPolicyDialogAlertDialog:'
		}
```
# Step 2. Usage
- DialogCheck.setPreferencesContext(this) create SharedPreferences to store dialog showen state
- DialogCheck._DialogCheck() to check if the dialog had already shown 
- DialogCheck._DialogSaveState() save dialog state (first show of the dialog)
- PrivacyPolicyDialog(this) create dialog and pass the currant context
- _setTitle("Privacy Policy") change the default the title
- _setMessage("message...") change the default message
- _setIcon(Drawable ID (int)) change the dialog default icon
- _btnContinueOnClickListener(View.OnClickListener onClickListener) change button continue functionally code
- _show() display the dialog

```
        final Intent nextActivity = new Intent(MainActivity.this, Main2Activity.class);
        //
        DialogCheck.setPreferencesContext(this);
        //
        if (!DialogCheck._DialogCheck()) {

            final PrivacyPolicyDialog _dialog = new PrivacyPolicyDialog(this);
            _dialog._setTitle("Privacy Policy").
                    _setMessage(R.string.dialogMessage).
                    _setBrandName("AraSoft ").
                    _setIcon(R.drawable.ic_private_sign).
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
```
# Developed By

Salah chnitfa and Hmimssa Soufiane 
