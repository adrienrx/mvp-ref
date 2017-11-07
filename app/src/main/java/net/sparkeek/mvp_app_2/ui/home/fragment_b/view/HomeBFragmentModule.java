package net.sparkeek.mvp_app_2.ui.home.fragment_b.view;

import android.app.Fragment;

import net.sparkeek.mvp_app_2.inject.PerFragment;
import net.sparkeek.mvp_app_2.ui.home.fragment_b.presenter.HomeBPresenterModule;
import net.sparkeek.mvp_app_2.ui.view.BaseFragmentModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = {BaseFragmentModule.class, HomeBPresenterModule.class})
public abstract class HomeBFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(HomeBFragment homeBFragment);

    @Binds
    @PerFragment
    abstract HomeBView exemple1View(HomeBFragment homeBFragment);

}
