package com.company;

public class Main {

    public static void main(String[] args) {

	// Ejercicio 1
        Rectangulo rectangulito = new Rectangulo();
        Rectangulo gulito = new Rectangulo();

        System.out.print("\nAlto: ");
        System.out.print(rectangulito.getAlto());

        System.out.print("\nAncho: ");
        System.out.print(rectangulito.getAncho());

        System.out.print("\nPerimetro: ");
        rectangulito.perimetro();

        System.out.print("\nArea: ");
        rectangulito.area();

        System.out.print("\n--------------------");

        rectangulito.setAlto(3.6F);
        rectangulito.setAncho(5.1F);

        System.out.print("\nNuevo Perimetro: ");
        rectangulito.perimetro();

        System.out.print("\nNueva Area: ");
        rectangulito.area();

        System.out.print("\n--------------------");
        System.out.print("\nNuevo Rectangulo:");

        System.out.print("\nAlto: ");
        System.out.print(gulito.getAlto());

        System.out.print("\nAncho: ");
        System.out.print(gulito.getAncho());

        // Ejercicio 2

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        ///Empleado 1
        empleado1.setDNI(23456345);
        empleado1.setNombre("Carlos");
        empleado1.setApellido("Gutierrez");
        empleado1.setSalario(25000F);
        ///Empleado 2
        empleado2.setDNI(34234123);
        empleado2.setNombre("Ana");
        empleado2.setApellido("Sanchez");
        empleado2.setSalario(27500F);

        empleado1.mostrarEmpleado();
        empleado2.mostrarEmpleado();

        System.out.print("\n");

        empleado1.aumentoSalario(15);
        empleado1.mostrarEmpleado();
        System.out.print("\n");
        empleado1.salarioAnual();
        System.out.print("\n");

        System.out.print("Holandaaaaaaaaa");

        System.out.print("RAma ramita");







    }
}
