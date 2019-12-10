package com.aakriti.fragments.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aakriti.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {
    private Button btnCalculate;
    private EditText etFirst, etSecond;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_first, container, false);
        View view= inflater.inflate(R.layout.fragment_first, container, false);

        etFirst= view.findViewById(R.id.etFirstNo);
        etSecond= view.findViewById(R.id.etSecondNo);
        btnCalculate= view.findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first= Integer.parseInt(etFirst.getText().toString());
        int second= Integer.parseInt(etSecond.getText().toString());
        int result= first+second;

        Toast.makeText(getActivity(),"Sum is : " + result, Toast.LENGTH_SHORT).show();
    }
}
