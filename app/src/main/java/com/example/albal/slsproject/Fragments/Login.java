package com.example.albal.slsproject.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.albal.slsproject.R;

/**
 * Created by albal on 09/05/2017.
 */

public class Login extends Fragment {

    protected EditText name;
    protected EditText lastname;
    protected Button btn_facebook;
    protected Button btn_google;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.login_fragment, container, false);

        name = (EditText) rootView.findViewById(R.id.lgn_emri);
        lastname = (EditText) rootView.findViewById(R.id.lgn_mbiemri);

        btn_facebook = (Button) rootView.findViewById(R.id.button_fb);
        btn_google = (Button) rootView.findViewById(R.id.button_google);

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Jeni loguar me Facebook",Toast.LENGTH_SHORT).show();
            }
        });

        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Jeni loguar me Google",Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
