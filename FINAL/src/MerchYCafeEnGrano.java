import java.util.Scanner;
public class MerchYCafeEnGrano {
    Scanner dakar=new Scanner(System.in);
    public double subtotal, igv, totalpagar = 0, cant,precio, pago;
    public double producto,vuelto;
    public void menuprincipal() {
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
                    Productos llamado1 = new Productos();
                    llamado1.bebidas();
                    break;
                case 2:
                    System.out.println("Seleccionó Alimentos.");
                    Proyecto llamado2 = new Proyecto();
                    llamado2.Menudealimentos();

                    break;
                case 3:
                    System.out.println("Seleccionó Merch y Café en Grano");
                    MerchYCafeEnGrano llamado3 = new MerchYCafeEnGrano();
                    llamado3.MechyCaféenGrano();
                    break;
                case 4:
                    System.out.println("Seleccionó Packs y Boxes");
                    Productos llamado4 = new Productos();
                    llamado4.packs();
                    break;

                case 5:
                    System.out.println("Saliendo del programa. ¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    return;
            }
        }
        while (opcion != 5);
    }
    public void MechyCaféenGrano() {
        System.out.println("⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬⏬");
        System.out.println("⏩⏩--BIENVENIDO A LA CATEGORIA DE MERCH Y CAFE EN GRANO--⏪⏪");
        System.out.println("⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫⏫");
        System.out.println("");
        System.out.println("Seleccione cual de estas opciones va a querer");
        System.out.println("➡opcion 1: Merch");
        System.out.println("➡opcion 2: Cafe en Grano");
        System.out.println("➡opcion 3: regrasar a categorias");
        int opcion = dakar.nextInt();
        switch (opcion) {
            case 1:

                this.Merch();
                break;
            case 2:

                this.CafeenGrano();

                break;
            case 3:
                this.regreso();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public void regreso() {
        System.out.println("¿ESTA SEGURO QUE DESEA SALIR?");
        System.out.println("1.Si \n2.No");
        int opcion = dakar.nextInt();
        if (opcion == 1) {
            this.menuprincipal();
        } else if (opcion == 2) {
            System.out.println("usted tiene en su canasta un valor de:" + totalpagar);
            this.MechyCaféenGrano();
        }
    }
    public void Merch() {
        System.out.println("===================================================");
        System.out.println("TEWNEMOS LOS SIGUIENTES PRODUCTOS");
        System.out.println("1. Prensa Francesa s/160.00");
        System.out.println("2. Prensa Cold Brew s/160.00");
        System.out.println("3. Prensa Pour Over s/80.00");
        System.out.println("4. Reusable Aniversario 20 años s/25.00");
        System.out.println("5. Vaso Blanco Reusable Sirena Blanca-16oz s/25.00");
        System.out.println("----Elija una de estas opciones----");
        int opcion= dakar.nextInt();
        switch (opcion) {
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
            default:
                System.out.println("Opcion no valida");

        }

    }
    public void PrensaFrancesa() {
        System.out.println("¿Cuantos Prensa Francesa va a querer?");
        cant += dakar.nextInt();
        precio += 160.00;
        producto += 160.00 * cant;
        igv = producto * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public void PremsaColdBrew(){
        System.out.println("¿Cuantos Prensa Cold Brew va a querer?");
        cant += dakar.nextInt();
        precio += 160.00;
        producto += 160.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();

    }
    public  void PourOver(){
        System.out.println("¿Cuantos Prensa Pour Over va a querer?");
        cant += dakar.nextInt();
        precio += 80.00;
        producto += 80.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void Aniversario20años(){
        System.out.println("¿Cuantos reusable Aniversario 20 Años va a querer?");
        cant += dakar.nextInt();
        precio += 25.00;
        producto += 25.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();

    }
    public void VasoBlancoReusable(){

        System.out.println("¿Cuantos Vaso Blanco Reusable Sirena Blanca-16oz va a querer?");
        cant += dakar.nextInt();
        precio += 25.00;
        producto += 25.00 * cant;
        igv = producto * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public void CafeenGrano(){
        System.out.println("============================================");
        System.out.println("TENEMOS LOS SIGUIENTES PRODUCTOS");
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
                this.Verona();
                break;
            case 4:
                this.AnniversaryBlend();
                break;
            case 5:
                this.Sumatra();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public  void Peru(){
        System.out.println("¿Cuantos Peru va a querer?");
        cant += dakar.nextInt();
        precio += 37.00;
        producto += 37.00 * cant;
        igv = (producto * 1) * 0.18;
        subtotal = (producto * 1) - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void ExpressoRoast() {
        System.out.println("¿Cuantos Expreso Roast va a querer?");
        cant += dakar.nextInt();
        precio += 37.00;
        producto += 37.00 * cant;
        igv = producto * 0.18;
        subtotal = producto - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();

    }
    public  void Verona() {
        System.out.println("¿Cuantos Verona va a querer ?");
        cant += dakar.nextInt();
        precio += 37.00;
        producto += 37.00 * cant;
        igv = producto * 0.18;
        subtotal = producto - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void AnniversaryBlend() {
        System.out.println("¿Cuantos Anniversary Blend 250gr. va a querer?");
        cant += dakar.nextInt();
        precio += 37.00;
        producto += 37.00 * cant;
        igv = producto  * 0.18;
        subtotal = producto  - igv;
        totalpagar = subtotal + igv;
        this.Mascompras();
    }
    public  void Sumatra() {
        System.out.println("¿Cuantos Sumatras va a querer?");
        cant += dakar.nextInt();
        precio += 37.00;
        producto += 37.00 * cant;
        igv = producto * 0.18;
        subtotal = producto - igv;
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
                vuelto = pago - totalpagar;
                System.out.println("=============================");
                System.out.println("Pago completo.");
                if (vuelto > 0) {
                    vuelto = Math.round(vuelto * 100.0) / 100.0;
                    System.out.println("Su vuelto es: S/ " + vuelto);
                    System.out.println("Generando boleta...");
                    System.out.println("");
                    System.out.println("=============================");
                    System.out.println("------ BOLETA DE VENTA ------");
                    System.out.println("Subtotal: S/" + subtotal);
                    System.out.println("IGV (18%): S/" + (Math.round(igv * 100.0) / 100.0));
                    System.out.println("-----------------------------");
                    System.out.println("Monto total: S/" + totalpagar);
                    System.out.println("==============================");
                    System.out.println("Usted compro una cantidad de: " + (Math.round(cant * 100) / 100) + " productos.");
                    for (int i = 1; i <= cant; i++) {
                        System.out.print("🧋");
                    }
                    System.out.println("");
                    System.out.println("==============================================");
                    System.out.println("Gracias por su compra, vuelva pronto.");
                    System.exit(0);
                }
            } else {
                System.out.println("Monto insuficiente para el pago.");
                System.out.println("intente su compra nuevamente");
                this.Mascompras();
            }

        }
    }
    public static void main (String[]args){
        MerchYCafeEnGrano tiendademerch = new MerchYCafeEnGrano();
        tiendademerch.MechyCaféenGrano();
    }
}

