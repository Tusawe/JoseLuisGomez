import java.util.Scanner;

public class Gui {

	public static void main(String[] args) {
		// Llamamos al menú.
		menu();
		
		//Pedimos la opción.
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		
		while (op > 4 || op < 1) {
		
			System.out.println("Opción incorrecta. Introduce otra opción:");
			op = sc.nextInt();
			
		};
		
		switch (op) {
		
			case 1: 
				// Opcion triangulo.
				System.out.println("Introduce la base:");
				int base = sc.nextInt();
				System.out.println("Introduce la altura:");
				int altura = sc.nextInt();
				
				while (base <= 0 || altura <= 0) {
					
					System.out.println("DATOS INCORRECTOS");
					System.out.println("Introduce la base:");
					base = sc.nextInt();
					System.out.println("Introduce la altura:");
					altura = sc.nextInt();
					
				}
				
				Triangulo triangulo = new Triangulo(base,altura);
				System.out.println(triangulo);
				
				break;
				
			case 2: 
				// Opcion trapecio.
				System.out.println("Introduce la base mayor:");
				int baseMayor = sc.nextInt();
				System.out.println("Introduce la base menor:");
				int baseMenor = sc.nextInt();
				System.out.println("Introduce la base altura:");
				int altura2 = sc.nextInt();
				
				while (baseMayor <= baseMenor || altura2 <= 0) {
					
					System.out.println("DATOS INCORRECTOS");
					System.out.println("Introduce la base mayor:");
					baseMayor = sc.nextInt();
					System.out.println("Introduce la base menor:");
					baseMenor = sc.nextInt();
					System.out.println("Introduce la base altura:");
					altura2 = sc.nextInt();
					
				}
				
				Trapecio trapecio = new Trapecio(baseMayor,baseMenor,altura2);
				System.out.println(trapecio);
				
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
