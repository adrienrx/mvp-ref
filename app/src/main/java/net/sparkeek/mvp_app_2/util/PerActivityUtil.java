package net.sparkeek.mvp_app_2.util;

import android.app.Activity;

import net.sparkeek.mvp_app_2.inject.PerActivity;

import javax.inject.Inject;

@PerActivity
public final class PerActivityUtil {

    private final Activity activity;

    @Inject
    PerActivityUtil(Activity activity) {
        this.activity = activity;
    }

    public String doSomething() {
        return "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode();
    }

}
