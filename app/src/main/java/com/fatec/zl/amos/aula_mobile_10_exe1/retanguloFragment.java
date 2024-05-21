package com.fatec.zl.amos.aula_mobile_10_exe1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fatec.zl.amos.aula_mobile_10_exe1.controller.retanguloController;
import com.fatec.zl.amos.aula_mobile_10_exe1.model.retangulo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class retanguloFragment extends Fragment {
    private View view;
    private EditText etAlturaR;
    private EditText etBaseR;
    private TextView tvResR;
    private Button btnAreaR;
    private Button btnPerimetroR;

    public retanguloFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etBaseR = view.findViewById(R.id.etBaseR);
        etAlturaR = view.findViewById(R.id.etAlturaR);
        btnPerimetroR = view.findViewById(R.id.btnPerimetroR);
        btnAreaR= view.findViewById(R.id.btnAreaR);
        tvResR = view.findViewById(R.id.tvResR);
        tvResR.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        btnAreaR.setOnClickListener(op -> calcArea());
        btnPerimetroR.setOnClickListener(op -> calcPerimetro());


        return view;

    }
    private void calcArea() {
        retangulo r = new retangulo();
        r.setAltura(Float.parseFloat(etAlturaR.getText().toString()));
        r.setBase(Float.parseFloat(etBaseR.getText().toString()));

        retanguloController rc = new retanguloController();
        rc .calcArea(r);
        tvResR.setText("o valor da area e ->"+ rc .calcArea(r));
        limparCampos();


    }

    private void calcPerimetro() {
        retangulo r = new retangulo();
        r.setAltura(Float.parseFloat(etAlturaR.getText().toString()));
        r.setBase(Float.parseFloat(etBaseR.getText().toString()));

        retanguloController rc = new retanguloController();


        tvResR.setText("o valor do perimetro e ->"+ rc .calcPerimetro(r));

        limparCampos();


    }

    private void limparCampos() {
        etAlturaR.setText("");
        etBaseR.setText("");


    }
}