package net.sparkeek.mvp_app_2.util;

import android.app.Fragment;

import net.sparkeek.mvp_app_2.inject.PerChildFragment;
import net.sparkeek.mvp_app_2.ui.view.BaseChildFragmentModule;

import javax.inject.Inject;
import javax.inject.Named;

@PerChildFragment
public final class PerChildFragmentUtil {

    private final Fragment childFragment;

    @Inject
    PerChildFragmentUtil(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) Fragment childFragment) {
        this.childFragment = childFragment;
    }

    /**
     * @return the result of the work done here as a string. For this example, this returns its
     * {@link #hashCode()} and the child fragment's {@link #hashCode()}.
     */
    public String doSomething() {
        return "PerChildFragmentUtil: " + hashCode()
                + ", child Fragment: " + childFragment.hashCode();
    }

}
