package Interfaces;

public class Quadrado implements FiguraGeo{
    private  int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lados) {
        this.lado = lados;
    }

    public Quadrado (){

    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String nomeFigura() {
        return "Quadrado";
    }

    @Override
    public Integer getArea() {
        int area = 0;

        area = lado * lado;
        return area;
    }

    @Override
    public Integer getPerimetro() {

        int perimetro = 0 ;
        perimetro = lado * 4;

        return perimetro;
    }
}
