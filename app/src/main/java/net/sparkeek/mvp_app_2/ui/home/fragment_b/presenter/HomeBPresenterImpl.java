package net.sparkeek.mvp_app_2.ui.home.fragment_b.presenter;

import net.sparkeek.mvp_app_2.inject.PerFragment;
import net.sparkeek.mvp_app_2.ui.home.fragment_b.view.HomeBView;
import net.sparkeek.mvp_app_2.ui.presenter.BasePresenter;

import javax.inject.Inject;

@PerFragment
public class HomeBPresenterImpl extends BasePresenter<HomeBView> implements HomeBPresenter {

    private final String messageToShow = "Fragment B";

    @Inject
    HomeBPresenterImpl(final HomeBView view) {
        super(view);
    }

    @Override
    public void doSomething() {
        final String something = messageToShow;
        view.showSomething(messageToShow);
    }
}
