import java.util.Scanner;
public class Main {
public static void main(String [] args) {
    java.util.Scanner entrada = new Scanner(System.in);

    double valorCompra;
    double porcentajeDescuento;
    double valorDescontado;
    double totalPagar;
    int porcentajeMostrar;
    String nombreCliente;

    System.out.println("Ingrese nombre del cliente: ");
    nombreCliente = entrada.nextLine(); 

    System.out.println("Ingrese el valor de la compra: ");
    valorCompra = entrada.nextDouble();

    if (valorCompra >= 300000) {
        porcentajeDescuento = 0.20;
    } else if (valorCompra >= 200000 && valorCompra < 300000) {
        porcentajeDescuento = 0.15;
    } else if (valorCompra >= 100000 && valorCompra < 200000) {
        porcentajeDescuento = 0.10;
    } else {
        porcentajeDescuento = 0.0;
    }

    valorDescontado = valorCompra * porcentajeDescuento;
    totalPagar = valorCompra - valorDescontado;
    porcentajeMostrar = (int) (porcentajeDescuento * 100);

    System.out.println("======RESUMEN DE COMPRA======");
    System.out.println("Cliente: " + nombreCliente);
    System.out.println("Valor de compra: $" + (int)valorCompra);
    System.out.println("Descuento aplicado: " + porcentajeMostrar + "%");
    System.out.println("Valor descontado: $" + (int)valorDescontado);
    System.out.println("Total a pagar: $" + (int)totalPagar);
    
    entrada.close();

}
}