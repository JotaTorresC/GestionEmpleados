package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.sevices.IContribuyente;

public class Tecnico extends Empleado implements IContribuyente {

    private String telefono;
    private String correo;
    private String especializacionTecnico;

    public Tecnico() {

    }

    public Tecnico(String nombre, String identificacion, Departamento departamento, String telefono, String correo, String especializacionTecnico) {
        super(nombre, identificacion, departamento);
        this.telefono = telefono;
        this.correo = correo;
        this.especializacionTecnico = especializacionTecnico;
        this.departamento = departamento;
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

    public String getEspecializacionTecnico() {
        return especializacionTecnico;
    }

    public void setEspecializacionTecnico(String especializacionTecnico) {
        this.especializacionTecnico = especializacionTecnico;
    }

    @Override
    public void contribuir() {
        System.out.println("El técnico " + nombre + " contribuye con su especialidad en " + especializacionTecnico + " a los proyecto. ");
    }
}
