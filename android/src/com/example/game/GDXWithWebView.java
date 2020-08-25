package com.example.game;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;

public class GDXWithWebView extends AndroidFragmentApplication {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();//Configure with whatever you need
        return initializeForView(new Game(), config);
    }
}
