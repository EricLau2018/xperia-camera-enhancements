package com.trypto.android.xbettercam;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Display the fragment as the main content.
		getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();

//		PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
	}

	public static class SettingsFragment extends PreferenceFragment {
		@SuppressWarnings("deprecation")
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);

			getPreferenceManager().setSharedPreferencesMode(Activity.MODE_WORLD_READABLE);
			// Load the preferences from an XML resource
			addPreferencesFromResource(R.xml.preferences);
		}
	}
}