package net.sparkeek.mvp_app_2.ui.view;

import android.os.Bundle;

import net.sparkeek.mvp_app_2.ui.presenter.Presenter;

import javax.inject.Inject;

public class BaseViewFragment<T extends Presenter> extends BaseFragment implements MVPView {

    @Inject
    protected T presenter;

    @Override
    public void onViewStateRestored(final Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        presenter.onStart(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        presenter.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroyView() {
        presenter.onEnd();
        super.onDestroyView();
    }
}
