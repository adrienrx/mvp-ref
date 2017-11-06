package net.sparkeek.mvp_app_2.ui.home.fragment.presenter;

import net.sparkeek.mvp_app_2.inject.PerFragment;
import net.sparkeek.mvp_app_2.ui.home.fragment.view.HomeView;
import net.sparkeek.mvp_app_2.ui.presenter.BasePresenter;

import javax.inject.Inject;

@PerFragment
public class HomePresenterImpl extends BasePresenter<HomeView> implements HomePresenter {

    private final String messageToShow = "blabla";

    @Inject
    HomePresenterImpl(final HomeView view) {
        super(view);
    }

    @Override
    public void doSomething() {
        final String something = messageToShow;
        view.showSomething(messageToShow);
    }
}
