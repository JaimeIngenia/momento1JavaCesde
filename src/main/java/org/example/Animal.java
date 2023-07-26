package org.example;

public class Animal {

    String nombre;
    String genero;
    double peso;//=true;
    Animal pareja;


    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }

    //CONSTRUCTOR VACIO


    public Animal() {
    }
}
