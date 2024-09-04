package co.edu.uniquindio.gestionEmpleados.model;

import java.util.ArrayList;

public class Departamento {

    private String nombre;
    private String codigo;

    ArrayList<Empleado> empleadosDepartamento;

    public Departamento() {

    }

    public Departamento(String nombre, String codigo , ArrayList<Empleado> empleadosDepartamento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosDepartamento = empleadosDepartamento;
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

    public ArrayList<Empleado> getEmpleadosDepartamento() {
        return empleadosDepartamento;
    }

    public void addEmpleado(Empleado empleado) {
        this.empleadosDepartamento.add(empleado);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", empleados=" + empleadosDepartamento +
                '}';
    }


}
