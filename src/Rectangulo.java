/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class Rectangulo {
	
	private int ancho;
	private int alto;
	
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	/**
	 * @return el ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho el ancho a modificar
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return el alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto el alto a modificar
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	/**
	 * @return el area
	 */
	public double calcularAreaRectangulo() {
		
		return ancho * alto;
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "El area del rectángulo es " + calcularAreaRectangulo();
	}
	
}
