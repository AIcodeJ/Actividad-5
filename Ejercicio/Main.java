import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciamos la clase Notas
        Notas n = new Notas();
        // Utilizamos Scanner para que el usuario introduzca sus datos
        Scanner sc = new Scanner(System.in);

        // Accedemos al atributo [] materias y hacemos la llamada de valores
        n.materias = new int[5];
        for (int i = 0; i < n.materias.length; i++) {
            System.out.print("Introduce tu nota de materia "+ (i+1) + ": ");
            n.materias[i] = sc.nextInt();
        }

        // Accedemos al atributo nombre y lo guardamos
        System.out.print("Introduce tu nombre: ");
        n.nombre = sc.next();

        // Hacemos la llamada de los métodos a través de la instancia
        System.out.println("--------------------------------------------");
        n.promedio(n.materias);
        n.calificación(n.promedio(n.materias));
        n.mostrarResultados(n.nombre, n.promedio(n.materias), n.calificación(n.promedio(n.materias)));

    }
}
