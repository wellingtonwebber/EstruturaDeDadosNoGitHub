package Aula06;

import java.lang.Math;

public class Ponto {
    private double coordX;
    private double coordY;

    public Ponto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double distancia(Ponto A){
        double dx = A.getCoordX() - this.coordX;
        double dy = A.getCoordY() - this.coordY;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public void soma(Ponto p) {
        this.coordX += p.getCoordX();
        this.coordY += p.getCoordY();
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
}
