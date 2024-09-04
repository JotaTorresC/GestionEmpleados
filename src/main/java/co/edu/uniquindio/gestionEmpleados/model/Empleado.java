package co.edu.uniquindio.gestionEmpleados.model;

public class Empleado {


    String nombre;
    String identificacion;
    Departamento departamento;

    public Empleado() {

    }

    public Empleado(String nombre, String identificacion, Departamento departamento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}

