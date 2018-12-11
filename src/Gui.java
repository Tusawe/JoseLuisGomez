import java.util.Scanner;

public class Gui {

	public static void main(String[] args) {
		// Llamamos al menú.
		menu();
		
		//Pedimos la opción.
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		
		while (op > 4 || op < 1) {
		
			System.out.println("Opción incorrecta.");
			op = sc.nextInt();
			
		};
		
		switch (op) {
		
			case 1: 
				// Opcion triangulo.
				System.out.println("Introduce la base:");
				int base = sc.nextInt();
				System.out.println("Introduce la altura:");
				int altura = sc.nextInt();
				Triangulo triangulo = new Triangulo(base,altura);
				System.out.printf("El area del triangulo es %.2f",triangulo.calcularAreaTriangulo());
				
				break;
				
			case 2: 
				break;
				
			case 3: 
				break;
				
			default: break;
		
		}

	}
	
	public static void menu() {
		
		System.out.println("           CÁLCULO DE ÁREAS");
		System.out.println("===================================");
		System.out.println("1. Calcular el área de un triangulo");
		System.out.println("2. Calcular el área de un trapecio");
		System.out.println("3. Calcular el área de un rectángulo");
		System.out.println("4. Salir");
		
	}

}
