package Videojuego;
public class Videojuego {
	private String nombre;
	private String plataforma;
	private int jugadores;
	public Videojuego() {
		nombre = "Desconocido";
	    plataforma = "Desconocida";
	    jugadores = 1;
	    }
	public Videojuego(String nombre, String plataforma) {
		this.nombre = nombre;
	    this.plataforma = plataforma;
	    jugadores = 1;
	    }
	public Videojuego(String nombre, String plataforma, int jugadores) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.jugadores = jugadores;
	    }
	    public void agregarJugadores() {
	        jugadores = jugadores + 1;
	    }
	    public void agregarJugadores(int cantidad) {
	    	jugadores = jugadores + cantidad;
	    	}
	    public void mostrarDatos() {
	    	System.out.println("Nombre: " + nombre);
	        System.out.println("Plataforma: " + plataforma);
	        System.out.println("Jugadores: " + jugadores);
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Videojuego v1 = new Videojuego("Minecraft", "PC", 2);
	        Videojuego v2 = new Videojuego("FIFA", "PlayStation");
	        v1.agregarJugadores();     
	        v2.agregarJugadores(3);    
	        v1.mostrarDatos();
	        v2.mostrarDatos();
	    }
}












