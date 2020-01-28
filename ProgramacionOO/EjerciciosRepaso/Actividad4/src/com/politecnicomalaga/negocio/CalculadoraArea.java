package com.politecnicomalaga.negocio;

import com.politecnicomalaga.modelo.Circulo;
import com.politecnicomalaga.modelo.Cuadrado;
import com.politecnicomalaga.modelo.Figuras;
import com.politecnicomalaga.modelo.Triangulo;

public class CalculadoraArea {
    public void calcular(Figuras figuras) {
        double area = 0;
        if (figuras instanceof Circulo){
            Circulo circulo = (Circulo) figuras;
            area = Math.pow(circulo.getRadio(),2) * Math.PI;
        } else if (figuras instanceof Triangulo){
            Triangulo triangulo = (Triangulo) figuras;
            area = triangulo.getBase() * triangulo.getAltura()/2;
        }else if (figuras instanceof Cuadrado){
            Cuadrado cuadrado = (Cuadrado) figuras;
            area = Math.pow(cuadrado.getLado(),2);
        }
    }
}
