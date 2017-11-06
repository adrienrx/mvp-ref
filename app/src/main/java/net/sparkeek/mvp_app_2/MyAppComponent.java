package net.sparkeek.mvp_app_2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = MyAppModule.class)
public interface MyAppComponent extends AndroidInjector<MyApp> {

    void inject(MyApp myApp);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MyAppComponent.Builder application(Application application);
        MyAppComponent build();
    }
}
