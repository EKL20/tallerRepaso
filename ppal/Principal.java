package ppal;

import modelo.Estudiante;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Estudiante Elkin;
        Scanner ing = new Scanner(System.in);


        System.out.println("Ingrese el nombre:");
        String nombre = ing.next();
        System.out.println("Ingrese el apellido:");
        String apellido = ing.next();
        System.out.println("Ingrese el codigo del estudiante:");
       int codigo= ing.nextInt();

        Elkin = new Estudiante(nombre, apellido,codigo);

    }
}
