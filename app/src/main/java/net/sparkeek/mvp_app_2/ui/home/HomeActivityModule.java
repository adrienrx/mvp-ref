package net.sparkeek.mvp_app_2.ui.home;

import android.app.Activity;

import net.sparkeek.mvp_app_2.inject.PerActivity;
import net.sparkeek.mvp_app_2.inject.PerFragment;
import net.sparkeek.mvp_app_2.ui.BaseActivityModule;
import net.sparkeek.mvp_app_2.ui.home.fragment.view.HomeFragment;
import net.sparkeek.mvp_app_2.ui.home.fragment.view.HomeFragmentModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = BaseActivityModule.class)
public abstract class HomeActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = HomeFragmentModule.class)
    abstract HomeFragment exemple1FragmentInjector();

    @Binds
    @PerActivity
    abstract Activity activity(HomeActivity homeActivity);
}
