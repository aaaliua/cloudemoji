package org.ktachibana.cloudemoji;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.widget.Toast;

public class SettingsActivity extends PreferenceActivity
        implements SharedPreferences.OnSharedPreferenceChangeListener, Preference.OnPreferenceClickListener {

    public static final String PREF_STAY_IN_NOTIFICATION = "pref_stay_in_notification";
    public static final String PREF_CLOSE_AFTER_COPY = "pref_close_after_copy";
    public static final String PREF_TEST_MY_REPO = "pref_test_my_repository";
    public static final String PREF_RESTORE_DEFAULT = "pref_restore_default";

    private SharedPreferences myPreferences;
    private EditTextPreference editTextPreference;
    private Preference restore_pref;

    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        myPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        myPreferences.registerOnSharedPreferenceChangeListener(this);
        editTextPreference = (EditTextPreference)findPreference(PREF_TEST_MY_REPO);
        editTextPreference.setSummary(editTextPreference.getText());
        restore_pref = findPreference(PREF_RESTORE_DEFAULT);
        restore_pref.setOnPreferenceClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                myPreferences.unregisterOnSharedPreferenceChangeListener(this);
                onBackPressed();
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences preferences, String key) {
        if (key.equals(SettingsActivity.PREF_TEST_MY_REPO)) {
            String newUrl = editTextPreference.getText();
            editTextPreference.setSummary(newUrl);
        }
     }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        editTextPreference.setText(getString(R.string.default_url));
        editTextPreference.setSummary(getString(R.string.default_url));
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, getString(R.string.restored_default), duration);
        toast.show();
        return true;
    }

}