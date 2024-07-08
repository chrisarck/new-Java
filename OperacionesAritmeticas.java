public class OperacionesAritmeticas{
    //Declaracion de constantes generales (con static)
    final static double pi = 3.1416;
    public static void main(String[] args) {
        int num1, num2, resultado;
        num1 = 15;
        num2 = 3;

        //suma
        resultado = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);

        //resta
        resultado = num2 - num1;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + Math.abs(resultado)); //Math.abs(parametro) se encarga de devolver el valor absoluto

        //multiplicacion
        resultado = num1 * num2 ;
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + resultado);
        
        //division
        resultado = num1 / num2;
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + resultado);

        //declaracion de constantes locales (sin static)
        final int uno = 2;
        final String nombre = "Pepe";
        System.out.println(uno);
        System.out.println(nombre);
        System.out.println(pi);

        //conversion entre tipos de datos
        byte bdato = 2;
        int idato = 7;
        double ddato = 0;

        idato = (int) bdato;
        ddato = (double) (idato * bdato);
        System.out.println(ddato);

        //raiz cuadrada
        double raizcuadrada, n = 345;
        raizcuadrada = Math.sqrt(n);
        System.out.println("La raiz cuadrada de 345 es: " + raizcuadrada) ;

        //raiz cubica
        double cubo = 8;
        double raizcubica = Math.cbrt(cubo);
        System.out.println(raizcubica);

        //elevar a enesima potencia 8 = base y 2 = exponente
        double pote = (double) Math.pow(8,2);
        System.out.println("La potencia es: " + pote);
    
    }
}