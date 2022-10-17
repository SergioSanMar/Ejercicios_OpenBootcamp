package com.company;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Sergio");
        cliente.setEdad(33);
        cliente.setTelefono(123456789);
        cliente.setCredito(123114.43);
        System.out.println("El cliente " + cliente.getNombre() + " tiene " + cliente.getEdad() + " años. Su teléfono es "
                + cliente.getTelefono() + ". Su crédito actual es " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Paco");
        trabajador.setEdad(42);
        trabajador.setTelefono(582910244);
        trabajador.setSalario(2000.32);
        System.out.println("El trabajador " + trabajador.getNombre() + " tiene " + trabajador.getEdad() + " años. Su teléfono es "
                + trabajador.getTelefono() + ". Su salario actual es " + trabajador.getSalario());

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

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

class Cliente extends Persona{
    double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }


}

class Trabajador extends Persona{
    double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}