import java.util.Scanner;
public class Proyecto {
    public int opcion = 0, cantidad = 0;
    public double subtotal = 0, igv = 0, totalPagar = 0, pago = 0;

    Scanner dakar = new Scanner(System.in);

    public void Bienvenida() {
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐BIENVENIDO A LA SECCIÓN DE ALIMENTOS⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println(" ");
        this.Menudealimentos();}
    public void Menudealimentos() {
        System.out.println("SELECCIONE UNA CATEGORIA DE PRODUCTOS:");
        System.out.println("1. Pastries🥙 \n2. Postres🧁 \n3. Sandwiches🥟 \n4. Regresar🔙" );
        opcion = dakar.nextInt();
        this.Categoriadealimentos();
        this.Mascompras();
    }
    public void Categoriadealimentos() {
        switch (opcion) {
            case 1:
                System.out.println("------------------PASTRIES----------------");
                System.out.println("1. Banana Bread___________________ S/ 8.00");
                System.out.println("2. Muffin de Naranja _____________ S/ 9.00");
                System.out.println("3. Keke de Zanahoria______________ S/ 9.00");
                System.out.println("4. Galleta Cranberry______________ S/ 5.50");
                System.out.println("5. Keke de Limón__________________ S/ 9.00");
                System.out.println("6. Galleta de Chocochips__________ S/ 5.50");
                System.out.println("7. Muffin de Berries______________ S/ 9.00");
                System.out.println("8. Egg Bites de Jamón y Queso_____ S/ 9.00");
                System.out.println("------------------------------------------");
                System.out.println("Seleccione el producto que desea comprar: ");
                opcion = dakar.nextInt();
                System.out.println("Ingrese la cantidad que desea comprar:");
                cantidad = dakar.nextInt();
                for (int i = 1; i <= cantidad; i++) {
                    System.out.print("📦");
                }
                System.out.println("");
                double precioPastries = 0;
                switch (opcion) {
                    case 1: precioPastries = 8.00;break;
                    case 2: precioPastries = 9.00;break;
                    case 3: precioPastries = 9.00;break;
                    case 4: precioPastries = 5.50;break;
                    case 5: precioPastries = 9.00;break;
                    case 6: precioPastries = 5.50;break;
                    case 7: precioPastries = 9.00;break;
                    case 8: precioPastries = 9.00;break;
                    default:
                        System.out.println("Producto no válido.");
                        return;
                }
                subtotal += calcularSubtotalSinIGV(precioPastries, cantidad);
                igv += (precioPastries * cantidad) - calcularSubtotalSinIGV(precioPastries, cantidad);
                totalPagar += precioPastries * cantidad;
                break;
            case 2:
                System.out.println("---------------------POSTRES----------------");
                System.out.println("1. Crocante de Manzana Vegetal_____ S/ 15.00");
                System.out.println("2. Cake Pop Vainilla_______________ S/ 6.50");
                System.out.println("3. Cheesecake de Chocolate_________ S/ 15.00");
                System.out.println("4. Cheesecake de Arándanos_________ S/ 15.00");
                System.out.println("5. Brownie de Cookies & Cream______ S/ 8.50");
                System.out.println("6. Torta de Chocolate______________ S/ 12.50");
                System.out.println("--------------------------------------------");
                System.out.println("Seleccione el producto que desea comprar: ");
                opcion = dakar.nextInt();
                System.out.println("Ingrese la cantidad que desea comprar:");
                cantidad = dakar.nextInt();
                for (int i = 1; i <= cantidad; i++) {
                    System.out.print("📦");
                }
                System.out.println("");
                double precioPostres = 0;
                switch (opcion) {
                    case 1: precioPostres = 15.00;break;
                    case 2: precioPostres = 6.50;break;
                    case 3: precioPostres = 15.00;break;
                    case 4: precioPostres = 15.00;break;
                    case 5: precioPostres = 8.50;break;
                    case 6: precioPostres = 12.50;break;
                    default: System.out.println("Producto no válido.");
                    return;
                }
                subtotal += calcularSubtotalSinIGV(precioPostres, cantidad);
                igv += (precioPostres * cantidad) - calcularSubtotalSinIGV(precioPostres, cantidad);
                totalPagar += precioPostres * cantidad;
                break;
            case 3:
                System.out.println("-------------------SANDWICHES--------------------");
                System.out.println("1. Sandwich Italiano_____________________ S/ 14.00");
                System.out.println("2. Croissant de Mantequilla______________ S/ 5.50");
                System.out.println("3. Croissant de Jamón Serrano y Queso____ S/ 15.50");
                System.out.println("4. Croissant Jamón del País y Queso______ S/ 15.50");
                System.out.println("5. Croissant Jamón Inglés y Queso________ S/ 15.50");
                System.out.println("6. Sandwich Chicken Pesto Parmesano______ S/ 15.50");
                System.out.println("7. Empanada de Lomo______________________ S/ 9.50");
                System.out.println("-------------------------------------------------");
                System.out.println("Seleccione el producto que desea comprar: ");
                opcion = dakar.nextInt();
                System.out.println("Ingrese la cantidad que desea comprar:");
                cantidad = dakar.nextInt();
                for (int i = 1; i <= cantidad; i++) {
                    System.out.print("📦");
                }
                System.out.println("");
                double precioSandwiches = 0;
                switch (opcion) {
                    case 1: precioSandwiches = 14.00;break;
                    case 2: precioSandwiches = 5.50;break;
                    case 3: precioSandwiches = 15.50;break;
                    case 4: precioSandwiches = 15.50;break;
                    case 5: precioSandwiches = 15.50;break;
                    case 6: precioSandwiches = 15.50;break;
                    case 7: precioSandwiches = 9.50;break;
                    default:
                        System.out.println("Producto no válido.");
                        return;
                }
                subtotal += calcularSubtotalSinIGV(precioSandwiches, cantidad);
                igv += (precioSandwiches * cantidad) - calcularSubtotalSinIGV(precioSandwiches, cantidad);
                totalPagar += precioSandwiches * cantidad;
                break;
            case 4:
                System.out.println("¿ESTA SEGURO QUE DESEA SALIR?");
                System.out.println("usted ya tiene en su canasta un valor de:"+totalPagar+"soles");
                System.out.println("1.Si \n2.No");
                opcion = dakar.nextInt();
                if (opcion == 1) {
                    Categorias categorias = new Categorias();
                    categorias.menuprincipal();
                } else if (opcion == 2) {
                    System.out.println("-------------------------------------------------");
                    this.Menudealimentos();
                    return;
                }
            break;
            default:
                System.out.println("Opción no válida.");
        }
    }
        public double calcularSubtotalSinIGV(double precio, int cantidad) {
        double subtotalSinIGV = (precio*cantidad)/1.18;
        return subtotalSinIGV;
    }
    public double procesodepago() {
        System.out.println("Su Boleta de venta esta siendo genenerada...");
        System.out.println("___________________");
        System.out.println("➡Subtotal: S/ " + (Math.round(subtotal * 100.0) / 100.0));
        System.out.println("➡IGV (18%): S/ " + (Math.round(igv * 100.0) / 100.0));
        System.out.println("-------------------");
        System.out.println("Total a pagar: S/ " + (Math.round(totalPagar * 100.0) / 100.0));
        System.out.println("----------------------");
        System.out.println("Gracias por su compra vuelva pronto");
        System.out.println("usted compro una cantidad de  : "+cantidad+" unidades.");
        System.exit(0);
        return totalPagar;
    }
    public void Mascompras() {
        System.out.println("usted tiene en su canasta un valor de: "+totalPagar+" soles");
        System.out.println("¿DESEA COMPRAR ALGO MÁS?");
        System.out.println("1.SÍ \n2.NO");
        opcion = dakar.nextInt();
        if (opcion == 1) {
            this.Menudealimentos();
        } else if (opcion == 2) {
            System.out.println("Ingrese el monto con el que va a pagar: ");
            pago = dakar.nextDouble();

            if (pago == 0) {
                System.out.println("Ingresa tu pago 😑 no puedes llevar gratis.");
            } else if (pago >= totalPagar) {
                double vuelto = pago - totalPagar;
                System.out.println("Pago completo.");

                if (vuelto > 0) {
                    vuelto = Math.round(vuelto * 100.0) / 100.0;
                    System.out.println("Su vuelto es: S/ " + vuelto);
                }this.procesodepago();
            } else {
                System.out.println("Monto insuficiente para el pago.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }
            public static void main (String[] args){
                Proyecto tiendadealimentos = new Proyecto();
                tiendadealimentos.Bienvenida();
            }
        }