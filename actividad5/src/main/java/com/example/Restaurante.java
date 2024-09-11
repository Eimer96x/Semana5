package com.example;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private String tipoCocina;
    private String direccion;
    private int capacidad;
    private String horarioApertura;
    private String horarioCierre;
    private int mesasDisponibles;
    private List<String> menu;

    public Restaurante() {
        nombre = "No definido";
        tipoCocina = "No definido";
        direccion = "No definido";
        capacidad = 50;
        horarioApertura = "No definido";
        horarioCierre = "No definido";
        mesasDisponibles = 30;
        List<String> menu = new ArrayList<String>();
    }

    public Restaurante(String nombre, String tipoCocina, String direccion, int capacidad, String horarioApertura,
            String horarioCierre, int mesasDisponibles, List<String> menu) {
        this.nombre = nombre;
        this.tipoCocina = tipoCocina;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.mesasDisponibles = mesasDisponibles;
        this.menu = menu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina(){
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina){
        this.tipoCocina = tipoCocina;
     }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public int getMesasDisponibles() {
        return mesasDisponibles;
    }

    public void setMesasDisponibles(int mesasDisponibles) {
        this.mesasDisponibles = mesasDisponibles;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public void mostrarMenu (){
        for (String plato:menu){
            System.out.println(plato);
        }
    }

    public void reservarMesa(int numeroPersonas) {
        if (numeroPersonas <= mesasDisponibles) {
            mesasDisponibles -= numeroPersonas;
            System.out.println("¡Mesa reservada con éxito! Quedan " + mesasDisponibles + " mesas disponibles.");
        } else {
            System.out.println("Lo siento, no hay mesas disponibles para " + numeroPersonas + " personas.");
        }
    }

    private double calcularPrecioPlato(String nombrePlato) {
        switch (nombrePlato) {
            case "Helado":
                return 10.0;
            case "Waffle":
                return 15.0;
            case "Perro":
                return 13.0;
            default:
                return 0.0;
        }
    }

    public double calcularFactura(List<String> platosPedido) {
        double totalFactura = 0.0;
        for (String plato : platosPedido) {
            totalFactura += calcularPrecioPlato(plato);
        }
        System.out.println("Factura del Restaurante " + nombre + ":");
        for (String plato : platosPedido) {
            System.out.println("- " + plato + " - $" + calcularPrecioPlato(plato));
        }
        System.out.println("Total: $" + totalFactura);
        return totalFactura;
    }
}