package com.rzk.android_monitor_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class InputSecondPageFragment extends Fragment {
    Bundle bundle;
    Button buttonSave;


    public InputSecondPageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        bundle = getArguments();
        Toast.makeText(getContext(), bundle.getString("test"), Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input_second_page, container, false);
        buttonSave = (Button) view.findViewById(R.id.btn_save);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return view;
    }

    private void saveData() {

    }

}
