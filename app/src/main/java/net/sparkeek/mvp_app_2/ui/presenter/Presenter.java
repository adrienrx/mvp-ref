package net.sparkeek.mvp_app_2.ui.presenter;

import android.os.Bundle;

import javax.annotation.Nullable;

public interface Presenter {

    void onStart(@Nullable Bundle savedInstanceState);

    void onResume();

    void onPause();

    void onSaveInstanceState(Bundle outState);

    void onEnd();

}
