package co.edu.uniquindio.gestionEmpleados;

import co.edu.uniquindio.gestionEmpleados.factory.ModelFactory;
public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        buscarEmpleadoDepartamento(modelFactory);
        cantidadEmpleadosProyecto(modelFactory);
        actulizarDatos(modelFactory);
        eliminarDatos(modelFactory);
        crearEmpleado(modelFactory);
    }
    private static void buscarEmpleadoDepartamento(ModelFactory modelFactory) {
        modelFactory.buscarEmpleadoDepartamento();
    }
    private static void cantidadEmpleadosProyecto(ModelFactory modelFactory){
        modelFactory.cantidadEmpleadosProyecto();
    }
    private static void actulizarDatos(ModelFactory modelFactory){
        modelFactory.actualizarDatos();
    }
    private static void eliminarDatos(ModelFactory modelFactory){
        modelFactory.eliminarDatos();
    }
    private static void crearEmpleado(ModelFactory modelFactory){
        modelFactory.crearEmpleado();
    }
}