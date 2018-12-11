/**
 * @author José Luis Gómez López
 * @version 1.0
 */
public class Trapecio {
	
	private int baseMayor;
	private int baseMenor;
	private int altura;
	
	/**
	 * @param baseMayor
	 * @param baseMenor
	 * @param altura
	 */
	public Trapecio (int baseMayor, int baseMenor, int altura) {
		
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		
	}
	
	/**
	 * @return la baseMayor
	 */
	public int getBaseMayor() {
		return baseMayor;
	}



	/**
	 * @param baseMayor la baseMayor a modificar
	 */
	public void setBaseMayor(int baseMayor) {
		this.baseMayor = baseMayor;
	}



	/**
	 * @return la baseMenor
	 */
	public int getBaseMenor() {
		return baseMenor;
	}



	/**
	 * @param baseMenor la baseMenor a modificar
	 */
	public void setBaseMenor(int baseMenor) {
		this.baseMenor = baseMenor;
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
	public double calcularAreaTrapecio() {
		
		return altura * (baseMayor + baseMenor) / 2;
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "El area del trapecio es " + calcularAreaTrapecio();
	}
	
}
