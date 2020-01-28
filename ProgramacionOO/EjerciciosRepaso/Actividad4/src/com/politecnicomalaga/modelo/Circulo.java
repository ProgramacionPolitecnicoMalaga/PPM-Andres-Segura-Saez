package com.politecnicomalaga.modelo;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(String color) {
        super(color);
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}
