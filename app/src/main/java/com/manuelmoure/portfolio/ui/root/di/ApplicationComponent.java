package com.manuelmoure.portfolio.ui.root.di;

import com.manuelmoure.portfolio.ui.login.di.LoginComponent;
import com.manuelmoure.portfolio.ui.login.di.LoginModule;
import com.manuelmoure.portfolio.ui.root.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by RSE_VZLA_07 on 27/4/2018.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(App app);

    LoginComponent plus(LoginModule module);
}
