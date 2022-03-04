// Clase Notas
public class Notas {
    // Atributos
    String nombre;
    int [] materias;

    //Metodos
    public double promedio(int[] materias){
        double suma = 0;
        for (int i = 0; i < materias.length; i++) {
            suma = suma + materias[i];
        }
        double promedio = suma / materias.length;
        return promedio;
    }

    public char calificación(double promedio){
        char letra;
        if (promedio <= 100 && promedio > 90){
            letra = 'A';
        } else if (promedio <= 90 && promedio > 80) {
            letra = 'B';
        } else if (promedio <= 80 && promedio > 70) {
            letra = 'C';
        } else if (promedio <= 70 && promedio > 60) {
            letra = 'D';
        } else if (promedio <= 60 && promedio > 50) {
            letra = 'E';
        } else {
            letra = 'F';
        }
        return letra;
    }

    public void mostrarResultados(String nombre, double promedio, char letra){
        System.out.println("Nombre del estudiante: " + nombre);
        promedio(materias);
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Calificación "+ (i+1) + ": " + materias[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + letra);
    }
}
