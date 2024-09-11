package com.example;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<String> menuInicial = new ArrayList<>();
        menuInicial.add("Helado");
        menuInicial.add("Waffle");
        menuInicial.add("Perro");
        Restaurante miRestaurante = new Restaurante(null, null, null, 30, null, null, 0, menuInicial); 
        miRestaurante.mostrarMenu();
        miRestaurante.reservarMesa(3);
        List<String> pedido = new ArrayList<>();
        pedido.add("Helado");
        pedido.add("Perro");
        miRestaurante.calcularFactura(pedido);
    }
}