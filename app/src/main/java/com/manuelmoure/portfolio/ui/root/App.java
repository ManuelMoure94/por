package com.manuelmoure.portfolio.ui.root;

import android.app.Application;

import com.manuelmoure.portfolio.ui.root.di.ApplicationComponent;
import com.manuelmoure.portfolio.ui.root.di.ApplicationModule;
import com.manuelmoure.portfolio.ui.root.di.DaggerApplicationComponent;

/**
 * Created by RSE_VZLA_07 on 27/4/2018.
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;
    private static App instance;

    public static App getInstance() {
        return instance;
    }

    public static void setInstance(App instance) {
        App.instance = instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
