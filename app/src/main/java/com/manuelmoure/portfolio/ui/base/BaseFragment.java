package com.manuelmoure.portfolio.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.manuelmoure.portfolio.ui.root.App;
import com.manuelmoure.portfolio.ui.root.di.ApplicationComponent;

/**
 * Created by RSE_VZLA_07 on 27/4/2018.
 */

public abstract class BaseFragment extends Fragment {

    protected abstract void injectDependencies(ApplicationComponent applicationComponent);

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        injectDependencies(App.getInstance().getApplicationComponent());
    }
}
