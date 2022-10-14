package com.company;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto persona en el main.
        Persona persona = new Persona();

        //Utiliza sets para darle valores a las propiedades edad, nombre y telefono
        persona.setNombre("Sergio");
        persona.setEdad(33);
        persona.setTelefono(612345678);

        //Utiliza los gets para mostrarlos por consola
        System.out.println("El nombre es: " + persona.getNombre());
        System.out.println("Su edad es: " + persona.getEdad());
        System.out.println("Su teléfono es: " + persona.getTelefono());

    }
}
class Persona{

    //Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private int telefono;


    //Crear gets y sets de cada propiedad.
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}