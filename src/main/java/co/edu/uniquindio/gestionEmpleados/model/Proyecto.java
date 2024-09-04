package co.edu.uniquindio.gestionEmpleados.model;

import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private String codigo;

    ArrayList<Empleado> empleadosAsigandos;

    public Proyecto() {

    }

    public Proyecto(String nombre, String codigo, ArrayList<Empleado> empleadosAsigandos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsigandos = empleadosAsigandos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Empleado> getEmpleadosAsigandos() {
        return empleadosAsigandos;
    }

    public void addEmpleadosAsigando(Empleado empleado) {
        this.empleadosAsigandos.add(empleado);
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", empleados=" + empleadosAsigandos +
                '}';
    }
}
