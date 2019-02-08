package com.example.dam2a03.crime;

import android.support.v4.app.Fragment;


    public class CrimeListActivity extends SingleFragmentActivity {
        @Override
        protected Fragment createFragment() {
            return new CrimeListFragment();
        }

    }
