package net.sparkeek.mvp_app_2.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.IdRes;

import net.sparkeek.mvp_app_2.navigation.Navigator;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.DaggerActivity;

public abstract class BaseActivity extends DaggerActivity {

    @Inject
    protected Navigator navigator;

    @Inject
    @Named(BaseActivityModule.ACTIVITY_FRAGMENT_MANAGER)
    protected FragmentManager fragmentManager;

    protected final void addFragment(@IdRes int containerViewId, Fragment fragment) {
        fragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit();
    }

}
