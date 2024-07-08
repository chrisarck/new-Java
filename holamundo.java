
import java.util.Scanner;
public class holamundo { //clase publica
    public static void main(String[] args) { //metodo llamado main
        System.out.println("Cuantos numeros desea ingresar? ");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] num = new int[100];
        int suma = 0;

        for (int i=0, j=1 ; i<n; i++, j++){
            System.out.print("Numero " + j + ": ");
            num[i] = scan.nextInt();
            suma += num[i];
        }
        System.out.println();
        System.out.println("Numeros obtenidos.");

        for (int i=0, j=1 ; i<n; i++, j++){
            System.out.println("Numero " + j + ": " + num[i]);
        }
      
        System.out.println("La suma de los " + n + " numeros es igual a = " + suma);
    }

}
