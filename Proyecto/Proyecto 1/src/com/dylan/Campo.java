package com.dylan;

public class Campo extends TipoTerreno {

    //Devuelve una figura de color verde qeu representa al campo
    @Override
    String getCuadroColor() {
        return Verde+cuadroCampo;
    }
}