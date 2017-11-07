package net.sparkeek.mvp_app_2.ui.home.fragment_a.presenter;

import net.sparkeek.mvp_app_2.inject.PerFragment;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class HomePresenterModule {
    @Binds
    @PerFragment
    abstract HomePresenter exemple1Presenter(HomePresenterImpl exemple1Presenter);
}
