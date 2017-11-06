package net.sparkeek.mvp_app_2.ui.home;

import android.os.Bundle;

import net.sparkeek.mvp_app_2.R;
import net.sparkeek.mvp_app_2.ui.BaseActivity;
import net.sparkeek.mvp_app_2.ui.home.fragment.view.HomeFragment;

public final class HomeActivity extends BaseActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new HomeFragment());
        }
    }
}
