import java.util.Scanner;

public class Categorias {
    Scanner dakar = new Scanner(System.in);

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

            switch(opcion) {
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
                    System.err.println("Saliendo del programa. ¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
        while(opcion != 5);
    }
}
