package com.rzk.android_monitor_app;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class InputSecondPageFragment extends Fragment {
    Bundle bundle;
    private TextInputEditText editTextAyamPotong, editTextIkanLele, editTextCabeMerah;
    private TextInputEditText editTextCabeHijau, editTextBawangMerah, editTextCabeRawit;
    private TextInputEditText editTextBawangPutih, editTextTomat, editTextWortel;
    private TextInputEditText editTextKentang, editTextPisangAmbon, editTextJeruk, editTextGasElpiji;


    public InputSecondPageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.inputsecondfragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.save_item) {
            getActivity().finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();
        bundle = getArguments();
        //Toast.makeText(getContext(), bundle.getString("test"), Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input_second_page, container, false);
        editTextAyamPotong = (TextInputEditText) view.findViewById(R.id.input_ayam_potong);
        editTextIkanLele = (TextInputEditText) view.findViewById(R.id.input_ikan_lele);
        editTextCabeMerah = (TextInputEditText) view.findViewById(R.id.input_cabe_merah);
        editTextCabeHijau = (TextInputEditText) view.findViewById(R.id.input_cabe_hijau);
        editTextBawangMerah = (TextInputEditText) view.findViewById(R.id.input_bawang_merah);
        editTextCabeRawit = (TextInputEditText) view.findViewById(R.id.input_cabe_rawit);
        editTextBawangPutih = (TextInputEditText) view.findViewById(R.id.input_bawang_putih);
        editTextTomat = (TextInputEditText) view.findViewById(R.id.input_tomat);
        editTextWortel = (TextInputEditText) view.findViewById(R.id.input_wortel);

        return view;
    }

    private void saveData() {

    }

}
