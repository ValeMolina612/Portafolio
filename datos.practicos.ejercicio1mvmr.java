public class datos_practicos_ejercicio1mvmr {
    public static void main(String[] args) {
               int K = 8;
        
        System.out.println("=== FASE 1: Arreglo Unidimensional ===");
        int[] lecturas = {10, -5, 20, K * 2, -1, 30, 0, 15};
        
        /* 
         Tarea 1.2 (Justificación teórica): 
         El error original (ArrayIndexOutOfBoundsException) ocurría porque la propiedad 
         .length devuelve el número total de elementos (en este caso 8), pero los índices 
         en Java están basados en cero (van desde 0 hasta length - 1). Al iniciar 'i' en 
         lecturas.length (8), el primer acceso intentaba leer lecturas[8], el cual no existe 
         y lanza la excepción. La corrección consiste en iniciar 'i' en lecturas.length - 1.
         */
        // Tarea 1.1: Bucle corregido para recorrer en orden inverso sin errores de límites
        for (int i = lecturas.length - 1; i >= 0; i--) {
            if (lecturas[i] > 0) {
                System.out.println("Lectura positiva: " + lecturas[i]);
            }
        }
        
        System.out.println("\n=== FASE 2: Arreglo Bidimensional (Jagged Array) ===");
        int[][] ventas = new int[3][];
        ventas[0] = new int[K];     // Vendedor 1 (tamaño 8)
        ventas[1] = new int[K + 1]; // Vendedor 2 (tamaño 9)
        ventas[2] = new int[2];     // Vendedor 3 (tamaño 2)
        
        // Tarea 2.1: Recorrido usando ventas[i].length para evitar fallos por filas de menor tamaño
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = (i + 1) * (j + 1);
            }
        }
        
        // Tarea 2.2: Mostrar en consola la suma total de elementos de la matriz irregular
        int sumaTotal = 0;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                sumaTotal += ventas[i][j];
            }
        }
        System.out.println("Suma total de elementos en la matriz irregular: " + sumaTotal);
        
        /*
         Tarea 2.3 (Pregunta conceptual):
         ¿Cuál es la ventaja de memoria de un Jagged Array sobre una matriz tradicional de N x M?
         La principal ventaja es la optimización de memoria. En una matriz tradicional 
         rectangular y se reserva un bloque de memoria fijo basado en la fila más larga, 
         */
         
        System.out.println("\n=== FASE 3: Arreglo Tridimensional y For-Each ===");
        int[][][] cubo = new int[2][K][K];
        
        // Inicialización rápida
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < K; j++) {
                for(int k = 0; k < K; k++) {
                    cubo[i][j][k] = i + j + k + 1;
                }
            }
        }
        
        /*
          Tarea 3.1: 
         */
         
        /*
         * Tarea 3.2: Refactorización utilizando la sintaxis mejorada for-each (for reforzado) 
         * para recorrer el arreglo tridimensional.
         */
        int contadorMúltiplos = 0;
        int iIdx = 0;
        for (int[][] matriz2D : cubo) {
            int jIdx = 0;
            for (int[] fila1D : matriz2D) {
                int kIdx = 0;
                for (int valor : fila1D) {
                    if (valor % 3 == 0) {
                        System.out.println("Múltiplo encontrado (" + valor + ") en índices: " + iIdx + "," + jIdx + "," + kIdx);
                        contadorMúltiplos++;
                    }
                    kIdx++;
                }
                jIdx++;
            }
            iIdx++;
        }
        System.out.println("Total de múltiplos de 3 encontrados: " + contadorMúltiplos);
        
        /*
         Tarea 3.3 (Análisis crítico):
         ¿Qué limitación tiene el bucle for-each en Java respecto a los arreglos tridimensionales 
         si la tarea fuera modificar los valores dentro del arreglo en lugar de solo leerlos?
         El bucle for-each opera sobre una copia local temporal de cada elemento primitivo. 
         Modificar la variable de iteración dentro del bucle solo altera esa copia temporal y no afecta 
         los datos originales almacenados.         */
    }
}