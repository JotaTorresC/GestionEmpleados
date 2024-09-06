package co.edu.uniquindio.gestionEmpleados.model;

import co.edu.uniquindio.gestionEmpleados.sevices.IConsultaSirvices;
import co.edu.uniquindio.gestionEmpleados.sevices.IContribuyente;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GestionEmpleado implements IConsultaSirvices, IContribuyente {

    ArrayList<Empleado> empleadosDepartamento = new ArrayList<>();
    ArrayList<Empleado> empleadoAsignado = new ArrayList<>();

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

    @Override
    public void eliminarDatos() {

    }
    @Override
    public void actualizarDatos() {

    }
    @Override
    public void crearEmpleado() {

    }
    @Override
    public void contribuir() {

    }
}
