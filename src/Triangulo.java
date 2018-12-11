/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class Triangulo {
	
	private int base;
	private int altura;
	
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo (int base, int altura) {
		
		this.base = base;
		this.altura = altura;
		
	}

	/**
	 * @return la base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base la base a modificar
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return la altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura la altura a modificar
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	/**
	 * @return el area
	 */
	public double calcularAreaTriangulo() {
		
		return base * altura / 2;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "El area del triangulo es " + calcularAreaTriangulo();
	}
	
}
