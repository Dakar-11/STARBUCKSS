import java.util.ArrayList;
import java.util.Scanner;

public class BebidasKengui {
    private static final ArrayList<ArrayList<String>> Bebidas = new ArrayList<>();
    private static final ArrayList<ArrayList<Double>> precios = new ArrayList<>();
    private static final Scanner dakar = new Scanner(System.in);

    static {
        ArrayList<String> Frappuccinos = new ArrayList<>();
        Frappuccinos.add("Matcha Frappuccino");
        Frappuccinos.add("Mocha Blanco Frappuccino");
        Frappuccinos.add("Caramel Ribbon Crunch Frappuccino");
        Frappuccinos.add("Fresa Creme Frappuccino");
        Frappuccinos.add("Black & White Frappuccino");

        ArrayList<String> espressCaliente = new ArrayList<>();
        espressCaliente.add("Mocha Machiano");
        espressCaliente.add("Americano");
        espressCaliente.add("Black & White");
        espressCaliente.add("Flat White");
        espressCaliente.add("Latte");

        ArrayList<String> espressoFrío = new ArrayList<>();
        espressoFrío.add("Latte Frío con Bebida de Avena");
        espressoFrío.add("Cocoa Macchiato Frío");
        espressoFrío.add("Black Cold");
        espressoFrío.add("Americano Helado");
        espressoFrío.add("Latte Helado");

        ArrayList<String> Refreshers = new ArrayList<>();
        Refreshers.add("Strawberry Acai");
        Refreshers.add("Mango Dragon Frozen");
        Refreshers.add("Strawberry Acai Refresher");
        Refreshers.add("Strawberry Acai Lemonade Refresher");
        Refreshers.add("Pink Drink");

        ArrayList<String> Otroscalientes = new ArrayList<>();
        Otroscalientes.add("Chocolate Caliente");
        Otroscalientes.add("Té Chai Teavana");
        Otroscalientes.add("Té Hibiscus Teavana");
        Otroscalientes.add("Té Mint Citrus Teavana");
        Otroscalientes.add("Té Chamomile");

        ArrayList<String> shakenEspresso = new ArrayList<>();
        shakenEspresso.add("Brown Sugar Shaken Espresso Frío con Bebida de Avena");
        shakenEspresso.add("Avellana Shaken Espresso Frío con Bebida de Avena");
        shakenEspresso.add("Chocolate Shaken Espresso Frío con Bebida de Avena");

        Bebidas.add(Frappuccinos);
        Bebidas.add(espressCaliente);
        Bebidas.add(espressoFrío);
        Bebidas.add(Refreshers);
        Bebidas.add(Otroscalientes);
        Bebidas.add(shakenEspresso);

        ArrayList<Double> preciosFrappuccinos = new ArrayList<>();
        preciosFrappuccinos.add(16.00);
        preciosFrappuccinos.add(15.00);
        preciosFrappuccinos.add(16.50);
        preciosFrappuccinos.add(15.00);
        preciosFrappuccinos.add(16.50);

        ArrayList<Double> preciosespressCaliente = new ArrayList<>();
        preciosespressCaliente.add(16.00);
        preciosespressCaliente.add(9.00);
        preciosespressCaliente.add(14.50);
        preciosespressCaliente.add(14.00);
        preciosespressCaliente.add(11.50);

        ArrayList<Double> preciosespressoFrío = new ArrayList<>();
        preciosespressoFrío.add(16.00);
        preciosespressoFrío.add(16.00);
        preciosespressoFrío.add(10.00);
        preciosespressoFrío.add(9.00);
        preciosespressoFrío.add(11.50);

        ArrayList<Double> preciosRefreshers = new ArrayList<>();
        preciosRefreshers.add(16.00);
        preciosRefreshers.add(16.00);
        preciosRefreshers.add(13.50);
        preciosRefreshers.add(14.50);
        preciosRefreshers.add(15.50);

        ArrayList<Double> preciosOtroscalientes = new ArrayList<>();
        preciosOtroscalientes.add(13.00);
        preciosOtroscalientes.add(9.00);
        preciosOtroscalientes.add(9.00);
        preciosOtroscalientes.add(9.00);
        preciosOtroscalientes.add(9.00);

        ArrayList<Double> preciosshakenEspresso = new ArrayList<>();
        preciosshakenEspresso.add(16.50);
        preciosshakenEspresso.add(16.50);
        preciosshakenEspresso.add(16.50);

        precios.add(preciosFrappuccinos);
        precios.add(preciosespressCaliente);
        precios.add(preciosespressoFrío);
        precios.add(preciosRefreshers);
        precios.add(preciosOtroscalientes);
        precios.add(preciosshakenEspresso);
    }

    public static double mostrarBebidas(ArrayList<String> bebidasComprados) {
        double totalBebidas = 0;
        int opcion;
        System.out.println("⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬");
        System.out.println("⏩⏩--BIENVENIDO A LA CATEGORIA DE BEBIDAS--⏪⏪⏪");
        System.out.println("⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫");
        do {
            System.out.println("Contamos con las siguentes opciones:");
            System.out.println("Seleccione una subcategoría de Bebidas:");
            System.out.println("1. Frappuccinos");
            System.out.println("2. Espresso Caliente");
            System.out.println("3. Espresso Frío");
            System.out.println("4. Refreshers");
            System.out.println("5. Otros Calientes");
            System.out.println("6. Shaken Espresso");
            System.out.println("7. Volver al menú principal");
            System.out.print("Ingrese una opción: ");

            while (!dakar.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor ingrese un número entre 1 y 7.");
                dakar.next();
                System.out.print("Ingrese una opción: ");
            }
            opcion = dakar.nextInt();

            switch (opcion) {
                case 1: totalBebidas += seleccionarProducto(Bebidas.get(0), precios.get(0), bebidasComprados); break;
                case 2: totalBebidas += seleccionarProducto(Bebidas.get(1), precios.get(1), bebidasComprados); break;
                case 3: totalBebidas += seleccionarProducto(Bebidas.get(2), precios.get(2), bebidasComprados); break;
                case 4: totalBebidas += seleccionarProducto(Bebidas.get(3), precios.get(3), bebidasComprados); break;
                case 5: totalBebidas += seleccionarProducto(Bebidas.get(4), precios.get(4), bebidasComprados); break;
                case 6: totalBebidas += seleccionarProducto(Bebidas.get(5), precios.get(5), bebidasComprados); break;
                case 7: System.out.println("Volviendo al menú principal..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        return totalBebidas;
    }

    private static double seleccionarProducto(ArrayList<String> productos, ArrayList<Double> precios, ArrayList<String> bebidasComprados) {
        double total = 0;

        System.out.println("Seleccione un producto:");
        System.out.printf("%-3s %-52s %-10s%n", "N°", "Producto", "\t\tPrecio");
        for (int i = 0; i < productos.size(); i++) {
            System.out.printf("%-1d. %-52s  \t\tS/%.2f%n", i + 1, productos.get(i), precios.get(i));
        }


        System.out.print("Ingrese el número del producto que desea comprar: ");
        while (!dakar.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor ingrese un número entre 1 y " + productos.size());
            dakar.next();
        }
        int opcionProducto = dakar.nextInt();

        if (opcionProducto >= 1 && opcionProducto <= productos.size()) {
            String producto = productos.get(opcionProducto - 1);
            double precio = precios.get(opcionProducto - 1);

            System.out.print("¿Cuántos desea comprar? Ingrese la cantidad: ");
            while (!dakar.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor ingrese una cantidad válida.");
                dakar.next();
            }
            int cantidad = dakar.nextInt();

            if (cantidad > 0) {
                double precioTotal = cantidad * precio;
                String detalleCompra = generarDetalleCompra(producto, cantidad, precioTotal);
                bebidasComprados.add(detalleCompra);
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
