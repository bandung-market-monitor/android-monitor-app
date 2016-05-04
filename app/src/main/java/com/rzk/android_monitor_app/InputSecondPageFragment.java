package com.rzk.android_monitor_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputSecondPageFragment extends Fragment {
    Bundle bundle;


    public InputSecondPageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        bundle = getArguments();
        Toast.makeText(getContext(),bundle.getString("test"),Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_second_page, container, false);
    }

}
