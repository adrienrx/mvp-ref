package net.sparkeek.mvp_app_2.ui.presenter;

import android.os.Bundle;

import net.sparkeek.mvp_app_2.ui.view.MVPView;

public abstract class BasePresenter<T extends MVPView> implements Presenter {

    protected final T view;

    protected BasePresenter(T view) {
        this.view = view;
    }

    @Override
    public void onStart(final Bundle savedInstanceState) {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
    }

    @Override
    public void onEnd() {
    }

}
