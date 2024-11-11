import java.util.Scanner;
public class Proyecto {
    public int opcion = 0, cantidad = 0;
    public double subtotal = 0, igv = 0, totalPagar = 0, pago = 0;
    String[] categorias = {"Pastries", "Postres", "Sandwiches"};
    String[][] productos = {
            {"Banana Bread", "Muffin de Naranja", "Keke de Zanahoria", "Galleta Cranberry", "Keke de Limón", "Galleta de Chocochips", "Muffin de Berries", "Egg Bites de Jamón y Queso"},
            {"Crocante de Manzana Vegetal", "Cake Pop Vainilla", "Cheesecake de Chocolate", "Cheesecake de Arándanos", "Brownie de Cookies & Cream", "Torta de Chocolate"},
            {"Sandwich Italiano", "Croissant de Mantequilla", "Croissant de Jamón Serrano y Queso", "Croissant Jamón del País y Queso", "Croissant Jamón Inglés y Queso", "Sandwich Chicken Pesto Parmesano", "Empanada de Lomo"}
    };
    double[][] precios = {
            {8.00, 9.00, 9.00, 5.50, 9.00, 5.50, 9.00, 9.00},
            {15.00, 6.50, 15.00, 15.00, 8.50, 12.50},
            {14.00, 5.50, 15.50, 15.50, 15.50, 15.50, 9.50}
    };
    int[][] carrito = new int[3][];

    Scanner ZEUS = new Scanner(System.in);

    public Proyecto() {
        for (int i = 0; i < carrito.length; i++) {
            carrito[i] = new int[productos[i].length];
        }
    }
    public void Bienvenida() {
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐BIENVENIDO A LA SECCIÓN DE ALIMENTOS⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println(" ");
        this.Menudealimentos();
    }
    public void Menudealimentos() {
        System.out.println("SELECCIONE UNA CATEGORÍA DE PRODUCTOS:");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i]);
        }
        System.out.println("4. Regresar🔙");
        opcion = ZEUS.nextInt() - 1;
        if (opcion >= 0 && opcion < categorias.length) {
            this.Categoriadealimentos(opcion);
            this.Mascompras();
        } else if (opcion == 3) {
            System.out.println("¿Está seguro de que desea salir?");
            System.out.println("Usted ya tiene en su canasta un valor de: " + totalPagar + " soles");
            System.out.println("1. Sí \n2. No");
            opcion = ZEUS.nextInt();
            if (opcion == 1) {
                System.out.println("Gracias por visitarnos. ¡Hasta pronto!");
            } else {
                this.Menudealimentos();
            }
        } else {
            System.out.println("Opción no válida.");
            this.Menudealimentos();
        }
    }
    public void Categoriadealimentos(int categoria) {
        System.out.println("-------------- " + categorias[categoria]+" --------------");
        for (int i = 0; i < productos[categoria].length; i++) {
            System.out.println((i + 1) + ". " + productos[categoria][i] + " - S/ " + precios[categoria][i]);
        }
        System.out.println("Seleccione el producto que desea comprar: ");
        int producto = ZEUS.nextInt() - 1;
        if (producto >= 0 && producto < productos[categoria].length) {
            System.out.println("Ingrese la cantidad que desea comprar:");
            cantidad = ZEUS.nextInt();
            carrito[categoria][producto] += cantidad;
            double precioProducto = precios[categoria][producto] * cantidad;
            subtotal += calcularSubtotalSinIGV(precioProducto);
            igv += precioProducto - calcularSubtotalSinIGV(precioProducto);
            totalPagar += precioProducto;
        } else {
            System.out.println("Producto no válido.");
        }
    }
    public double calcularSubtotalSinIGV(double precio) {
        return precio / 1.18;
    }
    public double procesodePago() {
        System.out.println("Su Boleta de venta está siendo generada...");
        System.out.println("➡ Subtotal: S/ " + (Math.round(subtotal * 100.0) / 100.0));
        System.out.println("➡ IGV (18%): S/ " + (Math.round(igv * 100.0) / 100.0));
        System.out.println("Total a pagar: S/ " + (Math.round(totalPagar * 100.0) / 100.0));
        System.out.println("Gracias por su compra, vuelva pronto!");
        System.exit(0);
        return totalPagar;
    }
    public void Mascompras() {
        System.out.println("Usted tiene en su canasta un valor de: " + totalPagar + " soles");
        System.out.println("¿Desea comprar algo más?");
        System.out.println("1. Sí \n2. No");
        opcion = ZEUS.nextInt();
        if (opcion == 1) {
            this.Menudealimentos();
        } else if (opcion == 2) {
            System.out.println("Ingrese el monto con el que va a pagar: ");
            pago = ZEUS.nextDouble();

            if (pago >= totalPagar) {
                double vuelto = pago - totalPagar;
                System.out.println("Pago completo.");
                if (vuelto > 0) {
                    System.out.println("Su vuelto es: S/ " + Math.round(vuelto * 100.0) / 100.0);
                }
                this.procesodePago();
            } else {
                System.out.println("Monto insuficiente para el pago.");
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }
    public static void main(String[] args) {
        Proyecto tiendaAlimentos = new Proyecto();
        tiendaAlimentos.Bienvenida();
    }
}