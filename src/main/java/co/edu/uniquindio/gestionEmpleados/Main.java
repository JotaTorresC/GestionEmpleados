package co.edu.uniquindio.gestionEmpleados;

import co.edu.uniquindio.gestionEmpleados.factory.ModelFactory;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        buscarEmpleadoDepartamento(modelFactory);
        cantidadEmpleadosProyecto(modelFactory);
    }
    private static void buscarEmpleadoDepartamento(ModelFactory modelFactory) {
        modelFactory.buscarEmpleadoDepartamento();
    }
    private static void cantidadEmpleadosProyecto(ModelFactory modelFactory){
        modelFactory.cantidadEmpleadosProyecto();
    }
}