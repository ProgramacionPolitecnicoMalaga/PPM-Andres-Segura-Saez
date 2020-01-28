package com.politecnicomalaga.modelo;

public abstract class Figuras {
    private String color;

    public Figuras(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}