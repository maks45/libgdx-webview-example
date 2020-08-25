package com.example.game;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import androidx.fragment.app.FragmentActivity;

public class AndroidLauncher extends FragmentActivity implements AndroidFragmentApplication.Callbacks {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.gdxwebview);

		GDXWithWebView fragment = new GDXWithWebView();

		BlankFragment blankFragment = new BlankFragment();

		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.fragmentRoot, fragment)
				.commit();
		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.fragmentRoot, blankFragment)
				.commit();

	}

	@Override
	public void exit() {

	}
}
