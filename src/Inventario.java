import java.util.ArrayList;


public class Inventario {
	private ArrayList<Mascotas> lista = new ArrayList<>();
	/*
	 * REMOVE ALL PARA BORRAR TODO EL CONTENIDO DE LA LISTA
	 */
	public void vaciar() {
		lista.clear();
	}
	//add para añadir la mascota a la lista
	public void insertaMascota(Mascotas a) {
		lista.add(a);
	}
	//remove para eliminar la mascota en base al nombre
	public void eliminaMascota(String nombrel) {
		lista.remove(nombrel);
	}
	//imprimo todos con el foreach que recorre la lista y va imprimiendo cada nombre gracias al getter de nombre
	public void imprimirTodos() {
		for (Mascotas mascotas : lista) {
			System.out.println(mascotas.getNombrel());
		}
	}
	// aqui imprime solo si el elemento de la lista es de tipo Perro
	public void imprimirPerros() {
		for (Mascotas mascotas : lista) {
			if (mascotas instanceof Perro) {
				System.out.println(mascotas.getNombrel());
			}
		}
	}

}
