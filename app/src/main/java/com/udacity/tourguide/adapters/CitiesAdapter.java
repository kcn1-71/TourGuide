package com.udacity.tourguide.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udacity.tourguide.fragments.CanberraFragment;
import com.udacity.tourguide.fragments.MelbourneFragment;
import com.udacity.tourguide.fragments.PerthFragment;
import com.udacity.tourguide.R;
import com.udacity.tourguide.fragments.SydneyFragment;

public class CitiesAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CitiesAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SydneyFragment();
        } else if (position == 1) {
            return new MelbourneFragment();
        } else if (position == 2) {
            return new CanberraFragment();
        } else {
            return new PerthFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sydney);
        } else if (position == 1) {
            return mContext.getString(R.string.category_melbourne);
        } else if (position == 2) {
            return mContext.getString(R.string.category_canberra);
        } else {
            return mContext.getString(R.string.category_perth);
        }
    }
}
