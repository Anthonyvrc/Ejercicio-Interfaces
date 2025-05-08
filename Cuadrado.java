
public class Cuadrado  implements AreayPerimetro {
	private String nombre;
	private double lado;
	
	@Override
	public String toString() {
		return "cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}//toString

	public cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//Constructor

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return (getLado()*getLado());
	}
	
	public double calcularPerimetroC() {
		return (getLado()*4);
	}

	@Override
	public double calcularAreac() {
		return this.calcularArea();
	}

	@Override
	public double calcularPerimetro() {
		return this.calcularPerimetroC();
	}
	
	
}