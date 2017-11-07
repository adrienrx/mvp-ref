package net.sparkeek.mvp_app_2.ui.home.fragment_b.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.sparkeek.mvp_app_2.R;
import net.sparkeek.mvp_app_2.ui.home.fragment_b.presenter.HomeBPresenter;
import net.sparkeek.mvp_app_2.ui.view.BaseViewFragment;

import butterknife.BindView;
import butterknife.OnClick;

public final class HomeBFragment extends BaseViewFragment<HomeBPresenter> implements HomeBView {

    @BindView(R.id.Exemple2Fragment_TextView_helloWorld)
    TextView hello_world_text;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_b_fragment, container, false);
    }

    @OnClick(R.id.Exemple2Fragment_TextView_helloWorld)
    void onSomeThingClicked() {
        presenter.doSomething();
    }

    @Override
    public void showSomething(final String messageToBeShown) {
        hello_world_text.setText(messageToBeShown);
    }
}
