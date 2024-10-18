import java.util.Scanner;
public class Acceder{
    Scanner dakar= new Scanner(System.in);

    public void inicio(){
        int opcion;
        do{
            System.out.println("STARBUCKS");
            System.out.println("Opcion 1: inicio de sesion");
            System.out.println("Opcion 2: registrarse");
            System.out.println("Opcion 3: modo invitado");
            System.out.println("Opcion 4: salir de la pagina");
            opcion= dakar.nextInt();
            switch (opcion){
                case 1:
                    this.sesion();
                    break;
                case 2:
                    this.registrarse();
                    break;
                case 3:
                    this.invitado();
                    break;
                default:
                    System.err.println("Saliendo del programa....");
            }
        }
        while(opcion!=4);
    }
    public void sesion(){
        String nombre= "josetuterror";
        int contra=1234;
        System.out.println("Ingrese su correo electronico");
        dakar.nextLine();
        String correo=dakar.nextLine();
        System.out.println("Ingrese su contraseña");
        int contrasena= dakar.nextInt();
        if(nombre.equals(correo) && contra==contrasena){
            Categorias categorias = new Categorias();
            categorias.menuprincipal();

        }
    }
    public void registrarse(){
        System.out.println("Ingrese su primer nombre ");
        dakar.nextLine();
        String name= dakar.nextLine();
        System.out.println("primer apellido");
        String apellido= dakar.nextLine();
        int dni = 0;
        while (true) {
            System.out.println("Ingrese su DNI (8 dígitos):");
            String dniInput = dakar.nextLine();

            if (dniInput.length() == 8 && dniInput.matches("\\d+")) {
                dni = Integer.parseInt(dniInput);
                break;
            } else {
                System.out.println("DNI inválido. Debe tener exactamente 8 dígitos.");
            }
        }
        int numero = 0;
        while (true) {
            System.out.println("Ingrese su numero de celular (9 dígitos):");
            String dniInput = dakar.nextLine();

            if (dniInput.length() == 9 && dniInput.matches("\\d+")) {
                numero = Integer.parseInt(dniInput);
                break;
            } else {
                System.out.println("numero inválido. Debe tener exactamente 9 dígitos.");
            }
        }
        String correo1 = "";
        while (true) {
            System.out.println("Ingrese su correo electrónico (debe terminar con @gmail.com):");
            correo1 = dakar.nextLine();

            if (correo1.endsWith("@gmail.com")) {
                break;
            } else {
                System.out.println("Correo electrónico inválido. Debe terminar con @gmail.com.");
            }
        }
        System.out.println("Ingrese su contraseña");
        int contrasena1= dakar.nextInt();
        System.out.println("----Cuenta de Starbucks creado correctamente----");
        System.out.println("Ingrese su correo electronico");
        dakar.nextLine();
        String correo2= dakar.nextLine();
        System.out.println("Ingrese su contraseña");
        int contrasena2= dakar.nextInt();
        if(correo1.equals(correo2) && contrasena1==contrasena2){
            Categorias categorias = new Categorias();
            categorias.menuprincipal();
        }
        else{
            System.err.println("¡error! correo no valido, registrese de nuevo");
                System.exit(0);
        }
    }
    public void invitado(){
        System.out.println("Usted esta accediendo como invitado....");
        Categorias categorias = new Categorias();
        categorias.menuprincipal();
    }
    public static void main(String[] args){
        Acceder acceder= new Acceder();
        acceder.inicio();


    }
}