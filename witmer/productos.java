import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class productos {
    Scanner fernando = new Scanner(System.in);
    String [] CoffeeforShare={"Coffe traveler","Pack coffe Mixto","Pack coffe sandwich","Pack coffe galleta"};
    String [] Desayunos={"Duo desayunos","Desayunos para dos "};
    String [] AntojosenlaTarde={"Muffins 4 share","Momentos dulces","Sweet & Share"};
    Random jose = new Random();
    double [] precios_CoffeeforShare={60,120,135,95};
    double [] precios_Desayunos={11,30};
    double [] precioc_AntojosenlaTarde={32,14,26};
    double igv, subtotal,totalpagar;
    int [] canastaCoffeeforShare = new int[CoffeeforShare.length];
    int [] canastaDesayunos = new int[Desayunos.length];
    int [] canastaAntojosenlaTarde = new int[AntojosenlaTarde.length];
    String respuesta;
    int opcion, cantidad;

    public void Menu(){
        System.out.println("--------PACKS Y BOXES--------");
        System.out.println("Coffee for Share: 1");
        System.out.println("Desayunos:2");
        System.out.println("Antojos de la tarde:3");
        opcion= jose.nextInt();
        jose.nextInt();
        switch (opcion){
            case 1:
                this.CoffeeforShare();
                break;
            case 2:
                this.Desayunos();
                break;
            case 3:
                this.AntojosenlaTarde();
                break;
            default:
                System.out.println("Opcion no valida intentelo de nuevo ");
                this.Menu();
                break;
        }
    }
    public void CoffeeforShare(){
        System.out.println("----Coffee for Share----");
        System.out.println("Que desea comprar");

        for (int i=0;i<CoffeeforShare.length;i++){
            System.out.println("Opcion"+(i+1)+":"+CoffeeforShare);
        }
        opcion=jose.nextInt();
        jose.nextInt();
        switch (opcion){
            case 1:
                System.out.println("¿Cuantos deseas llevar?");
                System.out.println("Escoja la cantidad");
                cantidad= jose.nextInt();
                canastaCoffeeforShare[0]+=cantidad;
                System.out.println("Su orden es : "+canastaCoffeeforShare[0]+"CoffeeforShare de : "+CoffeeforShare[0]);
                System.out.println("deseas eliejir otra producto o bebida :1SI :2NO :MENU ");
                opcion= jose.nextInt();
                jose.nextInt();
                 if (opcion==1){
                     System.out.println("Volviendo a la opción de compra");
                     this.CoffeeforShare();
                 } else if (opcion==2) {
                     this.pagoCoffeeforShare();
                 }



                 }

        }


    }





}