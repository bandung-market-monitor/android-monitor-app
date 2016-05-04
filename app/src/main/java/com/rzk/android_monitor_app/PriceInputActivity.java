package com.rzk.android_monitor_app;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class PriceInputActivity extends AppCompatActivity implements InputFirstPageFragment.OnFragmentInteractionListener {
    InputFirstPageFragment firstPageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_input);
        firstPageFragment = new InputFirstPageFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, firstPageFragment).commit();

    }

    @Override
    public void onFragmentInteraction(Bundle data) {
        InputSecondPageFragment secondPageFragment = new InputSecondPageFragment();
        secondPageFragment.setArguments(data);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, secondPageFragment);
        transaction.commit();
    }
}
