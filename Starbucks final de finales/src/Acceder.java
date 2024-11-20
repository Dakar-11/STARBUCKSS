import java.util.*;

public class Acceder {
    private Scanner dakar = new Scanner(System.in);
    private List<String> correos = new ArrayList<>();
    private List<String> contrasenas = new ArrayList<>();
    private List<String> nombres = new ArrayList<>();

    public void inicio() {
        int opcion;
        do {
            System.out.println("\nSSSSS   TTTTT   AAAAA   RRRRR    BBBBB   U   U   CCCCC   K   K  SSSSS");
            System.out.println("S         T     A   A   R   R    B   B   U   U   C       K  K   S");
            System.out.println("SSSSS     T     AAAAA   RRRRR    BBBBB   U   U   C       KKK    SSSSS");
            System.out.println("    S     T     A   A   R  R     B   B   U   U   C       K  K       S");
            System.out.println("SSSSS     T     A   A   R   R    BBBBB    UUU    CCCCC   K   K  SSSSS\n");
            System.out.println("\t\t\t\t\t\t\t    ( (");
            System.out.println("\t\t\t\t\t\t\t     ) )");
            System.out.println("\t\t\t\t\t\t\t  ........");
            System.out.println("\t\t\t\t\t\t\t  |      |]");
            System.out.println("\t\t\t\t\t\t\t  \\      /");
            System.out.println("\t\t\t\t\t\t\t   `----'");
            System.out.println("\033[31m\t\t\t\t\t   BIENVENIDO A STARBUCKS\033[0m\n");

            System.out.println("¡Usted puede acceder a la pagina de las siguientes maneras!\n");

            System.out.println("1. Inicio de sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Ingresar como invitado");
            System.out.println("4. Salir de la página");
            System.out.print("Selecciona una opción:\n ");
            opcion = solicitarNumero();

            switch (opcion) {
                case 1 -> sesion();
                case 2 -> registrarse();
                case 3 -> invitado();
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    public void sesion(){
        String nombre= "josetuterror@gmail.com";
        int contra=1234;
        System.out.println("Ingrese su correo electronico");
        dakar.nextLine();
        String correo=dakar.nextLine();
        System.out.println("Ingrese su contraseña");
        int contrasena= dakar.nextInt();
        if(nombre.equals(correo) && contra==contrasena){
            MenuPrincipal categorias = new MenuPrincipal();
            categorias.mostrarMenu();

        }
        else{
            System.err.println("Contraseña incorrecta");
            System.err.println("-Intentelo de nuevo-");

        }
    }

    public void registrarse() {
        System.out.print("Ingrese su primer nombre:\n ");
        dakar.nextLine();
        String nombre = dakar.nextLine();
        System.out.print("Ingrese su primer apellido:\n ");
        String apellido = dakar.nextLine();

        String dni = solicitarDato("Ingrese su DNI (8 dígitos):", "\\d{8}", "DNI inválido. Debe tener 8 dígitos.");
        String celular = solicitarDato("Ingrese su número de celular (9 dígitos):", "\\d{9}", "Número inválido. Debe tener 9 dígitos.");
        String correo = solicitarDato("Ingrese su correo electrónico:", "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", "Correo electrónico inválido.");

        if (correos.contains(correo)) {
            System.out.println("Este correo ya está registrado. Inténtelo con otro.");
            return;
        }

        System.out.print("Ingrese su contraseña: ");
        String contrasena = dakar.nextLine();

        correos.add(correo);
        contrasenas.add(contrasena);
        nombres.add(nombre + " " + apellido);

        System.out.println("¡Registro exitoso! Bienvenido, " + nombre + " " + apellido + ". Por favor, inicie sesión.");
    }

    public void invitado() {
        System.out.println("Usted está accediendo como invitado.");
        System.out.println("¿Cómo le gustaría que lo llamemos?");
        dakar.nextLine();
        String nombreInvitado = dakar.nextLine();

        System.out.println("¡Bienvenido, " + nombreInvitado + "!");
        MenuPrincipal.mostrarMenu();
    }

    private int solicitarNumero() {
        try {
            return dakar.nextInt();
        } catch (InputMismatchException e) {
            dakar.nextLine();
            return -1;
        }
    }

    private String solicitarDato(String mensaje, String regex, String error) {
        while (true) {
            System.out.println(mensaje);
            String input = dakar.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println(error);
            }
        }
    }

    public static void main(String[] args) {
        new Acceder().inicio();
    }
}
