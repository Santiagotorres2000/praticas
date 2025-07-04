 import java.util.Scanner;

public class PraticasCondicionales {
    public static void main(String[] args) {
// El programa debe mostrar un menú de opciones al usuario en la consola. El menú debe incluir al menos las siguientes opciones:
// Calcular Área de una Figura (subopción: Círculo o Rectángulo).
// Calcular edad futura.
// Verificar si un Número es Primo.
// Salir del programa.
        Scanner entrada = new Scanner(System.in);
        var salir = false;
        final double PI = 3.141592653589793;
        Boolean esPrimo = true;
        

        while (!salir) {
            System.out.println("1. Calcular Área de una Figura");
            System.out.println("2. Calcular la edad futura");
            System.out.println("3. Verificar si un numero es primo");
            System.out.println("4. Salir");
            System.out.print("Escoja una de las opciones: " );
            int opcion =entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1: System.out.println("1. Area de circulo");
                System.out.println("2. Area de un Rectangulo");
                System.out.print("Escoja una de las opciones: ");
                int opcionFigura = entrada.nextInt();
                if (opcionFigura == 1) {
                    System.out.print("ingrese el Radio del circulo");
                    double radio = entrada.nextDouble();
                    double resultadoRadio = PI * radio * radio;
                    System.out.println("El area del circulo es: "+ resultadoRadio);
                    
                } else 
                System.out.print("ingrese la base del rectangulo: ");
                double base = entrada.nextDouble();
                System.out.print("ingrese la altura del rectagunlo: ");
                double altura = entrada.nextDouble();
                double resultadoRectangulo = base * altura;
                System.out.println("el area del rectangulo es: " + resultadoRectangulo);

                break;
                
                case 2: System.out.print("Ingrese su edad actual: ");
                int edad = entrada.nextInt();
                System.out.print("ingrese la cantidad de anos que deseas avanzar en el futuro: ");
                int edadFutura = entrada.nextInt();
                int resultadoEdad = edad + edadFutura;
                System.out.println("su edad en un futuro es de: " + resultadoEdad);

                break;

                case 3: System.out.print("ingrese un numero: ");
                int numero = entrada.nextInt();
                 if (numero <= 1) {
                    esPrimo = false;
                }
                else {
                    for (int i = 2; i <= numero / 2; i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                if (esPrimo) {
                    System.out.println(numero + " es un número primo.");
                } else {
                     System.out.println(numero + " no es un número primo.");
                    }
                    break;

                    case 4: 
                        System.out.println("saliendo del menu...");
                        salir = true;
                        break;
                        
                    default: 
                        System.out.println("opcion invalida ");
                        break;
                }
                entrada.close();

            }
          

    
    }
}

