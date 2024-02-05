import models.Asignatura;
import models.Estudiante;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static  Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        Asignatura poo = new Asignatura();
        System.out.print("ID: ");
        poo.setId(keyboard.nextLine());
        System.out.print("Nombre: ");
        poo.setNombre(keyboard.nextLine());
        Estudiante student;
        int opcion;
        System.out.println("Add student");
        do{
            student = new Estudiante();
            System.out.print("Matrícula: ");
            student.setMatricula(keyboard.nextInt());
            keyboard.nextLine();
            System.out.print("Nombre: ");
            student.setNombre(keyboard.nextLine());
            System.out.print("Apellido: ");
            student.setApellido(keyboard.nextLine());
            if (poo.addEstudiante(student))
                System.out.println("Registro exitoso");
            else
                System.out.println("Error en el registro");
            System.out.println("Opciones\n1. Add student\n2. Exit");
            opcion = keyboard.nextInt();
        }while(opcion == 1);

        System.out.println("Lista de estudiantes");
        for(Estudiante item: poo.getEstudiantes())
            System.out.println(item.getNombre());
    }
}