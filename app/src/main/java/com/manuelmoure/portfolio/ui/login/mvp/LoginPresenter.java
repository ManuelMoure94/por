package com.manuelmoure.portfolio.ui.login.mvp;

/**
 * Created by RSE_VZLA_07 on 27/4/2018.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View view;
    private LoginContract.Interact interact;

    public LoginPresenter(LoginContract.View view, LoginContract.Interact interact) {
        this.view = view;
        this.interact = interact;
    }
}
