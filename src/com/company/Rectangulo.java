package com.company;

public class Rectangulo
{
    //ATRIBUTOS
    private float alto = 1.0F;
    private float ancho = 1.0F;

    ///METODOS
    //Set
    public void setAlto(float alto){
        this.alto=alto;
    }

    public void setAncho(float ancho){
        this.ancho=ancho;
    }

    //Get
    public float getAlto(){
        return this.alto;
    }

    public float getAncho(){
        return this.ancho;
    }

    //Otros
    public void perimetro()
    {
        float perimetro = 0F;
        perimetro = 2 * (this.alto + this.ancho);
        System.out.print(perimetro);

    }

    public void area()
    {
        float area = 0F;
        area = this.alto * this.ancho;
        System.out.print(area);

    }




}
