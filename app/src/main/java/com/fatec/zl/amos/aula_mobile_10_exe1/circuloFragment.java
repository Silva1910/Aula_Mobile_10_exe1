package com.fatec.zl.amos.aula_mobile_10_exe1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fatec.zl.amos.aula_mobile_10_exe1.controller.circuloController;
import com.fatec.zl.amos.aula_mobile_10_exe1.controller.retanguloController;
import com.fatec.zl.amos.aula_mobile_10_exe1.model.circulo;
import com.fatec.zl.amos.aula_mobile_10_exe1.model.retangulo;

public class circuloFragment extends Fragment {

    private View view;
    private EditText etRaioC;
    private TextView tvResC;
    private Button btnAreaC;
    private Button btnPerimetroC;



    public circuloFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        etRaioC = view.findViewById(R.id.etRaio);
        btnPerimetroC = view.findViewById(R.id.btnPerimetroC);
        btnAreaC= view.findViewById(R.id.btnAreaC);
        tvResC = view.findViewById(R.id.tvResC);
        tvResC.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


        btnAreaC.setOnClickListener(op -> calcArea());
        btnPerimetroC.setOnClickListener(op -> calcPerimetro());


        return view;

    }
    private void calcArea() {
        circulo c = new circulo();
        c.setRaio(Float.parseFloat(etRaioC.getText().toString()));

        circuloController cc = new circuloController();
        cc .calcArea(c);
        tvResC.setText("o valor da area e ->"+ cc .calcArea(c));
        limparCampos();


    }

    private void calcPerimetro() {
        circulo c = new circulo();
        c.setRaio(Float.parseFloat(etRaioC.getText().toString()));

        circuloController cc = new circuloController();
        cc .calcPerimetro(c);
        tvResC.setText("o valor do perimetro e ->"+ cc .calcArea(c));
        limparCampos();

    }

    private void limparCampos() {
        etRaioC.setText("");


    }




}