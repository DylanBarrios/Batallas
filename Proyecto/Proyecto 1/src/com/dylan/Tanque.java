package com.dylan;

public class Tanque extends Usuario{
    //Crea un contructor vacio y un constructor donde define ya los atributos que tiene este tipo de vehiculo
    public Tanque (){}
    public Tanque (String nombre)
    {
        super(nombre,10,6,60);
    }
}
