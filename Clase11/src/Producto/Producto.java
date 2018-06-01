package Producto;

public class Producto {

	private String nombre;
	private String descripcion;
	private int stock = 100; // diferencia con static
	private int precio;

	// constructor
	public Producto(String nom, String desc, int pre, int st) {
		nombre = nom;
		descripcion = desc;
		precio = pre;
		stock = st;
		System.out.println(
				"El producto " + nombre + " fue creado con un stock de: " + stock + " y un precio de: " + precio);
	}

	// setters y getters
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

}