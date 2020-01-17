package com.example.buscaminas;

public class Casilla {
private int x;
    private int y;
    private int ancho;
private int contenido;
private boolean destapado=false;

public boolean dentro(int x,int y){
    if(x>= this.getX() && x<=this.getX()+getAncho()&&
            y>= this.getY() && x<=this.getY()+getAncho()){
        return true;
    }else{
        return false;
    }
}
public void fijarXY(int x,int y,int ancho){
    this.setX(x);
    this.setY(y);
    this.setAncho(ancho);
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public boolean isDestapado() {
        return destapado;
    }

    public void setDestapado(boolean destapado) {
        this.destapado = destapado;
    }
}
