import java.util.Scanner;
public class Acceder{
    Scanner dakar= new Scanner(System.in);

    public void inicio(){
        System.out.println("STARBUCKS");
        System.out.println("Opcion 1: inicio de sesion");
        System.out.println("Opcion 2: registrarse");
        System.out.println("Opcion 3: modo invitado");
        int opcion= dakar.nextInt();
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
        }

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
        String name= dakar.nextLine();
        System.out.println("primer apellido");
        String apellido= dakar.nextLine();
        System.out.println("Ingrese su DNI");
        int dni= dakar.nextInt();
        System.out.println("Ingrese su numero de telefono");
        int telefono= dakar.nextInt();
        System.out.println("Ingrese su correo electronico");
        String correo1= dakar.nextLine();
        System.out.println("Ingrese su contraseña");
        int contrasena1= dakar.nextInt();
        System.out.println("----Cuenta de Starbucks creado correctamente----");
        System.out.println("Ingrese su correo electronico");
        String correo2= dakar.nextLine();
        System.out.println("Ingrese su contraseña");
        int contrasena2= dakar.nextInt();
        if(correo1.equals(correo2) && contrasena1==contrasena2){
            Categorias categorias = new Categorias();
            categorias.menuprincipal();
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