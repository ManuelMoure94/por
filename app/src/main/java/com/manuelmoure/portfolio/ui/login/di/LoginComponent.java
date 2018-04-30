package com.manuelmoure.portfolio.ui.login.di;

import com.manuelmoure.portfolio.ui.login.mvp.MainActivity;

import dagger.Subcomponent;

/**
 * Created by RSE_VZLA_07 on 27/4/2018.
 */

@LoginScope
@Subcomponent(modules = {LoginModule.class})
public interface LoginComponent {
    void inject(MainActivity target);
}
