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
-

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
