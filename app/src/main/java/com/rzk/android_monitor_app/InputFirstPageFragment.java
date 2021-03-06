package com.rzk.android_monitor_app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Spinner;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InputFirstPageFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class InputFirstPageFragment extends Fragment implements DatePickerDialog.OnDateSetListener {

    private OnFragmentInteractionListener mListener;
    private TextInputEditText editTextDate, editTextBerasMedium, editTextMinyakKelapa;
    private TextInputEditText editTextTepungTerigu, editTextKacangKedelai, editTextGulaPasir;
    private TextInputEditText editTextMentega, editTextTelurAyam, editTextDagingSapi;
    private Spinner spinnerPasar;

    public InputFirstPageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.inputfirstfragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.next_item) {
            String test = "Test1";
            Bundle bundle = new Bundle();
            bundle.putString("test", test);
            onButtonPressed(bundle);


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
        menu.clear();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_input_first_page, container, false);
        editTextDate = (TextInputEditText) view.findViewById(R.id.input_date);
        spinnerPasar = (Spinner) view.findViewById(R.id.input_pasar);
        editTextBerasMedium = (TextInputEditText) view.findViewById(R.id.input_beras_medium);
        editTextMinyakKelapa = (TextInputEditText) view.findViewById(R.id.input_minyak_kelapa);
        editTextTepungTerigu = (TextInputEditText) view.findViewById(R.id.input_tepung_terigu);
        editTextKacangKedelai = (TextInputEditText) view.findViewById(R.id.input_kacang_kedelai);
        editTextGulaPasir = (TextInputEditText) view.findViewById(R.id.input_gula_pasir);
        editTextMentega = (TextInputEditText) view.findViewById(R.id.input_mentega);
        editTextTelurAyam = (TextInputEditText) view.findViewById(R.id.input_telur_ayam);
        editTextDagingSapi = (TextInputEditText) view.findViewById(R.id.input_daging_sapi);

        //create onclick to open datepicker
        editTextDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getWindow().setSoftInputMode(
                        WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                openDatePicker();
            }
        });

        editTextDate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    getActivity().getWindow().setSoftInputMode(
                            WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    openDatePicker();
                }
            }
        });


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    private void openDatePicker() {
        Calendar now = Calendar.getInstance();
        DatePickerDialog dpd = DatePickerDialog.newInstance(
                this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        );
        dpd.show(getActivity().getFragmentManager(), "DatePickerDialog");

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Bundle data) {
        if (mListener != null) {
            mListener.onFragmentInteraction(data);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        String selectedDate = dayOfMonth + "/" + (++monthOfYear) + "/" + year;
        editTextDate.setText(selectedDate);
        spinnerPasar.requestFocus();

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Bundle data);
    }
}
