import java.util.Scanner;

public class Interfaz {
    int venta_cliente;
    int compra_cliente;
    public void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una opción: \n" +
                "1. Introducir un nuevo vehículo. \n" +
                "2. Introducir un nuevo cliente. \n" +
                "3. Realizar una venta a un cliente. \n" +
                "4. Realizar una compra a un cliente. \n" +
                "5. Obtener el saldo total de un cliente que ha realizado ventas/compras en el concesionario.");
        byte opcion = sc.nextByte();
        if (opcion == 1) {
            System.out.println("Introduce el modelo: ");
            String modelo = sc.next();
            System.out.println("Introduce marca: ");
            String marca = sc.next();
            System.out.println("Introduce color: ");
            String color = sc.next();
            System.out.println("Introduce año de fabricacion: ");
            int anho_fabricacion = sc.nextInt();
            System.out.println("Introduce combustion: ");
            String combustion = sc.next();
            System.out.println("Introduce estado: ");
            String estado = sc.next();
            System.out.println("Introduce precio: ");
            double precio = sc.nextDouble();
            Vehiculos vehiculo = new Vehiculos(modelo, marca, color, anho_fabricacion, combustion, estado, precio);
            System.out.println("El vehiculo se ha añadido: " + vehiculo.toString());
        } else if (opcion == 2){
            System.out.println("Introduce el nombre: ");
            String nombre = sc.next();
            System.out.println("Introduce los apellidos: ");
            String apellidos = sc.next();
            System.out.println("Introduce niv: ");
            String niv = sc.next();
            System.out.println("Introduce cuenta bancaria: ");
            String cuenta_bancaria = sc.next();
            Clientes cliente = new Clientes(nombre, apellidos, niv, cuenta_bancaria);
            System.out.println("El cliente se ha añadido: " + cliente.toString());
        } else if (opcion == 3){
            System.out.println("Introduce la venta: ");
            int venta_cliente = Integer.parseInt(sc.next());
            Venta venta = new Venta(venta_cliente);
            System.out.println("La venta se ha añadido: " + venta.toString());
        } else if (opcion == 4){
            System.out.println("Introduzca su compra: ");
            int compra_cliente = Integer.parseInt(sc.next());
            Compra compra = new Compra(compra_cliente);
            System.out.println("La compra se ha añadido: " + compra.toString());
        } else if (opcion == 5){
            int suma_total = venta_cliente + compra_cliente;
            System.out.println("La suma total de " + venta_cliente + " + " + compra_cliente + " es: " + suma_total);
        }
    }
}