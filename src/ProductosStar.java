import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ProductosStar {
    Scanner fernando = new Scanner(System.in);
    ArrayList<String> CoffeeforShare = new ArrayList<>();
    ArrayList<String> Desayunos = new ArrayList<>();
    ArrayList<String> Antojosdelatarde = new ArrayList<>();

    double[] precios_CoffeeforShare = {60, 120, 135, 95};
    double[] precios_Desayunos = {11, 30};
    double[] precios_AntojosenlaTarde = {32, 14, 26};

    double igv, subtotal, totalpagar;
    int i;

    ArrayList<Integer> CanastaCoffeeforShare = new ArrayList<>();
    ArrayList<Integer> CanastaDesayunos = new ArrayList<>();
    ArrayList<Integer> CanastaAntojosenlaTarde = new ArrayList<>();
    int opcion, cantidad;

    public void PacksyBoxes() {
        switch (opcion) {
            case 1:

                CoffeeforShare.add("Coffe traveler : S/60.00");
                CoffeeforShare.add("Pack coffe Mixto : S/120.00");
                CoffeeforShare.add("Pack coffe sandwich : S/135.00");
                CoffeeforShare.add("Pack coffe galleta : S/95.00");
                break;
            case 2:

                Desayunos.add("Duo desayuno : S/ 11.00");
                Desayunos.add("desayuno para dos : S/ 30.00");
                break;

            case 3:

                Antojosdelatarde.add("Muffins 4 share : S/ 32.00");
                Antojosdelatarde.add("Momentos Dulces : S/ 14.00");
                Antojosdelatarde.add("Sweet & Share : S/26.00");
                break;
            default:
                System.out.println("Opción no válida.");
                return;

        }

        for (int i = 0; i < CoffeeforShare.size(); i++) {
            CanastaCoffeeforShare.add(0);
        }
        for (int i = 0; i < Desayunos.size(); i++) {
            CanastaDesayunos.add(0);
        }
        for (int i = 0; i < Antojosdelatarde.size(); i++) ;
        {
            CanastaAntojosenlaTarde.add(0);
        }
    }

    public void MenuProductos() {
        System.out.println("--------PACKS Y BOXES--------");
        System.out.println("Coffee for Share: 1");
        System.out.println("Desayunos:2");
        System.out.println("Antojos de la tarde:3");
        opcion = fernando.nextInt();
        fernando.nextLine();
        this.PacksyBoxes();
        switch (opcion) {
            case 1:
                this.CoffeeforShare();
                break;
            case 2:
                this.Desayunos();
                break;
            case 3:
                this.Antojosdelatarde();
                break;
            default:
                System.out.println("Opcion no valida intentelo de nuevo ");
                this.MenuProductos();
                break;
        }
    }

    public void CoffeeforShare() {
        System.out.println("----Coffee for Share----");
        System.out.println("Tenemos las siguientes bebidas y productos ");

        for (int i = 0; i < CoffeeforShare.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + CoffeeforShare.get(i));
        }

        opcion = fernando.nextInt();
        fernando.nextLine();


        if (opcion >= 1 && opcion <= CoffeeforShare.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = fernando.nextInt();
            fernando.nextLine();
            CanastaCoffeeforShare.set(opcion - 1, CanastaCoffeeforShare.get(opcion - 1) + cantidad);

            System.out.println("Usted ah pedido " + CanastaCoffeeforShare.get(opcion - 1) + " bebidas o productos de " + CoffeeforShare.get(opcion - 1));
            System.out.println("deseas eliejir otra producto o bebida :1SI :2NO :3MENU");
            opcion = fernando.nextInt();
            fernando.nextLine();


            if (opcion == 1) {
                System.out.println("Volviendo a la opción de compra");
                this.CoffeeforShare();
            } else if (opcion == 2) {
                this.PagoPacksYBoxes();
            } else if (opcion == 3) {
                this.MenuProductos();
            } else {
                System.out.println("Opcion no válida");
            }


        } else {
            System.out.println("Opcion no válida");
            this.MenuProductos();
        }

    }

    public void Desayunos() {
        System.out.println("----Desayunos----");
        System.out.println("Tenemos las siguientes bebidas y productos ");

        for (int i = 0; i < Desayunos.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Desayunos.get(i));
        }

        opcion = fernando.nextInt();
        fernando.nextLine();


        if (opcion >= 2 && opcion <= Desayunos.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = fernando.nextInt();
            fernando.nextLine();
            CanastaDesayunos.set(opcion - 1, CanastaDesayunos.get(opcion - 1) + cantidad);

            System.out.println("Usted ah pedido " + CanastaDesayunos.get(opcion - 1) + " bebidas o productos de " + Desayunos.get(opcion - 1));
            System.out.println("deseas eliejir otra producto o bebida :1SI :2NO :3MENU");
            opcion = fernando.nextInt();
            fernando.nextLine();


            if (opcion == 1) {
                System.out.println("Volviendo a la opción de compra");
                this.Desayunos();
            } else if (opcion == 2) {
                this.PagoPacksYBoxes();
            } else if (opcion == 3) {
                this.MenuProductos();
            } else {
                System.out.println("Opcion no válida");
            }


        } else {
            System.out.println("Opcion no válida");
            this.MenuProductos();
        }

    }

    public void Antojosdelatarde() {

        System.out.println("----Antojos de la tarde----");
        System.out.println("Tenemos las siguientes bebidas y productos ");

        for (int i = 0; i < Antojosdelatarde.size(); i++) {
            System.out.println("Opción " + (i + 1) + " : " + Antojosdelatarde.get(i));
        }

        opcion = fernando.nextInt();
        fernando.nextLine();


        if (opcion >= 1 && opcion <= Antojosdelatarde.size()) {
            System.out.println("¿Cuántos comprará? Ingrese la cantidad");
            cantidad = fernando.nextInt();
            fernando.nextLine();
            CanastaAntojosenlaTarde.set(opcion - 1, CanastaAntojosenlaTarde.get(opcion - 1) + cantidad);

            System.out.println("Usted ah pedido " + CanastaAntojosenlaTarde.get(opcion - 1) + " bebidas o productos de " + Antojosdelatarde.get(opcion - 1));
            System.out.println("deseas eliejir otra producto o bebida :1SI :2NO :3MENU");
            opcion = fernando.nextInt();
            fernando.nextLine();


            if (opcion == 1) {
                System.out.println("Volviendo a la opción de compra");
                this.Antojosdelatarde();
            } else if (opcion == 2) {
                this.PagoPacksYBoxes();
            } else if (opcion == 3) {
                this.MenuProductos();
            } else {
                System.out.println("Opcion no válida");
            }


        } else {
            System.out.println("Opcion no válida");
            this.MenuProductos();
        }

    }

    public double PagoPacksYBoxes() {
        double cantidadTotal = 0;
        System.out.println("--------BOLETA DE VENTA---------");
        System.out.println("CANTIDAD\tDESCRIPCIÓN    PRECION\t\tTOTAL");

        for (int i = 0; i < CoffeeforShare.size(); i++) {
            int cantidad = CanastaCoffeeforShare.get(i);
            if (cantidad > 0) {
                double totalCoffeeforShare = cantidad * precios_CoffeeforShare[0];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, CoffeeforShare.get(i), totalCoffeeforShare);
                cantidadTotal += totalCoffeeforShare;
            }
        }

        for (int i = 0; i < Desayunos.size(); i++) {
            int cantidad = CanastaDesayunos.get(i);
            if (cantidad > 0) {
                double totalDesayunos = cantidad * precios_Desayunos[0];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Desayunos.get(i), totalDesayunos);
                cantidadTotal += totalDesayunos;
            }
        }

        for (int i = 0; i < Antojosdelatarde.size(); i++) {
            int cantidad = CanastaAntojosenlaTarde.get(i);
            if (cantidad > 0) {
                double totalAntojosdelatarde = cantidad * precios_AntojosenlaTarde[0];
                System.out.printf("%d\t\t%s\t\t%.2f\n", cantidad, Antojosdelatarde.get(i), totalAntojosdelatarde);
                cantidadTotal += totalAntojosdelatarde;
            }
        }
        igv = cantidadTotal * 0.18;
        subtotal = cantidadTotal - igv;
        totalpagar = subtotal + igv;

        System.out.printf("\nSUBTOTAL: %.2f\n", subtotal);
        System.out.printf("IGV: %.2f\n", igv);
        System.out.printf("TOTAL A PAGAR: %.2f\n", totalpagar);


        System.out.println("Seleccione método de pago: 1 para Tarjeta, 2 para Efectivo");
        int metodoPago = fernando.nextInt();
        fernando.nextLine();

        if (metodoPago == 1) {
            System.out.println("Ingrese los datos de la tarjeta para procesar el pago:");

            System.out.print("Número de tarjeta (16 dígitos): ");
            String numeroTarjeta = fernando.nextLine();

            System.out.print("Fecha de expiración (MM/AA): ");
            String fechaExpiracion = fernando.nextLine();

            System.out.print("Código CVV (3 dígitos): ");
            String cvv = fernando.nextLine();

            System.out.println("Usted ha seleccionado pagar con tarjeta. Procesando el pago...");
            System.out.println("Detalles de la tarjeta:");
            System.out.println("Número de tarjeta:" + numeroTarjeta);
            System.out.println("Fecha de expiración: " + fechaExpiracion);

        } else if (metodoPago == 2) {
            System.out.println("Usted ha seleccionado pagar en efectivo. Por favor, prepare el monto exacto.");
        } else {
            System.out.println("Opción de pago no válida, se asumirá pago en efectivo.");
        }


        ImprimirBoleta();

        return totalpagar;

    }


    public void ImprimirBoleta() {

        try (FileWriter fileWriter = new FileWriter("boleta.txt")) {

            fileWriter.write("----BOLETA DE VENTA---------\n");
            fileWriter.write("CANTIDAD\tDESCRIPCIÓN    PRECIO\t\tTOTAL\n");

            for (int i = 0; i < CoffeeforShare.size(); i++) {
                int cantidad = CanastaCoffeeforShare.get(i);
                if (cantidad > 0) {
                    double totalCoffeeforShare = cantidad * precios_CoffeeforShare[0];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, CoffeeforShare.get(i), totalCoffeeforShare));
                }
            }
            for (i = 0; i < Desayunos.size(); i++) {
                int cantidad = CanastaDesayunos.get(i);
                if (cantidad > 0) {
                    double totalDesayunos = cantidad * precios_Desayunos[0];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Desayunos.get(i), totalDesayunos));

                }

            }
            for (i = 0; i < Antojosdelatarde.size(); i++) {
                int cantidad = CanastaAntojosenlaTarde.get(i);
                if (cantidad > 0) {
                    double totalAntojosdelatarde = cantidad * precios_AntojosenlaTarde[0];
                    fileWriter.write(String.format("%d\t\t%s\t\t%.2f\n", cantidad, Antojosdelatarde.get(i), totalAntojosdelatarde));

                }

            }
            fileWriter.write(String.format("\nSUBTOTAL: %.2f\n", subtotal));
            fileWriter.write(String.format("IGV: %.2f\n", igv));
            fileWriter.write(String.format("TOTAL A PAGAR: %.2f\n", totalpagar));
            System.out.println("La boleta ha sido guardada en 'boleta.txt'.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir la boleta: " + e.getMessage());
        }


    }


    public void main(String[] args) {
        ProductosStar bellido = new ProductosStar();
        bellido.PacksyBoxes();
        bellido.MenuProductos();
        bellido.PagoPacksYBoxes();
        bellido.ImprimirBoleta();
    }
}

