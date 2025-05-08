
public class Main {

	public static void main(String[] args) {
		triangulo t1 = new triangulo("Bermudas",20,10,15);
		triangulo t = new triangulo("Triangulo T",200,100,150);
		//System.out.println(t1);
		rectangulo r1 = new rectangulo("Rectangulo T",15,10);
		cuadrado c1 = new cuadrado("cuadrado t",15);
		
		Main.imprimirCalculos(t1);// imprimir
		//Main.imprimirCalculos(t);
		Main.imprimirCalculos(c1);	
		Main.imprimirCalculos(r1);
	}//main
	
	public static void imprimirCalculos(areaPerimetro figuras) {
	
		System.out.println("+-------------------------------------------+");
		System.out.println("| El área de [" + figuras.getNombre()
				+ "]");
		System.out.println("| es" + figuras.calcularArea());
		System.out.println("| El perimetro de [" + figuras.getNombre()
				+ "]");
		System.out.println("| es" + figuras.calcularPerimetro());
		System.out.println("+-------------------------------------------+");
	}//imprimirCalculo

}//class main