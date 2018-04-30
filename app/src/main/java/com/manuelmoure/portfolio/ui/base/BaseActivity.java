package com.manuelmoure.portfolio.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.manuelmoure.portfolio.ui.root.App;
import com.manuelmoure.portfolio.ui.root.di.ApplicationComponent;

/**
 * Created by RSE_VZLA_07 on 27/4/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract void injectDependencies(ApplicationComponent applicationComponent);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies(App.getInstance().getApplicationComponent());
    }
}
