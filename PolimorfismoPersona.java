package com.open_bootcamp;

public class PolimorfismoPersona{
    public static void main(String[] args) {
        System.out.println("CLIENTE");
        Cliente cliente1 = new Cliente();{
            cliente1.edad = 19;
            cliente1.telefono = 3534019186L;
            cliente1.name = "Tobías";
            cliente1.credit = 55000;

            System.out.println("Edad: " + cliente1.edad);
            System.out.println("Telefono: " + cliente1.telefono);
            System.out.println("Nombre: " + cliente1.name);
            System.out.println("Credito: " + cliente1.credit);
        }
        System.out.println("TRABAJADOR");
        Trabajador trabajador1 = new Trabajador();{
            trabajador1.edad = 24;
            trabajador1.telefono = 3534019658L;
            trabajador1.name = "Valentina";
            trabajador1.salario = 80000;

            System.out.println("Edad: " + trabajador1.edad);
            System.out.println("Telefono: " + trabajador1.telefono);
            System.out.println("Nombre: " + trabajador1.name);
            System.out.println("Salario: " + trabajador1.salario);
        }

    }
}

class Persona{
    int edad;
    String name;
    long telefono;
}

class Cliente extends Persona{
    long credit;
}

class Trabajador extends Persona{
    int salario;
}
