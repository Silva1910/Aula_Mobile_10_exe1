package com.fatec.zl.amos.aula_mobile_10_exe1.controller;

import com.fatec.zl.amos.aula_mobile_10_exe1.model.circulo;

public class circuloController implements IGeometriaController<circulo> {
    @Override
    public float calcArea(circulo c) {
        float raio = c.getRaio();
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float calcPerimetro(circulo c) {
        float raio = c.getRaio();
        return (float) (2 * Math.PI * raio);
    }
}
