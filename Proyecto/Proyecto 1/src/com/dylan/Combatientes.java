package com.dylan;

public class Combatientes extends TipoTerreno{

        //Declara los colores y figruas qeu me srivaran para desarrollar el juego

        protected char Enemigo = '▼';
        protected char Avion = '✈';
        protected char Tanque = '卐';
        protected String colorBlanco = "\033[30m";
        protected String colorMagenta = "\033[35m";

        @Override
        String getCuadroColor() {
                return colorMagenta+Enemigo;
        }
}