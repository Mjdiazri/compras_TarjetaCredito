package com.pinguiapps.shopcontrol.productos;

public class Compra implements Comparable<Compra>{
    private String nombreProducto;
    private double valorProducto;

    public Compra(String nombreProducto, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
    }


    public double getValorProducto() {
        return valorProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    @Override
    public String toString() {
        return "Compra: valorProducto=" + valorProducto +
                ", nombreProducto='" + nombreProducto;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valorProducto).compareTo(Double.valueOf(otraCompra.getValorProducto()));
    }
}
