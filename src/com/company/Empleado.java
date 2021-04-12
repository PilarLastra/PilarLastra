package com.company;

public class Empleado {

    //Atributos
    private long DNI =0;
    private String nombre;
    private String apellido;
    private float salario=0F;

    //Metodos

    ///DNI ------------------------
    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    ///Nombre ---------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ///Apellido --------------------
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    ///Salario ----------------------
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    ///Otros---------------------------

    public void salarioAnual (){
        float salarioAnual = 0F;

        salarioAnual = this.salario * 12;
        System.out.print("El salario anual sera: " +salarioAnual); //afuera
    }

    public void aumentoSalario (int porcentajeDelAumento){
        float aumento = 0F;

        aumento = (porcentajeDelAumento * this.salario) / 100;
        this.salario = this.salario + aumento;
    }

    public void mostrarEmpleado (){

        System.out.print("-------------------------\n");
        System.out.print("Empleado: ");
        System.out.print("\nDNI: " +this.DNI);
        System.out.print("\nNombre " +this.nombre);
        System.out.print("\nApellido: " +this.apellido);
        System.out.print("\nSalario: " +this.salario);
        System.out.print("\n");
    }






}

