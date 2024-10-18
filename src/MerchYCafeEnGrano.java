import java.util.Scanner;
public class MerchYCafeEnGrano {
    Scanner dakar=new Scanner(System.in);
    public double subtotal, igv, totalpagar = 0, cant,precio, pago;
    public double producto;
    public void mostrarMenuPrincipal() {
        int opcion;

        do {
            System.out.println("---- BIENVENIDO AL MENU PRINCIPAL ----");
            System.out.println("Seleccione una de estas categorias:");
            System.out.println("1. Bebidas");
            System.out.println("2. Alimentos");
            System.out.println("3. Merch y Café en Grano");
            System.out.println("4. Packs y Boxes");
            System.out.println("5. Salir");
            opcion = dakar.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionó Bebidas.");
                    break;
                case 2:
                    System.out.println("selecciono comidas");

                    break;
                case 3:
                    System.out.println("Seleccionó Merch y Café en Grano.");
                    this.MechyCaféenGrano();
                    break;
                case 4:
                    System.out.println("Seleccionó Packs y Boxes.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);
    }
    public void MechyCaféenGrano(){
        System.out.println("--VIENVENNIDO A LA CATEGORIA DE MERCH Y CAFE EN GRANO--");
        System.out.println("Seleccione cual de estas opciones va a querer");
        System.out.println("opcion 1: Merch");
        System.out.println("opcion 2: Cafe en Grano");
        int opcion=dakar.nextInt();
        switch (opcion){
            case 1:

                this.Merch();
                break;
            case 2:

                this.CafeenGrano();

                break;
        }
    }
    public void Merch(){
        System.out.println("Tenemos los siguientes productos");
        System.out.println("1. Prensa Francesa s/160.00");
        System.out.println("2. Prensa Cold Brew s/160.00");
        System.out.println("3. Prensa Pour Over s/80.00");
        System.out.println("4. Reusable Aniversario 20 años s/25.00");
        System.out.println("5. Vaso Blanco Reusable Sirena Blanca-16 oz s/25.00");
        System.out.println("----Elija una de estas opciones----");
        int opcion= dakar.nextInt();
        switch (opcion){
            case 1:
                this.PrensaFrancesa();
                break;
            case 2:
                this.PremsaColdBrew();
                break;
            case 3:
                this.PourOver();
                break;
            case 4:
                this.Aniversario20años();
                break;
            case 5:
                this.VasoBlancoReusable();
                break;
        }

    }
    public void PrensaFrancesa() {
        System.out.println("¿Cuantos Prensa Francesa va a querer?");
        int cant = dakar.nextInt();
        precio = 160.00;
        double PrensaFrancesa = 160.00 * cant;
        igv = (PrensaFrancesa * 1) * 0.18;
        subtotal = (PrensaFrancesa * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public void PremsaColdBrew(){
        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 160.00;
        double PrensaColdBrew = 160.00 * cant;
        igv = (PrensaColdBrew * 1) * 0.18;
        subtotal = (PrensaColdBrew * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();

    }
    public  void PourOver(){
        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 80.00;
        producto = 80.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void Aniversario20años(){
        int cant = dakar.nextInt();
        precio = 25.00;
        producto = 25.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();

    }
    public void VasoBlancoReusable(){

        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 25.00;
        producto = 25.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public void CafeenGrano(){
        System.out.println("Tenemos los siguientes productos");
        System.out.println("1. Perú S/37.00");
        System.out.println("2. Expresso Roast S/37.00");
        System.out.println("3. Verona S/37.00");
        System.out.println("4. Anniversary Blend 250 gr. S/37.00");
        System.out.println("5. Sumatra S/37.00");
        System.out.println("Elija una de estas opciones");
        int opcion = dakar.nextInt();
        switch (opcion) {
            case 1:
                this.Peru();
                break;
            case 2:
                this.ExpressoRoast();
                break;
            case 3:
                this.Veona();
                break;
            case 4:
                this.AnniversaryBlend();
                break;
            case 5:
                this.Sumatra();
                break;
        }
    }
    public  void Peru(){
        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 37.00;
        producto = 37.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void ExpressoRoast() {
        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 37.00;
        producto = 37.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();

    }
    public  void Veona() {
        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 37.00;
        producto = 37.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void AnniversaryBlend() {
        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 37.00;
        producto = 37.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void Sumatra() {
        System.out.println("¿Cuantos Prensa Cold Brew?");
        int cant = dakar.nextInt();
        precio = 37.00;
        producto = 37.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public void Mascompras() {
        System.out.println("¿DESEA COMPARA ALGO MAS?");
        System.out.println("1. SI \n2. N0");
        int opcion = dakar.nextInt();
        if (opcion == 1) {
            this.MechyCaféenGrano();
        } else {
            System.out.println("Ingrese el monto con el que va a pagar: ");
            pago = dakar.nextDouble();

            if (pago == 0) {
                System.out.println("Ingresa tu pago 😑 no puedes llevar gratis.");
            } else if (pago >= precio) {
                double vuelto = pago - precio;
                System.out.println("Pago completo.");

                if (vuelto > 0) {
                    vuelto = Math.round(vuelto * 100.0) / 100.0;
                    System.out.println("Su vuelto es: S/ " + vuelto);
                }
            } else {
                System.out.println("Monto insuficiente para el pago.");
            }
            System.out.println("Generando boleta...");
            System.out.println("------ BOLETA DE VENTA ------");
            System.out.println("Total de productos $/" + totalpagar);
            System.out.println("Subtotal: S/" + subtotal);
            System.out.println("IGV (18%): S/" + (Math.round(igv * 100.0) / 100.0));
            System.out.println("-----------------------------");
            System.out.println("Monto total: S/" + totalpagar);
            System.out.println("Gracias por su compra.");
            for (int i = 1; i <= cant; i++) {
                System.out.print("🧋");
            }
            System.out.println("");
            System.exit(0);
        }
   }
    public static void main (String[]args){
        MerchYCafeEnGrano tiendademerch = new MerchYCafeEnGrano();
        tiendademerch.mostrarMenuPrincipal();
    }
}
