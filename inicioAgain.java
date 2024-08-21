import java.util.Scanner;
public class inicioAgain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("cuantos numeros deseas agregar? ");
        int cuantos = scan.nextInt();
        System.out.println("1=suma, 2=resta, 3=producto, 4=division, 0=salir");

        int opcion = scan.nextInt();
        do {
        /* 
        operaciones.suma(cuantos);
        operaciones.resta(cuantos);
        operaciones.producto(cuantos);
        operaciones.division(cuantos); */
        switch(opcion){
            case 1:
                operaciones.suma(cuantos);
            break;
            case 2:
                operaciones.resta(cuantos);
            break;
            case 3:
                operaciones.producto(cuantos);
            break;
            case 4:
                operaciones.division(cuantos);
            break;
            default:
                System.out.println("esa no te la manejamos mi rey");
            break;
        }
        System.out.println("1=suma, 2=resta, 3=producto, 4=division, 0=salir");
        opcion = scan.nextInt();
        } while (opcion !=0);
    System.out.println("gracias por jugar");
        
    }
}

class operaciones{
    public static void suma(int a){
        Scanner scan=new Scanner(System.in);
        int [] num = new int [100];
        int suma=0;
        for (int i=0; i<a; i++){
            int x=i+1;
            System.out.print("Ingrese el numero "+x+": ");
            num[i]=scan.nextInt();
            suma+=num[i];
        }
        System.out.println("La suma total es: "+suma);
    }
    
    public static void resta(int a){
        Scanner scan=new Scanner(System.in);
        int [] num = new int [100];
        int resta=0;
        for (int i=0; i<a; i++){
            int x=i+1;
            System.out.print("Ingrese el numero "+x+": ");
            num[i]=scan.nextInt();
            resta-=num[i];
        }
        System.out.println("La resta total es: "+resta);
        
    }
    
    public static void producto(int a){
        Scanner scan=new Scanner(System.in);
        int [] num = new int [100];
        int producto=1;
        for (int i=0; i<a; i++){
            int x=i+1;
            System.out.print("Ingrese el numero "+x+": ");
            num[i]=scan.nextInt();
            producto*=num[i];
        }
        System.out.println("El producto total es: "+producto);
        
    }
    
    public static void division(int a){
        Scanner scan=new Scanner(System.in);
        int [] num = new int [100];
        int divs=1;
        for (int i=0; i<a; i++){
            int x=i+1;
            System.out.print("Ingrese el numero "+x+": ");
            num[i]=scan.nextInt();
            divs/=num[i];
        }
        System.out.println("La division total es: "+divs);

    }

}


    
