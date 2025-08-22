
package bebecitaua;

public class Class2 {

    // Método de ordenamiento por inserción
    public static void insercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Mover los elementos mayores que key una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Arreglo con tiempos de entrega en minutos
        int[] tiempos = {45, 30, 50, 25, 60, 40, 35};

        // 1. Recorrer y mostrar todos los tiempos
        System.out.print("Tiempos de entrega registrados: ");
        for (int i = 0; i < tiempos.length; i++) {
            System.out.print(tiempos[i] + " ");
        }

        // 2. Calcular promedio, mínimo y máximo
        int suma = 0;
        int menor = tiempos[0];
        int mayor = tiempos[0];

        for (int i = 0; i < tiempos.length; i++) {
            suma += tiempos[i];
            if (tiempos[i] < menor) menor = tiempos[i];
            if (tiempos[i] > mayor) mayor = tiempos[i];
        }

        double promedio = (double) suma / tiempos.length;

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Tiempo más rápido: " + menor);
        System.out.println("Tiempo más lento: " + mayor);

        // 3. Ordenar los tiempos con inserción
        insercion(tiempos);

        System.out.print("\nTiempos ordenados: ");
        for (int t : tiempos) {
            System.out.print(t + " ");
        }
    }
}




