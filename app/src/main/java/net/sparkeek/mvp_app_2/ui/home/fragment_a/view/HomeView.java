package net.sparkeek.mvp_app_2.ui.home.fragment_a.view;

import net.sparkeek.mvp_app_2.ui.view.MVPView;

public interface HomeView extends MVPView {
    void showSomething(String messageToBeShown);
    String getTextValue();
}
