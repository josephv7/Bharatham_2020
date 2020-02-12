package com.iamjosephvarghese.bharatham2020;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragment0 tab0 = new TabFragment0();
                return tab0;

            case 1:
                TabFragment1 tab1 = new TabFragment1();
                return tab1;
            case 2:
                TabFragment2 tab2 = new TabFragment2();
                return tab2;
            case 3:
                TabFragment3 tab3 = new TabFragment3();
                return tab3;
            case 4:
                TabFragment4 tab4 = new TabFragment4();
                return tab4;
            case 5:
                TabFragment5 tab5 = new TabFragment5();
                return tab5;
            case 6:
                TabFragment6 tab6 = new TabFragment6();
                return tab6;
            case 7:
                TabFragment7 tab7 = new TabFragment7();
                return tab7;
            case 8:
                TabFragment8 tab8 = new TabFragment8();
                return tab8;
            case 9:
                TabFragment9 tab9 = new TabFragment9();
                return tab9;
            case 10:
                TabFragment10 tab10 = new TabFragment10();
                return tab10;
            case 11:
                TabFragment11 tab11 = new TabFragment11();
                return tab11;
            case 12:
                TabFragment12 tab12 = new TabFragment12();
                return tab12;
            case 13:
                TabFragment13 tab13 = new TabFragment13();
                return tab13;
            case 14:
                TabFragment14 tab14 = new TabFragment14();
                return tab14;
            case 15:
                TabFragment15 tab15 = new TabFragment15();
                return tab15;
            case 16:
                TabFragment16 tab16 = new TabFragment16();
                return tab16;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
