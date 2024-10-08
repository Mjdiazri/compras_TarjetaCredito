import com.pinguiapps.shopcontrol.productos.Compra;
import com.pinguiapps.shopcontrol.productos.Cuenta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner infoUsuario = new Scanner(System.in);
        System.out.println("Escriba el limite de su tarjeta: ");
        double limiteTarjeta = infoUsuario.nextDouble();
        Cuenta tarjeta = new Cuenta(limiteTarjeta);

        int salir = 1;
        while (salir != 0) {
            System.out.println("Escriba el nombre del producto");
            String nombreProducto = infoUsuario.next();

            System.out.println("Escriba el valor del producto");
            double valorProducto = Double.valueOf(infoUsuario.next());

            Compra compra = new Compra(nombreProducto, valorProducto);
            boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = infoUsuario.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                salir = 0;
            }
        }

        System.out.println("*************************");
        System.out.println("Compras realizadas:\n");
        Collections.sort(tarjeta.getListaCompras());
        for (Compra compra : tarjeta.getListaCompras()) {
            System.out.println(compra.getNombreProducto() + " - " + compra.getValorProducto());
        }

        System.out.println("*************************");
        System.out.println("\n Saldo de la tarjeta: " + tarjeta.getSaldo());
    }
}
