package com.slgp.gestionprojet;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class Accueil extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }

    public static class FragmentProjet extends Fragment{

        public FragmentProjet() {
        }

        public static FragmentProjet newInstance() {
            FragmentProjet fragment = new FragmentProjet();
            return fragment;
        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.fragment_accueil, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText("Projets");
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent selectionProjet = new Intent(getActivity(), SelectionProjet.class);
                    startActivity(selectionProjet);
                }
            });
            return rootView;
        }
    }

    public static class FragmentTache extends Fragment{

        public FragmentTache() {
        }

        public static FragmentTache newInstance() {
            FragmentTache fragment = new FragmentTache();
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.fragment_accueil, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText("Tâches");
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent tacheAccueil = new Intent(getActivity(), TacheAccueil.class);
                    startActivity(tacheAccueil);
                }
            });
            return rootView;
        }
    }

    public static class FragmentNotification extends Fragment{

        public FragmentNotification() {
        }

        public static FragmentNotification newInstance() {
            FragmentNotification fragment = new FragmentNotification();
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.fragment_accueil, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText("Notifications");
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent notificationAccueil = new Intent(getActivity(), NotificationAccueil.class);
                    startActivity(notificationAccueil);
                }
            });
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FragmentProjet.newInstance();
                case 1:
                    return FragmentTache.newInstance();
                case 2:
                    return FragmentNotification.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Projets";
                case 1:
                    return "Tâches";
                case 2:
                    return "Notifications";
            }
            return null;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
