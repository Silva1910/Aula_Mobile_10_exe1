package com.fatec.zl.amos.aula_mobile_10_exe1.controller;
import com.fatec.zl.amos.aula_mobile_10_exe1.model.retangulo;
public class retanguloController implements IGeometriaController<retangulo> {
    @Override
    public float calcArea(retangulo r) {
        return r.getBase() * r.getAltura();
    }

    @Override
    public float calcPerimetro(retangulo r) {
        return 2 * (r.getBase() + r.getAltura());
    }
}
