package net.sparkeek.mvp_app_2;

import android.app.Application;

import net.sparkeek.mvp_app_2.inject.PerActivity;
import net.sparkeek.mvp_app_2.ui.home.HomeActivity;
import net.sparkeek.mvp_app_2.ui.home.HomeActivityModule;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
abstract class MyAppModule {
    @Binds
    @Singleton
    abstract Application application(final MyApp app);

    @PerActivity
    @ContributesAndroidInjector(modules = HomeActivityModule.class)
    abstract HomeActivity homeActivityInjector();
}
