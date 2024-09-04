package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.sevices.IContribuyente;

public class Gerente extends Empleado implements IContribuyente {

    private String telefono;
    private String correo;
    private String gestionAsignada;

    public Gerente() {

    }

    public Gerente(String nombre, String identificacion, Departamento departamento, String telefono, String correo,
                   String gestionAsignada) {
        super(nombre, identificacion, departamento);
        this.telefono = telefono;
        this.correo = correo;
        this.gestionAsignada = gestionAsignada;

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGestionAsignada() {
        return gestionAsignada;
    }

    public void setGestionAsignada(String gestionAsignada) {
        this.gestionAsignada = gestionAsignada;
    }

    @Override
    public void contribuir() {
        System.out.println("El gerente " + nombre + " contribuyo al proyecto " + getGestionAsignada());
    }
}
