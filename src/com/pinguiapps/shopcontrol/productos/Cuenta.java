package com.pinguiapps.shopcontrol.productos;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private double limiteTarjeta;
    private double saldo;
    private List<Compra> listaCompras;

    public Cuenta(double limiteTarjeta) {
        this.limiteTarjeta = limiteTarjeta;
        this.saldo = limiteTarjeta;
        this.listaCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra compra){
        if(this.saldo >= compra.getValorProducto()){
            this.saldo -= compra.getValorProducto();
            this.listaCompras.add(compra);
            return true;
        }

        return false;
    }


    public double getLimiteTarjeta() {
        return limiteTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }
}
