import java.util.Scanner;

// Definimos la clase pública
public class Combinaciones {

    // método main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        // Llama al método que calcula C(m, n)
        int resultado = combinacion(m, n);

        System.out.println("C(" + m + ", " + n + ") = " + resultado);
    }

    // metodo recursivo para calcular el factorial
    public static int factorial(int x) {
        // caso base
        if (x == 0) {
            return 1;
        }
        // recursividad directa
        return x * factorial(x - 1);
    }

    // metodo combinacion
    public static int combinacion(int m, int n) {
        
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}
