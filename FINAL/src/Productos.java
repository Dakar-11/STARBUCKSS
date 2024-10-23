import java.util.Scanner;
public class Productos {
    Scanner dakar =  new Scanner(System.in);
    double totalgeneral=0;
    public void bebidas(){
        int opcion;

        do {
            System.out.println("Bienvenido a la sección de bebidas");
            System.out.println("""
               1.- Frappuccinos
               2.- Espresso caliente
               3.- Espresso frío
               4.- Refreshers
               5.- Otras bebidas calientes
               6.- Shaken Espresso
               7.- Regresar al menú
               """);
                System.out.println("¿Cuál de estos productos desea llevar?");
                opcion = dakar.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tenemos las siguientes bebidas");
                    System.out.println("""
                     1.- Matcha Frappuccino S/16.00
                     2.- Mocha Blanco Frappuccino S/15.00
                     3.- Caramel Ribbon Crunch Frappuccino S/16.50
                     4.- Fresa Creme Frappuccino S/15.00
                     5.- Black & White Frappuccino S/16.50
                     """);
                    int elegir1 = dakar.nextInt();
                    double precioUnitario1;

                    switch (elegir1) {
                        case 1:
                            precioUnitario1 = 16.00;
                            break;
                        case 2:
                            precioUnitario1 = 15.00;
                            break;
                        case 3:
                            precioUnitario1 = 16.50;
                            break;
                        case 4:
                            precioUnitario1 = 15.00;
                            break;
                        case 5:
                            precioUnitario1 = 16.50;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad1 = dakar.nextInt();
                    double total1 = cantidad1 * precioUnitario1;

                    total1 = Math.round(total1) ;

                    System.out.println("Sería un costo de S/" + total1 + " soles");
                    totalgeneral+=total1;
                    int opcion1;
                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion1 = dakar.nextInt();
                        if (opcion1 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion1 == 2) {
                            double pago1;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago1 = dakar.nextDouble();

                                if (pago1 == 0) {
                                    System.out.println("Compra cancelada");
                                    System.exit(0);
                                }
                                else if (pago1 >= totalgeneral) {
                                    double vuelto1 = pago1 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto1 > 0) {
                                        vuelto1 = Math.round(vuelto1) ;
                                        System.out.println("Su vuelto1 es: S/" + vuelto1);
                                    }

                                    double subtotal1 = totalgeneral / 1.18; // subtotal1
                                    double igv1 = totalgeneral - subtotal1; //IGV

                                    subtotal1 = Math.round(subtotal1);
                                    igv1 = Math.round(igv1) ;

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos: $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal1);
                                    System.out.println("IGV (18%): S/" + igv1);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total1: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante1 = totalgeneral - pago1;
                                    System.out.println("Falta pagar S/" + faltante1 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad1 faltante1:");
                                    double montoAdicional1 = dakar.nextDouble();
                                    pago1 += montoAdicional1;

                                    if (pago1 >= totalgeneral) {
                                        double vuelto1 = pago1 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto1 > 0) {
                                            vuelto1 = Math.round(vuelto1 ) ;
                                            System.out.println("Su vuelto1 es: S/" + vuelto1);
                                        }
                                        double subtotal1 = totalgeneral / 1.18;
                                        double igv1 = totalgeneral - subtotal1;
                                        subtotal1 = Math.round(subtotal1) ;
                                        igv1 = Math.round(igv1) ;

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal1);
                                        System.out.println("IGV (18%): S/" + igv1);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total1: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total1 - pago1) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago1 < total1);
                        }
                        else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    } while (opcion1 != 2);

                    break;
                case 2:
                    System.out.println("Has elegido Espresso caliente.");
                    System.out.println("Tenemos las siguientes opciones de café:");
                    System.out.println(""" 
                1.- Mocha Machiano $/16.00
                2.- Americano $/9.00
                3.- Black & White $/14.50
                4.- Flat White $/14.00
                5.- Latte $/11.50
                """);
                    int elegir2 = dakar.nextInt();
                    double precioUnitario2;

                    switch (elegir2) {
                        case 1:
                            precioUnitario2 = 16.00;
                            break;
                        case 2:
                            precioUnitario2 = 9.00;
                            break;
                        case 3:
                            precioUnitario2 = 14.50;
                            break;
                        case 4:
                            precioUnitario2 = 14.00;
                            break;
                        case 5:
                            precioUnitario2 = 11.50;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad2 = dakar.nextInt();
                    double total2 = cantidad2 * precioUnitario2;

                    total2 = Math.round(total2 );
                    System.out.println("Sería un costo de S/" + total2 + " soles");
                    totalgeneral+=total2;
                    int opcion12;

                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion12 = dakar.nextInt();

                        if (opcion12 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion12 == 2) {
                            double pago2;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago2 = dakar.nextDouble();

                                if (pago2 == 0) {
                                    System.err.println("Compra cancelada");
                                    System.exit(0);
                                } else if (pago2 >= totalgeneral) {
                                    double vuelto2 = pago2 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto2 > 0) {
                                        vuelto2 = Math.round(vuelto2 );
                                        System.out.println("Su vuelto es: S/" + vuelto2);
                                    }

                                    double subtotal2 = totalgeneral / 1.18; // subtotal
                                    double igv2 = totalgeneral - subtotal2; // IGV
                                    subtotal2 = Math.round(subtotal2 );
                                    igv2 = Math.round(igv2) ;

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal2);
                                    System.out.println("IGV (18%): S/" + igv2);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante2 = totalgeneral - pago2;
                                    System.out.println("Falta pagar S/" + faltante2 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional2 = dakar.nextDouble();
                                    pago2 += montoAdicional2;

                                    if (pago2 >= totalgeneral) {
                                        double vuelto2 = pago2 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto2 > 0) {
                                            vuelto2 = Math.round(vuelto2) ;
                                            System.out.println("Su vuelto es: S/" + vuelto2);
                                        }
                                        double subtotal2 = totalgeneral / 1.18;
                                        double igv2 = totalgeneral - subtotal2;
                                        subtotal2 = Math.round(subtotal2 ) ;
                                        igv2 = Math.round(igv2 );

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos: $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal2);
                                        System.out.println("IGV (18%): S/" + igv2);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total2 - pago2) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago2 < total2);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    } while (opcion12 != 2);
                    break;
                case 3:
                    System.out.println("Has elegido Espresso frío.");
                    System.out.println("Tenemos las siguientes opciones de espresso frío:");
                    System.out.println(""" 
                1.- Latte Frío con Bebida de Avena S/16.00
                2.- Cocoa Macchiato Frío S/16.00
                3.- Black Cold S/10.00
                4.- Americano Helado S/9.00
                5.- Latte Helado S/11.50
                """);
                    int elegir3 = dakar.nextInt();
                    double precioUnitario3;

                    switch (elegir3) {
                        case 1:
                            precioUnitario3 = 16.00;
                            break;
                        case 2:
                            precioUnitario3 = 16.00;
                            break;
                        case 3:
                            precioUnitario3 = 10.00;
                            break;
                        case 4:
                            precioUnitario3 = 9.00;
                            break;
                        case 5:
                            precioUnitario3 = 11.50;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad3 = dakar.nextInt();
                    double total3 = cantidad3 * precioUnitario3;

                    total3 = Math.round(total3);
                    System.out.println("Sería un costo de S/" + total3 + " soles");
                    totalgeneral+=total3;
                    int opcion13;
                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion13 = dakar.nextInt();

                        if (opcion13 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion13 == 2) {
                            double pago3;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago3 = dakar.nextDouble();

                                if (pago3 == 0) {
                                    System.err.println("Compra cancelada");
                                        System.exit(0);
                                } else if (pago3 >= totalgeneral) {
                                    double vuelto3 = pago3 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto3 > 0) {
                                        vuelto3 = Math.round(vuelto3 ) ;
                                        System.out.println("Su vuelto es: S/" + vuelto3);
                                    }

                                    double subtotal3 = totalgeneral / 1.18; // subtotal
                                    double igv3 = totalgeneral - subtotal3; // IGV
                                    subtotal3 = Math.round(subtotal3) ;
                                    igv3 = Math.round(igv3);

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal3);
                                    System.out.println("IGV (18%): S/" + igv3);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante3 = totalgeneral - pago3;
                                    System.out.println("Falta pagar S/" + faltante3 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional3 = dakar.nextDouble();
                                    pago3 += montoAdicional3;

                                    if (pago3 >= totalgeneral) {
                                        double vuelto3 = pago3 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto3 > 0) {
                                            vuelto3 = Math.round(vuelto3) ;
                                            System.out.println("Su vuelto es: S/" + vuelto3);
                                        }
                                        double subtotal3 = totalgeneral / 1.18;
                                        double igv3 = totalgeneral - subtotal3;
                                        subtotal3 = Math.round(subtotal3);
                                        igv3 = Math.round(igv3);

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal3);
                                        System.out.println("IGV (18%): S/" + igv3);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total3 - pago3) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago3 < total3);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    } while (opcion13 != 2);
                    break;
                case 4:
                    System.out.println("Has elegido Refreshers.");
                    System.out.println("Tenemos las siguientes opciones de refresher:");
                    System.out.println("""
                1.- Strawberry Acai S/16.00
                2.- Mango Dragon Frozen S/16.00
                3.- Strawberry Acai Refresher S/13.50
                4.- Strawberry Acai Lemonade Refresher S/14.50
                5.- Pink Drink S/15.50
                """);
                    int elegir4 = dakar.nextInt();
                    double precioUnitario4;

                    switch (elegir4) {
                        case 1:
                            precioUnitario4 = 16.00;
                            break;
                        case 2:
                            precioUnitario4 = 16.00;
                            break;
                        case 3:
                            precioUnitario4 = 13.50;
                            break;
                        case 4:
                            precioUnitario4 = 14.50;
                            break;
                        case 5:
                            precioUnitario4 = 15.50;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad4 = dakar.nextInt();
                    double total4 = cantidad4 * precioUnitario4;

                    total4 = Math.round(total4);
                    System.out.println("Sería un costo de S/" + total4 + " soles");
                    totalgeneral+=total4;
                    int opcion14;

                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion14 = dakar.nextInt();

                        if (opcion14 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion14 == 2) {
                            double pago4;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago4 = dakar.nextDouble();

                                if (pago4 == 0) {
                                    System.err.println("Compra cancelada,");
                                    System.exit(0);
                                } else if (pago4 >= totalgeneral) {
                                    double vuelto4 = pago4 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto4 > 0) {
                                        vuelto4 = Math.round(vuelto4);
                                        System.out.println("Su vuelto es: S/" + vuelto4);
                                    }

                                    double subtotal4 = totalgeneral / 1.18; // subtotal
                                    double igv4 = totalgeneral - subtotal4; // IGV
                                    subtotal4 = Math.round(subtotal4 ) ;
                                    igv4 = Math.round(igv4);

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal4);
                                    System.out.println("IGV (18%): S/" + igv4);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante4 = totalgeneral - pago4;
                                    System.out.println("Falta pagar S/" + faltante4 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional4 = dakar.nextDouble();
                                    pago4 += montoAdicional4;

                                    if (pago4 >= totalgeneral) {
                                        double vuelto4 = pago4 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto4 > 0) {
                                            vuelto4 = Math.round(vuelto4);
                                            System.out.println("Su vuelto es: S/" + vuelto4);
                                        }
                                        double subtotal4 = totalgeneral / 1.18;
                                        double igv4 = totalgeneral - subtotal4;
                                        subtotal4 = Math.round(subtotal4);
                                        igv4 = Math.round(igv4);

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal4);
                                        System.out.println("IGV (18%): S/" + igv4);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total4 - pago4) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago4 < total4);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    } while (opcion14 != 2);
                    break;
                case 5:
                    System.out.println("Has elegido Otras bebidas calientes.");
                    System.out.println("Tenemos las siguientes opciones de otras bebidas calientes:");
                    System.out.println("""
                1.- Chocolate Caliente S/13.00
                2.- Té Chai Teavana S/9.00
                3.- Té Hibiscus Teavana S/9.00
                4.- Té Mint Citrus Teavana S/9.00
                5.- Té Chamomile S/9.00
                """);
                    int elegir5 = dakar.nextInt();
                    double precioUnitario5;

                    switch (elegir5) {
                        case 1:
                            precioUnitario5 = 13.00;
                            break;
                        case 2:
                            precioUnitario5 = 9.00;
                            break;
                        case 3:
                            precioUnitario5 = 9.00;
                            break;
                        case 4:
                            precioUnitario5 = 9.00;
                            break;
                        case 5:
                            precioUnitario5 = 9.00;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad5 = dakar.nextInt();
                    double total5 = cantidad5 * precioUnitario5;

                    total5 = Math.round(total5) ;
                    System.out.println("Sería un costo de S/" + total5 + " soles");
                    totalgeneral+=total5;
                    int opcion15;

                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion15 = dakar.nextInt();

                        if (opcion15 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion15 == 2) {
                            double pago5;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago5 = dakar.nextDouble();

                                if (pago5 == 0) {
                                    System.err.println("Compra cancelada");
                                    System.exit(0);
                                } else if (pago5 >= totalgeneral) {
                                    double vuelto5 = pago5 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto5 > 0) {
                                        vuelto5 = Math.round(vuelto5 );
                                        System.out.println("Su vuelto es: S/" + vuelto5);
                                    }

                                    double subtotal5 = totalgeneral / 1.18; // subtotal
                                    double igv5 = totalgeneral - subtotal5; // IGV
                                    subtotal5 = Math.round(subtotal5);
                                    igv5 = Math.round(igv5 );

                                    System.out.println("Generando boleta...01");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal5);
                                    System.out.println("IGV (18%): S/" + igv5);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante5 = totalgeneral - pago5;
                                    System.out.println("Falta pagar S/" + faltante5 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional5 = dakar.nextDouble();
                                    pago5 += montoAdicional5;

                                    if (pago5 >= totalgeneral) {
                                        double vuelto5 = pago5 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto5 > 0) {
                                            vuelto5 = Math.round(vuelto5 );
                                            System.out.println("Su vuelto es: S/" + vuelto5);
                                        }
                                        double subtotal5 = totalgeneral / 1.18;
                                        double igv5 = totalgeneral - subtotal5;
                                        subtotal5 = Math.round(subtotal5);
                                        igv5 = Math.round(igv5);

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos: $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal5);
                                        System.out.println("IGV (18%): S/" + igv5);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total5 - pago5) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago5 < total5);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    } while (opcion15 != 2);
                    break;
                case 6:
                    System.out.println("Has elegido Shaken Espresso.");
                    System.out.println("Tenemos las siguientes opciones de Shaken Espresso:");
                    System.out.println("""
                1.- Brown Sugar Shaken Espresso Frío con Bebida de Avena S/16.50
                2.- Avellana Shaken Espresso Frío con Bebida de Avena S/16.50
                3.- Chocolate Shaken Espresso Frío con Bebida de Avena S/16.50
                """);
                    int elegir6 = dakar.nextInt();
                    double precioUnitario6;

                    switch (elegir6) {
                        case 1:
                            precioUnitario6 = 16.50;
                            break;
                        case 2:
                            precioUnitario6 = 16.50;
                            break;
                        case 3:
                            precioUnitario6 = 16.50;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad6 = dakar.nextInt();
                    double total6 = cantidad6 * precioUnitario6;

                    total6 = Math.round(total6);
                    System.out.println("Sería un costo de S/" + total6 + " soles");
                    totalgeneral+=total6;
                    int opcion16;

                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion16 = dakar.nextInt();

                        if (opcion16 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion16 == 2) {
                            double pago6;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago6 = dakar.nextDouble();

                                if (pago6 == 0) {
                                    System.err.println("Compra cancelada");
                                    System.exit(0);
                                } else if (pago6 >= totalgeneral) {
                                    double vuelto6 = pago6 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto6 > 0) {
                                        vuelto6 = Math.round(vuelto6);
                                        System.out.println("Su vuelto es: S/" + vuelto6);
                                    }

                                    double subtotal6 = totalgeneral / 1.18; // subtotal
                                    double igv6 = totalgeneral - subtotal6; // IGV
                                    subtotal6 = Math.round(subtotal6 );
                                    igv6 = Math.round(igv6);

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos: $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal6);
                                    System.out.println("IGV (18%): S/" + igv6);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante6 = totalgeneral - pago6;
                                    System.out.println("Falta pagar S/" + faltante6 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional6 = dakar.nextDouble();
                                    pago6 += montoAdicional6;

                                    if (pago6 >= totalgeneral) {
                                        double vuelto6 = pago6 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto6 > 0) {
                                            vuelto6 = Math.round(vuelto6 );
                                            System.out.println("Su vuelto es: S/" + vuelto6);
                                        }
                                        double subtotal6 = totalgeneral / 1.18;
                                        double igv6 = totalgeneral - subtotal6;
                                        subtotal6 = Math.round(subtotal6 );
                                        igv6 = Math.round(igv6);

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos: $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal6);
                                        System.out.println("IGV (18%): S/" + igv6);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total6 - pago6) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago6 < total6);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    } while (opcion16 != 2);
                    break;
                case 7:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 7);
    }
    public void packs(){
        int opcion;
        do{
            System.out.println("--------PACKS Y BOXES--------");
            System.out.println("Coffee for Share: 1");
            System.out.println("Desayunos:2");
            System.out.println("Antojos de la tarde:3");
            System.out.println("Ir a menu principal:4");
            opcion = dakar.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("----Coffee for Share----");
                    System.out.println("Tenemos las siguientes opciones");
                    System.out.println("""
                               1: Coffe traveler: S/60.00
                               2: Pack coffe Mixto: S/120.00
                               3: Pack coffe sandwich: S/135.00
                               4: Pack coffe galleta: S/95.00
                               """);
                    int elegir = dakar.nextInt();
                    double precioUnitario;

                    switch (elegir) {
                        case 1:
                            precioUnitario = 60.00;
                            break;
                        case 2:
                            precioUnitario = 120.00;
                            break;
                        case 3:
                            precioUnitario = 135.00;
                            break;
                        case 4:
                            precioUnitario=95.00;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad = dakar.nextInt();
                    double total = cantidad * precioUnitario;

                    total = Math.round(total);
                    System.out.println("Sería un costo de S/" + total + " soles");
                    totalgeneral+=total;
                    int opcion1;

                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion1 = dakar.nextInt();

                        if (opcion1 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion1 == 2) {
                            double pago;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago = dakar.nextDouble();

                                if (pago == 0) {
                                    System.err.println("Compra cancelada");
                                    System.exit(0);
                                } else if (pago >= totalgeneral) {
                                    double vuelto = pago - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto> 0) {
                                        vuelto = Math.round(vuelto);
                                        System.out.println("Su vuelto es: S/" + vuelto);
                                    }

                                    double subtotal = totalgeneral / 1.18; // subtotal
                                    double igv = totalgeneral - subtotal; // IGV
                                    subtotal = Math.round(subtotal );
                                    igv = Math.round(igv);

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos: $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal);
                                    System.out.println("IGV (18%): S/" + igv);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante = totalgeneral - pago;
                                    System.out.println("Falta pagar S/" + faltante + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional = dakar.nextDouble();
                                    pago += montoAdicional;

                                    if (pago >= totalgeneral) {
                                        double vuelto = pago - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto > 0) {
                                            vuelto = Math.round(vuelto );
                                            System.out.println("Su vuelto es: S/" + vuelto);
                                        }
                                        double subtotal = totalgeneral / 1.18;
                                        double igv = totalgeneral - subtotal;
                                        subtotal = Math.round(subtotal );
                                        igv = Math.round(igv);

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos: $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal);
                                        System.out.println("IGV (18%): S/" + igv);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total - pago) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago < total);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    }
                    while (opcion1 != 2);
                    break;
                case 2:
                    System.out.println("----Seccion desayunos----");
                    System.out.println("--------aqui tenemos diferentes opciones--------");
                    System.out.println("""
                                opcion:1:Duo desayuno : S/ 11.00
                                opcion:2:desayuno para dos : S/ 30.00
                                """);
                    int elegir2 = dakar.nextInt();
                    double precioUnitario2;

                    switch (elegir2) {
                        case 1:
                            precioUnitario2 = 11;
                            break;
                        case 2:
                            precioUnitario2 = 30;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad2 = dakar.nextInt();
                    double total2 = cantidad2 * precioUnitario2;

                    total2 = Math.round(total2);
                    System.out.println("Sería un costo de S/" + total2 + " soles");
                    totalgeneral+=total2;
                    int opcion12;

                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion12 = dakar.nextInt();

                        if (opcion12 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion12 == 2) {
                            double pago2;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago2 = dakar.nextDouble();

                                if (pago2 == 0) {
                                    System.err.println("Compra cancelada");
                                    System.exit(0);
                                } else if (pago2 >= totalgeneral) {
                                    double vuelto2 = pago2 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto2> 0) {
                                        vuelto2 = Math.round(vuelto2);
                                        System.out.println("Su vuelto es: S/" + vuelto2);
                                    }

                                    double subtotal2 = totalgeneral / 1.18; // subtotal
                                    double igv2 = totalgeneral - subtotal2; // IGV
                                    subtotal2 = Math.round(subtotal2 );
                                    igv2 = Math.round(igv2);

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos: $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal2);
                                    System.out.println("IGV (18%): S/" + igv2);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante2 = totalgeneral - pago2;
                                    System.out.println("Falta pagar S/" + faltante2 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional2 = dakar.nextDouble();
                                    pago2 += montoAdicional2;

                                    if (pago2 >= totalgeneral) {
                                        double vuelto2 = pago2 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto2 > 0) {
                                            vuelto2 = Math.round(vuelto2 );
                                            System.out.println("Su vuelto es: S/" + vuelto2);
                                        }
                                        double subtotal2 = totalgeneral / 1.18;
                                        double igv2 = totalgeneral - subtotal2;
                                        subtotal2 = Math.round(subtotal2 );
                                        igv2 = Math.round(igv2);

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos: $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal2);
                                        System.out.println("IGV (18%): S/" + igv2);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total2 - pago2) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago2 < total2);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    }
                    while (opcion12 != 2);
                    break;
                case 3:
                    System.out.println("----Seccion antojos de la tarde----");
                    System.out.println("--------aqui tenemos diferentes opciones--------");
                    System.out.println("""
                                opcion:1:Muffins 4 share : S/ 32.00
                                opcion:2:Momentos dulces: S/ 14.00
                                opcion:3:Sweet & Share: S/26.00
                                """);
                    int elegir3 = dakar.nextInt();
                    double precioUnitario3;

                    switch (elegir3) {
                        case 1:
                            precioUnitario3 = 32.00;
                            break;
                        case 2:
                            precioUnitario3 = 14.00;
                            break;
                        case 3:
                            precioUnitario3 = 26.00;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            return;
                    }

                    System.out.println("¿Cuántos desea llevar?");
                    int cantidad3 = dakar.nextInt();
                    double total3 = cantidad3 * precioUnitario3;

                    total3 = Math.round(total3);
                    System.out.println("Sería un costo de S/" + total3 + " soles");
                    totalgeneral+=total3;
                    int opcion13;

                    do {
                        System.out.println("------------------------");
                        System.out.println("¿Quisiera llevar algo más?");
                        System.out.println("Llevas una deuda total de "+totalgeneral+" soles");
                        System.out.println("1.- Sí");
                        System.out.println("2.- No");
                        opcion13 = dakar.nextInt();

                        if (opcion13 == 1) {
                            System.out.println("Volviendo al menú para seleccionar otro producto...");
                            break;
                        } else if (opcion13 == 2) {
                            double pago3;
                            do {
                                System.out.println("Ingrese el monto con el que va a pagar: ");
                                pago3 = dakar.nextDouble();

                                if (pago3 == 0) {
                                    System.err.println("Compra cancelada");
                                    System.exit(0);
                                } else if (pago3 >= totalgeneral) {
                                    double vuelto3 = pago3 - totalgeneral;
                                    System.out.println("Pago completo.");

                                    if (vuelto3> 0) {
                                        vuelto3 = Math.round(vuelto3);
                                        System.out.println("Su vuelto es: S/" + vuelto3);
                                    }

                                    double subtotal3 = totalgeneral / 1.18; // subtotal
                                    double igv3 = totalgeneral - subtotal3; // IGV
                                    subtotal3 = Math.round(subtotal3 );
                                    igv3 = Math.round(igv3);

                                    System.out.println("Generando boleta...");
                                    System.out.println("------ BOLETA DE VENTA ------");
                                    System.out.println("Total de productos: $/"+totalgeneral);
                                    System.out.println("Subtotal: S/" + subtotal3);
                                    System.out.println("IGV (18%): S/" + igv3);
                                    System.out.println("-----------------------------");
                                    System.out.println("Monto total: S/" + totalgeneral);
                                    System.out.println("Gracias por su compra.");
                                    System.exit(0);
                                } else {
                                    double faltante3 = totalgeneral - pago3;
                                    System.out.println("Falta pagar S/" + faltante3 + ". Aumenta dinero o no puedes llevar el producto.");
                                    System.out.println("Ingresa la cantidad faltante:");
                                    double montoAdicional3 = dakar.nextDouble();
                                    pago3 += montoAdicional3;

                                    if (pago3 >= totalgeneral) {
                                        double vuelto3 = pago3 - totalgeneral;
                                        System.out.println("Pago completo.");
                                        if (vuelto3 > 0) {
                                            vuelto3 = Math.round(vuelto3 );
                                            System.out.println("Su vuelto es: S/" + vuelto3);
                                        }
                                        double subtotal3 = totalgeneral / 1.18;
                                        double igv3 = totalgeneral - subtotal3;
                                        subtotal3 = Math.round(subtotal3 );
                                        igv3 = Math.round(igv3);

                                        System.out.println("Generando boleta...");
                                        System.out.println("------ BOLETA DE VENTA ------");
                                        System.out.println("Total de productos: $/"+totalgeneral);
                                        System.out.println("Subtotal: S/" + subtotal3);
                                        System.out.println("IGV (18%): S/" + igv3);
                                        System.out.println("-----------------------------");
                                        System.out.println("Monto total: S/" + totalgeneral);
                                        System.out.println("Gracias por su compra.");
                                        System.exit(0);
                                    } else {
                                        System.out.println("Aún falta S/" + (total3 - pago3) + ". No puedes llevar los productos.");
                                    }
                                }
                            } while (pago3 < total3);
                        } else {
                            System.out.println("Opción no válida. Intente de nuevo.");
                        }

                    }
                    while (opcion13 != 2);
                    break;
                default:
                    System.out.println("Regresando al menu principal");
            }
        }
        while(opcion!=4);


    }
}

