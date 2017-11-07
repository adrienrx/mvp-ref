package net.sparkeek.mvp_app_2.ui.home.fragment_b.presenter;

import net.sparkeek.mvp_app_2.inject.PerFragment;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class HomeBPresenterModule {
    @Binds
    @PerFragment
    abstract HomeBPresenter homeBPresenter(HomeBPresenterImpl homeBPresenter);
}
