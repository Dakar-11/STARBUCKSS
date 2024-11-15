import java.io.FileWriter;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Categorias {
    Scanner dakar = new Scanner(System.in);
    ArrayList<String> frapucinos = new ArrayList<>();
    ArrayList<String> espresocaliente = new ArrayList<>();
    ArrayList<String> espresofrio = new ArrayList<>();
    ArrayList<String> refresh = new ArrayList<>();
    double[] preciofrapucinos= {16.00,15.00,16.50,15.00,16.50};
    double[] precioespresocaliente={16.00,9.00,14.50,14.00,11.50};
    double[] precioespresofrio={16.00,16.00,10.00,9.00,11.50};
    double[] preciorefresh={16.00,16.00,13.50,14.50,15.50};
    ArrayList<Integer> carritofrapucinos = new ArrayList<>();
    ArrayList<Integer> carritoespresocaliente = new ArrayList<>();
    ArrayList<Integer> carritoespresofrio = new ArrayList<>();
    ArrayList<Integer> carritorefresh = new ArrayList<>();
    ArrayList<String> Merch = new ArrayList<>();
    ArrayList<String> Cafe = new ArrayList<>();
    double[] preciosMerch = {160.00, 160.00, 80.00, 25.00, 25.00};
    double[] preciosCafe = {37.00, 37.00, 37.00, 37.00, 37.00};
    ArrayList<Double> subtotal_extra = new ArrayList<>();
    double igv, subtotal, totalpagar;
    ArrayList<Integer> carritomerch = new ArrayList<>();
    ArrayList<Integer> carritocafe = new ArrayList<>();
    int opcion, cantidad,pago;
    public int cantidadTotalMenus = 0;
    double[] precioPastries = {9.5, 6, 8, 9, 9, 5.5, 9, 5.5, 9, 9};
    double[] precioPostres = {15, 6.5, 15, 8.5, 12.5};
    double[] precioSandwiches = {15, 5.5, 15.5, 15.5, 15.5, 13, 14, 15, 9.5, 9.5, 12, 13.5, 13.5, 15};
    ArrayList<String> Pastries = new ArrayList<>();
    ArrayList<String> Postres = new ArrayList<>();
    ArrayList<String> Sandwiches = new ArrayList<>();
    ArrayList<Integer> carritoPastries = new ArrayList<>();
    ArrayList<Integer> carritoPostres = new ArrayList<>();
    ArrayList<Integer> carritoSandwiches = new ArrayList<>();

    public void categorias() {
        int opcion;
        do {
            System.out.println("\n---- BIENVENIDO AL MENU PRINCIPAL ----");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Bebidas");
            System.out.println("2. Alimentos");
            System.out.println("3. Merch y Café en Grano");
            System.out.println("4. Packs y Boxes");
            System.out.println("5. Salir");
            opcion = dakar.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionó Bebidas.");
                    this.menudeBebidas();

                    break;
                case 2:
                    System.out.println("Seleccionó Alimentos.");
                    this.Menudealimentos();

                    break;
                case 3:
                    System.out.println("Seleccionó Merch y Café en Grano");
                    this.MechyCaféenGrano();
                    break;
                case 4:
                    System.out.println("Seleccionó Packs y Boxes");
                    ProductosStar jose= new ProductosStar();
                    jose.MenuProductos();

                case 5:
                    System.err.println("Saliendo del programa. ¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
        while (opcion != 5);
    }
    public void menudeBebidas(){
        System.out.println("Bienvenido a la sección de bebidas");
        System.out.println("""
                1.- Frappuccinos
                2.- Espresso caliente
                3.- Espresso frío
                4.- Refreshers
                7.- Regresar al menú
                """);
        opcion = dakar.nextInt();
        dakar.nextLine();
        switch (opcion) {
            case 1:
                this.frapucino();

                break;
            case 2:
                this.espresocaliente();

                break;
            case 3:

                break;
            case 4:

                break;
        }
    }
    public void espresofrio(){
        espresofrio.add("Latte Frío con Bebida de Avena");
        espresofrio.add("Cocoa Macchiato Frío");
        espresofrio.add("Black Cold");
        espresofrio.add("Americano Helado");
        espresofrio.add("Latte Helado");
        for (int i = 0; i < espresofrio.size(); i++) {
            carritoespresofrio.add(0);
            subtotal_extra.add(0.0);
        }
        System.out.println("============================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");

        for (int i = 0; i < espresofrio.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, espresofrio.get(i), precioespresofrio[i]));
        }
        System.out.println("Ingrese el número de la opción que desea comprar:");
        opcion = dakar.nextInt();
        dakar.nextLine();

        if (opcion >= 1 && opcion <= espresofrio.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = dakar.nextInt();
            dakar.nextLine();
            carritoespresofrio.set(opcion - 1, carritoespresofrio.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carritoespresofrio.get(opcion - 1) + " productos de " + espresofrio.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI / 2 NO / 3 Menú Principal");

            opcion = dakar.nextInt();
            dakar.nextLine();

            if (opcion == 1) {
                this.CafeenGrano();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {
                this.MechyCaféenGrano();
            } else {
                System.out.println("Opción no válida");
                this.CafeenGrano();
            }
        } else {
            System.out.println("Opción no válida");
            this.CafeenGrano();
        }
    }
    public void frapucino(){
        frapucinos.add("Strawberry Acai");
        frapucinos.add(" Mango Dragon Frozen");
        frapucinos.add("Strawberry Acai Refresher");
        frapucinos.add("Strawberry Acai Lemonade Refresher");
        frapucinos.add("Pink Drink");
        for (int i = 0; i < frapucinos.size(); i++) {
            carritofrapucinos.add(0);
            subtotal_extra.add(0.0);
        }
        System.out.println("===================================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");
        for (int i = 0; i < frapucinos.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, frapucinos.get(i), preciofrapucinos[i]));
        }
        opcion = dakar.nextInt();
        dakar.nextLine();
        if (opcion >= 1 && opcion<=frapucinos.size()) {
            System.out.println("¿Cuantos comprara? Ingrese la cantidad");
            cantidad=dakar.nextInt();
            dakar.nextLine();
            carritofrapucinos.set(opcion - 1, carritofrapucinos.get(opcion-1) + cantidad);
            System.out.println("Ud ha pedido " + carritofrapucinos.get(opcion - 1) + " productos de " + frapucinos.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = dakar.nextInt();
            dakar.nextLine();
            if (opcion==1) {
                System.out.println("Volviendo a la opción de compra");
                this.frapucino();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {
                this.menudeBebidas();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.menudeBebidas();
        }


    }
    public void espresocaliente(){
        espresocaliente.add("Mocha Machiano");
        espresocaliente.add("Americano");
        espresocaliente.add("Black & White");
        espresocaliente.add("Flat White");
        espresocaliente.add("Latte");
        for (int i = 0; i < espresocaliente.size(); i++) {
            carritoespresocaliente.add(0);
            subtotal_extra.add(0.0);
        }
        System.out.println("===================================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");
        for (int i = 0; i < espresocaliente.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, espresocaliente.get(i), precioespresocaliente[i]));
        }
        opcion = dakar.nextInt();
        dakar.nextLine();
        if (opcion >= 1 && opcion<=espresocaliente.size()) {
            System.out.println("¿Cuantos comprara? Ingrese la cantidad");
            cantidad=dakar.nextInt();
            dakar.nextLine();
            carritoespresocaliente.set(opcion - 1, carritoespresocaliente.get(opcion-1) + cantidad);
            System.out.println("Ud ha pedido " + carritoespresocaliente.get(opcion - 1) + " productos de " + espresocaliente.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = dakar.nextInt();
            dakar.nextLine();
            if (opcion==1) {
                System.out.println("Volviendo a la opción de compra");
                this.espresocaliente();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {

                this.menudeBebidas();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.espresocaliente();
        }


    }
    public void Menudealimentos() {
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐BIENVENIDO A LA SECCIÓN DE ALIMENTOS⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println(" ");
        System.out.println("SELECCIONE UNA CATEGORIA DE PRODUCTOS:");
        System.out.println("1. Pastries🥙 \n2. Postres🧁 \n3. Sandwiches \n4. Regresar🔙");
        opcion = dakar.nextInt();
        dakar.nextLine();
        switch (opcion) {
            case 1:
                this.Pastries();

                break;
            case 2:
                this.Postres();

                break;
            case 3:
                this.Sandwiches();

                break;
            default:
            case 4:
                System.out.println("Opción no válida");
                this.categorias();
                break;
        }
    }
    public void Pastries(){
        Pastries.add("Muffin Red Velvet");
        Pastries.add("Galleta Red Velvet");
        Pastries.add("Banana Bread");
        Pastries.add("Muffin de Naranja");
        Pastries.add("Keke de Zanahoria");
        Pastries.add("Galleta Cranberry");
        Pastries.add("Keke de Limón");
        Pastries.add("Galleta de Chocochips");
        Pastries.add("Muffin de Berries");
        Pastries.add("Egg Bites de Jamón y Queso");
        for (int i = 0; i < Pastries.size(); i++) {
            carritoPastries.add(0);
            subtotal_extra.add(0.0);
        }
        System.out.println("===================================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");
        for (int i = 0; i < Pastries.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, Pastries.get(i), precioPastries[i]));
        }
        opcion = dakar.nextInt();
        dakar.nextLine();
        if (opcion >= 1 && opcion<=Pastries.size()) {
            System.out.println("¿Cuantos comprara? Ingrese la cantidad");
            cantidad=dakar.nextInt();
            dakar.nextLine();
            carritoPastries.set(opcion - 1, carritoPastries.get(opcion-1) + cantidad);
            System.out.println("Ud ha pedido " + carritoPastries.get(opcion - 1) + " productos de " + Pastries.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = dakar.nextInt();
            dakar.nextLine();
            if (opcion==1) {
                System.out.println("Volviendo a la opción de compra");
                this.Pastries();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {
                this.Menudealimentos();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.Menudealimentos();
        }
    }
    public void Postres(){
        Postres.add("Crocante de Manzana Vegetal");
        Postres.add("Cake Pop Vainilla");
        Postres.add("Cheesecake de Chocolate");
        Postres.add("Brownie de Cookies & Cream");
        Postres.add("Torta de Chocolate");
        for (int i = 0; i < Postres.size(); i++) {
            carritoPostres.add(0);
        }
        System.out.println("===================================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");
        for (int i = 0; i < Postres.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, Postres.get(i), precioPostres[i]));
        }
        opcion = dakar.nextInt();
        dakar.nextLine();
        if (opcion >= 1 && opcion<=Postres.size()) {
            System.out.println("¿Cuantos comprara? Ingrese la cantidad");
            cantidad=dakar.nextInt();
            dakar.nextLine();
            carritoPostres.set(opcion - 1, carritoPostres.get(opcion-1) + cantidad);
            System.out.println("Ud ha pedido " + carritoPostres.get(opcion - 1) + " productos de " + Postres.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = dakar.nextInt();
            dakar.nextLine();
            if (opcion==1) {
                System.out.println("Volviendo a la opción de compra");
                this.Postres();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {
                this.Menudealimentos();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.Menudealimentos();
        }
    }
    public void Sandwiches(){
        Sandwiches.add("Sandwich de pavo");
        Sandwiches.add("Croissant de Mantequilla");
        Sandwiches.add("Croissant de Jamón Serrano y Queso");
        Sandwiches.add("Croissant Jamón del País y Queso");
        Sandwiches.add("Croissant Jamón Inglés y Queso");
        Sandwiches.add("Sandwich Pavita & queso");
        Sandwiches.add("Sandwich Pavita, queso & espinaca");
        Sandwiches.add("Sandwich Brioche campesino");
        Sandwiches.add("Empanada de lomo");
        Sandwiches.add("Empanada de ají de pollo");
        Sandwiches.add("Sandwich Panino vesubio");
        Sandwiches.add("Sandwich Chicken panino");
        Sandwiches.add("Sandwich Chicken ciabatta");
        Sandwiches.add("Sandwich triple");
        for (int i = 0; i < Sandwiches.size(); i++) {
            carritoSandwiches.add(0);
        }
        System.out.println("===================================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");
        for (int i = 0; i < Sandwiches.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, Sandwiches.get(i),precioSandwiches[i]));
        }
        opcion = dakar.nextInt();
        dakar.nextLine();
        if (opcion >= 1 && opcion<=Sandwiches.size()) {
            System.out.println("¿Cuantos comprara? Ingrese la cantidad");
            cantidad=dakar.nextInt();
            dakar.nextLine();
            carritoSandwiches.set(opcion - 1, carritoSandwiches.get(opcion-1) + cantidad);
            System.out.println("Ud ha pedido " + carritoSandwiches.get(opcion - 1) + " productos de " + Sandwiches.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI/ 2 NO / 3 Menu Principal");
            opcion = dakar.nextInt();
            dakar.nextLine();
            if (opcion==1) {
                System.out.println("Volviendo a la opción de compra");
                this.Postres();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {
                this.Menudealimentos();
            } else {
                System.out.println("Opcion no válida");
            }
        } else {
            System.out.println("Opcion no válida");
            this.Menudealimentos();
        }
    }

    public void MechyCaféenGrano() {
        System.out.println("⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬");
        System.out.println("⏩⏩--BIENVENIDO A LA CATEGORIA DE MERCH Y CAFE EN GRANO--⏪⏪");
        System.out.println("⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫");
        System.out.println("==============================================================");
        System.out.println("Seleccione cual de estas opciones va a querer");
        System.out.println("➡opcion 1: Merch");
        System.out.println("➡opcion 2: Cafe en Grano");
        System.out.println("➡opcion 3: regresar a menu de categorias");
        System.out.println("===============================================================");
        opcion = dakar.nextInt();

        switch (opcion) {
            case 1:
                this.Merch();
                break;
            case 2:
                this.CafeenGrano();
                break;
            case 3:
                this.categorias();
                break;
            default:
                System.out.println("Opción no válida, por favor elija de nuevo.");
                this.MechyCaféenGrano();
                break;
        }
    }

    public void Merch() {
        Merch.add("Prensa Francesa ");
        Merch.add("Prensa Cold Brew ");
        Merch.add("Prensa Pour Over ");
        Merch.add("Reusable Aniversario 20 años ");
        Merch.add("Vaso Blanco Reusable Sirena Blanca-16oz ");

        for (int i = 0; i < Merch.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, Merch.get(i), preciosMerch[i]));
        }
        System.out.println("===================================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");
        for (int i = 0; i < Merch.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Merch.get(i));
        }
        System.out.println("Ingrese el número de la opción que desea comprar:");
        opcion = dakar.nextInt();
        dakar.nextLine();

        if (opcion >= 1 && opcion <= Merch.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = dakar.nextInt();
            dakar.nextLine();
            carritomerch.set(opcion - 1, carritomerch.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carritomerch.get(opcion - 1) + " productos de " + Merch.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI / 2 NO / 3 Menú Principal");

            opcion = dakar.nextInt();
            dakar.nextLine();

            if (opcion == 1) {
                this.Merch();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {
                this.categorias();
            } else {
                System.out.println("Opción no válida");
                this.Merch();
            }
        } else {
            System.out.println("Opción no válida");
            this.Merch();
        }
    }

    public void CafeenGrano() {
        Cafe.add("Perú S/37.00");
        Cafe.add("Expresso Roast S/37.00");
        Cafe.add("Verona S/37.00");
        Cafe.add("Anniversary Blend 250 gr. S/37.00");
        Cafe.add("Sumatra S/37.00");
        for (int i = 0; i < Cafe.size(); i++) {
            carritocafe.add(0);
            subtotal_extra.add(0.0);
        }
        System.out.println("============================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");

        for (int i = 0; i < Cafe.size(); i++) {
            System.out.println(String.format("%d.\t%-35s S/ %.2f", i + 1, Cafe.get(i), preciosCafe[i]));
        }
        System.out.println("Ingrese el número de la opción que desea comprar:");
        opcion = dakar.nextInt();
        dakar.nextLine();

        if (opcion >= 1 && opcion <= Cafe.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = dakar.nextInt();
            dakar.nextLine();
            carritocafe.set(opcion - 1, carritocafe.get(opcion - 1) + cantidad);
            System.out.println("Ud ha pedido " + carritocafe.get(opcion - 1) + " productos de " + Cafe.get(opcion - 1));
            System.out.println("¿Desea elegir otro producto más?  1 SI / 2 NO / 3 Menú Principal");

            opcion = dakar.nextInt();
            dakar.nextLine();

            if (opcion == 1) {
                this.CafeenGrano();
            } else if (opcion == 2) {
                this.Pago();
            } else if (opcion == 3) {
                this.MechyCaféenGrano();
            } else {
                System.out.println("Opción no válida");
                this.CafeenGrano();
            }
        } else {
            System.out.println("Opción no válida");
            this.CafeenGrano();
        }
    }

    public void Pago() {

        System.out.println("----Informe de la compra---------");
        System.out.println("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL");
        for (int i = 0; i < espresofrio.size(); i++) {
            int cantidad = carritoespresofrio.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precioespresofrio[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, espresofrio.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;

            }
        }
        for (int i = 0; i < espresocaliente.size(); i++) {
            int cantidad = carritoespresocaliente.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precioespresocaliente[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, espresocaliente.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }

        for (int i = 0; i < frapucinos.size(); i++) {
            int cantidad = carritofrapucinos.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * preciofrapucinos[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, frapucinos.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Merch.size(); i++) {
            int cantidad = carritomerch.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * preciosMerch[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Merch.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Cafe.size(); i++) {
            int cantidad = carritocafe.get(i);
            if (cantidad > 0) {
                double totalExtra = cantidad * preciosCafe[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Cafe.get(i), totalExtra);
                cantidadTotalMenus += totalExtra;
            }
        }
        for (int i = 0; i < Pastries.size(); i++) {
            int cantidad = carritoPastries.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precioPastries[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Pastries.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Postres.size(); i++) {
            int cantidad = carritoPostres.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precioPostres[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Postres.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        for (int i = 0; i < Sandwiches.size(); i++) {
            int cantidad = carritoSandwiches.get(i);
            if (cantidad > 0) {
                double totalMenu = cantidad * precioSandwiches[i];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Sandwiches.get(i), totalMenu);
                cantidadTotalMenus += totalMenu;
            }
        }
        totalpagar += cantidadTotalMenus * cantidad;
        subtotal += totalpagar / 1.18;
        igv += subtotal * 0.18;
        System.out.printf("Usted tiene en su canasta un valor de: S/ %.2f\n", totalpagar);
        System.out.println("¿DESEA COMPRAR ALGO MÁS?");
        System.out.println("1. SÍ \n2. NO");
        opcion = dakar.nextInt();
        if (opcion == 1) {
            this.Menudealimentos();
        } else if (opcion == 2) {
            System.out.println("Seleccione su método de pago: \n1. Efectivo \n2. Tarjeta");
            opcion = dakar.nextInt();
            dakar.nextLine();
            switch (opcion) {
                case 1:
                    System.out.printf("\u001B[31mRecuerde usted tiene en su canasta un valor de: S/ \u001B[0m%.2f\n", totalpagar);
                    pago = 0;
                    while (pago < totalpagar) {
                        System.out.print("Ingrese el monto de pago: ");
                        double pagoActual = dakar.nextDouble();
                        pago += pagoActual;
                        if (pago < totalpagar) {
                            double faltante = totalpagar - pago;
                            System.out.printf("Monto insuficiente. Faltan S/ %.2f\n", Math.round(faltante * 100.0) / 100.0);
                        }
                    }
                    double vuelto = pago - totalpagar;
                    System.out.println("Pago completo.");
                    if (vuelto > 0) {
                        System.out.printf("Su vuelto es: S/ %.2f\n", Math.round(vuelto * 100.0) / 100.0);
                    }
                    Pago();
                    this.ImprimirBoleta();
                    System.exit(0);
                    break;
                case 2:
                    String tarjeta;
                    boolean tarjetaValida = false;
                    while (!tarjetaValida) {
                        System.out.print("Ingrese el número de tarjeta (16 dígitos): ");
                        tarjeta = dakar.next();
                        if (tarjeta.length() == 16 && tarjeta.matches("[0-9]+")) {
                            tarjetaValida = true;
                            System.out.println("Número de tarjeta válido.");
                            boolean fechaValida = false;
                            while (!fechaValida) {
                                System.out.print("Ingrese el mes de vencimiento (MM): ");
                                int mesVencimiento = dakar.nextInt();
                                System.out.print("Ingrese el año de vencimiento (YYYY): ");
                                int añoVencimiento = dakar.nextInt();
                                YearMonth fechaVencimiento = YearMonth.of(añoVencimiento, mesVencimiento);
                                YearMonth fechaActual = YearMonth.now();
                                if (fechaVencimiento.isAfter(fechaActual)) {
                                    fechaValida = true;
                                    System.out.println("Fecha de vencimiento válida.");
                                    String cvv;
                                    boolean cvvValido = false;
                                    while (!cvvValido) {
                                        System.out.print("Ingrese el código CVV (3 dígitos): ");
                                        cvv = dakar.next();
                                        if (cvv.length() == 3 && cvv.matches("[0-9]+")) {
                                            cvvValido = true;
                                            System.out.println("Código CVV válido.");
                                            String clave;
                                            boolean claveValida = false;
                                            while (!claveValida) {
                                                System.out.print("Ingrese su clave de 4 dígitos: ");
                                                clave = dakar.next();
                                                if (clave.length() == 4 && clave.matches("[0-9]+")) {
                                                    claveValida = true;
                                                    System.out.println("Clave válida.");
                                                    System.out.println("¿Desea pagar en cuotas? \n1. Sí \n2. No");
                                                    int cuotaOpcion = dakar.nextInt();
                                                    if (cuotaOpcion == 1) {
                                                        System.out.println("¿En cuántas cuotas desea dividir el pago?");
                                                        int cuotas = dakar.nextInt();
                                                        if (cuotas >= 1) {
                                                            double cuota = totalpagar / cuotas;
                                                            System.out.printf("Cada cuota será de: S/ %.2f\n", cuota);
                                                            System.out.println("Pago realizado en cuotas.");
                                                        } else {
                                                            System.out.println("Número de cuotas inválido. Realizando pago único.");
                                                        }
                                                    }
                                                    System.out.println("Pago con tarjeta realizado exitosamente.");
                                                    this.ImprimirBoleta();

                                                } else {
                                                    System.out.println("Clave inválida. Debe tener 4 dígitos numéricos.");
                                                }
                                            }
                                        } else {
                                            System.out.println("Código CVV inválido. Debe tener 3 dígitos numéricos.");
                                        }
                                    }
                                } else {
                                    System.out.println("Fecha de vencimiento inválida.");
                                }
                            }
                        } else {
                            System.out.println("Número de tarjeta inválido. Debe tener 16 dígitos numéricos.");
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    this.Pago();
                    break;
            }
        } else {
            System.out.println("Opción no válida. Intente nuevamente.");
            this.Pago();
        }
        System.out.println("-------BOLETA DE VENTA-------");
        System.out.printf("\nSUBTOTAL: %.2f\n", subtotal);
        System.out.printf("IGV (18%%): %.2f\n", igv);
        System.out.printf("TOTAL A PAGAR: %.2f\n", totalpagar);
        this.ImprimirBoleta();
        System.exit(0);

    }
    public void ImprimirBoleta() {

        try (FileWriter fileWriter = new FileWriter("D:\\boleta_de_venta.txt")) {
            fileWriter.write("----BOLETA DE VENTA---------\n");
            fileWriter.write("CANTIDAD\tDESCRIPCIÓN\t\tTOTAL\n");

            for (int i = 0; i < Merch.size(); i++) {
                int cantidad = carritomerch.get(i);
                if (cantidad > 0) {
                    double totalMenu = cantidad * preciosMerch[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Merch.get(i), totalMenu));
                }
            }

            for (int i = 0; i < Cafe.size(); i++) {
                int cantidad = carritocafe.get(i);
                if (cantidad > 0) {
                    double totalExtra = cantidad * preciosCafe[i];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Cafe.get(i), totalExtra));
                }
            }
            fileWriter.write(String.format("\nSUBTOTAL: %.2f\n", subtotal));
            fileWriter.write(String.format("IGV (18%%): %.2f\n", igv));
            fileWriter.write(String.format("TOTAL A PAGAR: %.2f\n", totalpagar));
            System.out.println("La boleta ha sido guardada en 'boleta.txt'.");

        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir la boleta: " +e.getMessage());
        }
    }

    public static void main(String[] args) {
        Categorias tiendademerch = new Categorias();
        tiendademerch.categorias();
    }
}

