package co.edu.uniquindio.gestionEmpleados.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GestionEmpleado {

    ArrayList<Empleado> empleadosDepartamento = new ArrayList<>();
    ArrayList<Empleado> empleadoAsignado = new ArrayList<>();

    /*public GestionEmpleado() {
        empleadosDepartamento = new ArrayList<>();
        empleadoAsignado = new ArrayList<>();
    }*/

    public void datosPrueba() {

        Tecnico tecnico1 = new Tecnico();
        tecnico1.setNombre("esteban");
        tecnico1.setIdentificacion("62344562");
        tecnico1.setEspecializacionTecnico("Redes");
        tecnico1.setCorreo("123456667@");
        tecnico1.setTelefono("3042751001");

        Tecnico tecnico2 = new Tecnico();
        tecnico2.setNombre("ruben");
        tecnico2.setIdentificacion("4567890");
        tecnico2.setEspecializacionTecnico("analisis");
        tecnico2.setCorreo("jdfklsjdf@");
        tecnico2.setTelefono("0890475348075");

        Tecnico tecnico3 = new Tecnico();
        tecnico3.setNombre("jason");
        tecnico3.setIdentificacion("0000890");
        tecnico3.setEspecializacionTecnico("analisis");
        tecnico3.setCorreo("gdfjigjdo@");
        tecnico3.setTelefono("457389050934");

        Gerente gerente = new Gerente();
        gerente.setNombre("jose gilberto");
        gerente.setIdentificacion("65865987");
        gerente.setTelefono("32314433");
        gerente.setCorreo("jose@");
        gerente.setGestionAsignada("gestionar los proyectos");

        empleadosDepartamento.add(tecnico2);
        empleadoAsignado.add(tecnico1);
        empleadoAsignado.add(tecnico3);
        empleadoAsignado.add(tecnico1);

        tecnico1.contribuir();
        gerente.contribuir();

    }
    public void buscarEmpleadoDepartamento(String id){
        for(Empleado empleado : empleadosDepartamento){
            if (empleado.getIdentificacion().equals(id)){
                System.out.print("su nombre es: " + empleado.getNombre() + "\n");
            }
        }
    }
    public void cantidadEmpleadosProyecto(){
        System.out.println("la cantidad de empleados en este proyecto es de " + empleadoAsignado.size());
    }
    public List<Empleado> getListaEmpleadoAsignado() {
        return empleadoAsignado;
    }
    public List<Empleado> getListaEmpleadoDepartamento() {
        return empleadosDepartamento;
    }

}
