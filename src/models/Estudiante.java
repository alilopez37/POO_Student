package models;

import java.util.ArrayList;

public class Estudiante {
    private int matricula;
    private String nombre;
    private String apellido;

    public Estudiante(){}
    public Estudiante(int matricula){
        this.matricula = matricula;
    }
    public Estudiante(int matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
