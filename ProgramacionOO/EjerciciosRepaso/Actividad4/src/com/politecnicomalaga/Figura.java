package com.politecnicomalaga;

import com.politecnicomalaga.modelo.Circulo;
import com.politecnicomalaga.modelo.Cuadrado;
import com.politecnicomalaga.modelo.Figuras;
import com.politecnicomalaga.modelo.Triangulo;
import com.politecnicomalaga.negocio.CalculadoraArea;

public class Figura {
    static Figuras[] figura;

    public static void main(String[] args) {
        figura = new Figuras[3];

        Figuras circulo = new Circulo("red");
        ((Circulo)circulo).setRadio(5);

        Figuras triangulo = new Triangulo("green");
        ((Triangulo)triangulo).setAltura(2);
        ((Triangulo)triangulo).setBase(3);

        Figuras cuadrado = new Cuadrado("blue");
        ((Cuadrado)cuadrado).setLado(5);

        figura[0] = circulo;
        figura[1] = triangulo;
        figura[2] = cuadrado;

        CalculadoraArea calculadora = new CalculadoraArea();
        for (int i=0; i<figura.length;i++){
            System.out.println(calculadora.calcular(figura[i]));
        }
    }
}