package models;

import java.util.ArrayList;
import java.util.LinkedList;

public class Asignatura {
    private String id;
    private String nombre;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private LinkedList<Estudiante> st = new LinkedList<>();
    public Asignatura(){}
    public Asignatura(String id) {
        this.id = id;
    }

    public boolean addEstudiante (Estudiante estudiante){
        boolean status = estudiantes.add(estudiante);
        return status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }
}
