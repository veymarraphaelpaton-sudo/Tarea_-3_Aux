package Aula;
public class Aula {
    private String nombreAula;
    private int piso;
    private String[] estudiantes;
    private int[] notas;
    public Aula(String nombreAula, int piso, String[] estudiantes, int[] notas) {
        this.nombreAula = nombreAula;
        this.piso = piso;
        this.estudiantes = estudiantes;
        this.notas = notas;
    }
    public void mostrarDatos() {
        System.out.println("Nombre del aula: " + nombreAula);
        System.out.println("Piso: " + piso);
        System.out.println("Estudiantes y notas:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " - " + notas[i]);
        }
    }

    public void mostrarDatos(boolean estado) {
        for (int i = 0; i < estudiantes.length; i++) {
        	if (notas[i] >= 51) {
                System.out.println(estudiantes[i] + " : APROBADO");
            } else {
                System.out.println(estudiantes[i] + " : REPROBADO");
            }
        }
    }
    public static void main(String[] args) {
        String[] estudiantes = {"Luis", "Aracely"};
        int[] notas = {67, 89};
        Aula aula1 = new Aula("Aula 101", 2, estudiantes, notas);
        aula1.mostrarDatos();
        System.out.println();
        aula1.mostrarDatos(true);
    }
}











