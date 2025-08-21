
package bebecitaua;

public class Class2 {

    // Método de ordenamiento por inserción
    public static void insercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Mover los elementos mayores a key una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Programa principal
    public static void main(String[] args) {
        int[] notas = {14, 18, 11, 16, 20, 13, 15};

        System.out.println("Notas originales:");
        for (int n : notas) {
            System.out.print(n + " ");
        }

        insercion(notas);

        System.out.println("\n\nNotas ordenadas de menor a mayor:");
        for (int n : notas) {
            System.out.print(n + " ");
            System.out.println("Gracias");
        }
    }
}


