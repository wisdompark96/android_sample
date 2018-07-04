package com.example.pjh.tensorflow_sleep;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter  {

    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                LeftFragment leftFragment = new LeftFragment();
                return leftFragment;
            case 1:
                CenterFragment centerFragment = new CenterFragment();
                return centerFragment;
            case 2:
                RightFragment rightFragment = new RightFragment();
                return rightFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
