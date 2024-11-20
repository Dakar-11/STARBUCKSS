import java.util.ArrayList;
import java.util.Scanner;

public class PacksYBoxesJose {
    private static final ArrayList<ArrayList<String>> packsyboxes = new ArrayList<>();
    private static final ArrayList<ArrayList<Double>> precios = new ArrayList<>();

    private static final Scanner jose = new Scanner(System.in);

    static {
        ArrayList<String> CoffeeforShare = new ArrayList<>();

        CoffeeforShare.add("Coffe traveler");
        CoffeeforShare.add("Pack coffe Mixto");
        CoffeeforShare.add("Pack coffe sandwich");
        CoffeeforShare.add("Pack coffe galleta");

        ArrayList<String> Desayunos = new ArrayList<>();
        Desayunos.add("Duo desayuno");
        Desayunos.add("desayuno para dos");

        ArrayList<String> Antojosdelatarde = new ArrayList<>();
        Antojosdelatarde.add("Muffins 4 share");
        Antojosdelatarde.add("Momentos Dulces");
        Antojosdelatarde.add("Sweet & Share");

        packsyboxes.add(CoffeeforShare);
        packsyboxes.add(Desayunos);
        packsyboxes.add(Antojosdelatarde);


        ArrayList<Double> precioscoffe = new ArrayList<>();


        precioscoffe.add(60.00);
        precioscoffe.add(120.00);
        precioscoffe.add(135.00);
        precioscoffe.add(95.00);


        ArrayList<Double> preciosdesayunos = new ArrayList<>();

        preciosdesayunos.add(11.00);
        preciosdesayunos.add(30.00);


        ArrayList<Double> preciosantojos = new ArrayList<>();

        preciosantojos.add(32.00);
        preciosantojos.add(14.00);
        preciosantojos.add(16.00);


        precios.add(precioscoffe);
        precios.add(preciosdesayunos);
        precios.add(preciosantojos);
    }

    public static double mostrarpacks(ArrayList<String> merchComprados) {
        double totalpacks = 0;
        int opcion;

        System.out.println("Binebenido a la opcion packs y Boxes");


        do {
            System.out.println(":----------PACKS Y BOXES---------:");

            System.out.println("1:Coffee for Share");
            System.out.println("2:Desayunos");
            System.out.println("3:Antojos de la tarde");
            System.out.println("4: Volver al menu principal");
            opcion = jose.nextInt();

            switch (opcion) {
                case 1 -> totalpacks += seleccionarProducto(packsyboxes.get(0), precios.get(0), merchComprados);
                case 2 -> totalpacks += seleccionarProducto(packsyboxes.get(1), precios.get(1), merchComprados);
                case 3 -> totalpacks += seleccionarProducto(packsyboxes.get(2), precios.get(2), merchComprados);
                case 4 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        return totalpacks;
    }

    private static double seleccionarProducto(ArrayList<String> productos, ArrayList<Double> precios, ArrayList<String> packsComprados) {
        double total = 0;

        System.out.println("Seleccione un producto:");
        System.out.printf("%-3s. %-45s %-10s%n", "N°", "Producto", "Precio");
        for (int i = 0; i < productos.size(); i++) {
            System.out.printf("%d. %-45s S/ %.2f%n", i + 1, productos.get(i), precios.get(i));
        }

        System.out.print("Ingrese el número del producto que desea comprar: ");
        while (!jose.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor ingrese un número válido.");
            jose.next();
        }
        int opcionProducto = jose.nextInt();

        if (opcionProducto >= 1 && opcionProducto <= productos.size()) {
            String producto = productos.get(opcionProducto - 1);
            double precio = precios.get(opcionProducto - 1);

            System.out.print("¿Cuántos desea comprar? Ingrese la cantidad: ");
            while (!jose.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor ingrese una cantidad válida.");
                jose.next();
            }
            int cantidad = jose.nextInt();

            if (cantidad > 0) {
                double precioTotal = cantidad * precio;
                String detalleCompra = generarDetalleCompra(producto, cantidad, precioTotal);
                packsComprados.add(detalleCompra);
                total += precioTotal;
                System.out.println("Producto agregado: " + detalleCompra);
                System.out.println(".............................................................");
            } else {
                System.out.println("La cantidad debe ser mayor a cero.");
            }
        } else {
            System.out.println("Producto no válido.");
        }

        return total;
    }

    private static String generarDetalleCompra(String producto, int cantidad, double precioTotal) {
        return String.format("%s | %d unidades | Total: S/ %.2f", producto, cantidad, precioTotal);
    }
}
