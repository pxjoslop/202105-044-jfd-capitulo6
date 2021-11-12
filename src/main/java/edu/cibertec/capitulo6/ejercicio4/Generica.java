package edu.cibertec.capitulo6.ejercicio4;

public class Generica<T> {
    
    T propiedad; //Objeto del tipo "T"
    
    Generica(T objetoConstructor)  //Constructor
    {
        propiedad = objetoConstructor;
    }

    public T getPropiedad() {  //método getter
        return propiedad;
    }
    
    void mostrarTipo()
    {
        System.out.println("El tipo pasado a la clase es "+
                propiedad.getClass().getName());
    }
}
