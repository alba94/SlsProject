package com.example.albal.slsproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.albal.slsproject.Fragments.Login;
import com.example.albal.slsproject.Fragments.Register;

/**
 * Created by albal on 09/05/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter {

    private int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Register();

            case 1:
                return new Login();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
