package net.sparkeek.mvp_app_2.ui.home.fragment_a.presenter;

import android.os.Bundle;

import net.sparkeek.mvp_app_2.inject.PerFragment;
import net.sparkeek.mvp_app_2.ui.home.fragment_a.view.HomeView;
import net.sparkeek.mvp_app_2.ui.presenter.BasePresenter;

import javax.inject.Inject;

@PerFragment
public class HomePresenterImpl extends BasePresenter<HomeView> implements HomePresenter {

    private final String messageToShow = "Fragment A";

    @Inject
    HomePresenterImpl(final HomeView view) {
        super(view);
    }

    @Override
    public void doSomething() {
        final String something = messageToShow;
        view.showSomething(messageToShow);
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("a1", view.getTextValue());
    }

    @Override
    public void onStart(final Bundle savedInstanceState) {
        super.onStart(savedInstanceState);
        if(savedInstanceState != null) {
            view.showSomething(savedInstanceState.getString("a1"));
        }
    }
}
