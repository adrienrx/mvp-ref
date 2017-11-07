package net.sparkeek.mvp_app_2.ui.home.fragment_a.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.sparkeek.mvp_app_2.R;
import net.sparkeek.mvp_app_2.ui.home.fragment_a.presenter.HomePresenter;
import net.sparkeek.mvp_app_2.ui.view.BaseViewFragment;

import butterknife.BindView;
import butterknife.OnClick;

public final class HomeFragment extends BaseViewFragment<HomePresenter> implements HomeView {

    @BindView(R.id.Exemple1Fragment_TextView_helloWorld)
    TextView hello_world_text;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_a_fragment, container, false);
    }

    @OnClick(R.id.Exemple1Fragment_TextView_helloWorld)
    void onSomeThingClicked() {
        presenter.doSomething();
    }

    @Override
    public void showSomething(final String messageToBeShown) {
        hello_world_text.setText(messageToBeShown);
    }

    @Override
    public String getTextValue() {
        return hello_world_text.getText().toString();
    }
}
