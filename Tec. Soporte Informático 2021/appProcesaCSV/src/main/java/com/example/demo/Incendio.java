package com.example.demo;

public class Incendio {

    private int incendiosAnio;
    private int cantIncendios;
    private int incendiosNegligentes;
    private int incendiosInternacionales;
    private int incendiosNaturales;
    private int incendiosCausaDesconocida;

    Incendio(){
        this.incendiosAnio = 0;
        this.cantIncendios = 0;
        this.incendiosNegligentes = 0;
        this.incendiosInternacionales = 0;
        this.incendiosNaturales = 0;
        this.incendiosCausaDesconocida = 0;
    }

    Incendio(int nuevoIncendiosAnio, int nuevoCantIncendios, int nuevoIncendiosNegligentes, int nuevoIncendiosInternacionales, int nuevoIncendiosNaturales, int nuevoIncendiosCausaDesconocida){
        this.incendiosAnio = nuevoIncendiosAnio;
        this.cantIncendios = nuevoCantIncendios;
        this.incendiosNegligentes = nuevoIncendiosNegligentes;
        this.incendiosInternacionales = nuevoIncendiosInternacionales;
        this.incendiosNaturales = nuevoIncendiosNaturales;
        this.incendiosCausaDesconocida = nuevoIncendiosCausaDesconocida;
    }

    public int getCantIncendios() {
        return cantIncendios;
    }

    public int getIncendiosAnio() {
        return incendiosAnio;
    }

    public int getIncendiosCausaDesconocida() {
        return incendiosCausaDesconocida;
    }

    public int getIncendiosInternacionales() {
        return incendiosInternacionales;
    }

    public int getIncendiosNaturales() {
        return incendiosNaturales;
    }

    public int getIncendiosNegligentes() {
        return incendiosNegligentes;
    }

    public void setCantIncendios(int cantIncendios) {
        this.cantIncendios = cantIncendios;
    }

    public void setIncendiosAnio(int incendiosAnio) {
        this.incendiosAnio = incendiosAnio;
    }

    public void setIncendiosCausaDesconocida(int incendiosCausaDesconocida) {
        this.incendiosCausaDesconocida = incendiosCausaDesconocida;
    }

    public void setIncendiosInternacionales(int incendiosInternacionales) {
        this.incendiosInternacionales = incendiosInternacionales;
    }

    public void setIncendiosNaturales(int incendiosNaturales) {
        this.incendiosNaturales = incendiosNaturales;
    }

    public void setIncendiosNegligentes(int incendiosNegligentes) {
        this.incendiosNegligentes = incendiosNegligentes;
    }

}
