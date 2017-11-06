package net.sparkeek.mvp_app_2.ui.home.fragment.view;

import android.app.Fragment;

import net.sparkeek.mvp_app_2.inject.PerFragment;
import net.sparkeek.mvp_app_2.ui.home.fragment.presenter.HomePresenterModule;
import net.sparkeek.mvp_app_2.ui.view.BaseFragmentModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = {BaseFragmentModule.class, HomePresenterModule.class})
public abstract class HomeFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(HomeFragment homeFragment);

    @Binds
    @PerFragment
    abstract HomeView exemple1View(HomeFragment homeFragment);

}
