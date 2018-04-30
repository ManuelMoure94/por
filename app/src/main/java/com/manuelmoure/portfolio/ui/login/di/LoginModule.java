package com.manuelmoure.portfolio.ui.login.di;

import com.manuelmoure.portfolio.ui.login.mvp.LoginInteract;
import com.manuelmoure.portfolio.ui.login.mvp.LoginPresenter;
import com.manuelmoure.portfolio.ui.login.mvp.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RSE_VZLA_07 on 27/4/2018.
 */

@Module
public class LoginModule {

    private MainActivity activity;

    public LoginModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    @LoginScope
    public MainActivity providesMainActivity() {
        return activity;
    }

    @Provides
    @LoginScope
    public LoginPresenter providesLoginPresenter(LoginInteract interact) {
        return new LoginPresenter(activity, interact);
    }

    @Provides
    @LoginScope
    public LoginInteract providesLoginInteract() {
        return new LoginInteract();
    }
}
