import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Se inicializan las varianles
        double suma;
        double resta;
        double multiplicacion;
        double division;
        int calculadora = 1;
        //Se entra en un bucle do-while en donde se sale cuando el usuario desee salir de la calculadora
        do {
            //El usuario ingresa los valores
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            System.out.print("Quiere hacer una suma, una resta, una multiplicación o una división?[s/r/m/d]");
            char eleccion = sc.next().charAt(0);
            if (eleccion == 's') { //Sección suma
                suma = num1 + num2;
                System.out.println("El resultado de la suma es: " + suma);
            } else if (eleccion == 'r') { //Sección resta
                resta = num1 - num2;
                System.out.println("El resultado de la resta es: " + resta);
            } else if (eleccion == 'm') { //Sección multiplicación
                multiplicacion = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + multiplicacion);
            } else if (eleccion == 'd') { //Sección división
                if (num1 != 0) {
                    division = num1 / num2;
                    System.out.println("El resultado de la división es: " + division);
                } else { //Estructura de error por si el num1 es igual a 0
                    System.out.print("Error: no se puede dividir por 0");
                }
            }
            System.out.print("Desea salir de la calculador? si desea salir ingrese 0, si no cualquier número: ");
            calculadora = sc.nextInt(); //Aqui el usuario decide si salir o seguir en la calculadora
        }
        while (calculadora != 0);
        System.out.print("Hasta luego, que tengas un buen día"); //Mensaje de despedida
    }
}
