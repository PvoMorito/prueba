/* Clase Alimento
 * Versión 1.0
 * 23-03-2022
 */

package ent;

public class Alimento {

	private String nombreAlimento;
	private double numeroCalorias;
	private double numeroGrasas;
	private double numeroHidratos;
	private double numeroAzucar;
	private double numeroGrasasSaturadas;
	private double numeroProteinas;
	private double numeroSal;
	
	//Alimentos vacio
	public Alimento() {
		
	}
	//Alimentos con sus atributos
	public Alimento(String nombre,double calorias, double grasas,double hidratos, double azucar, double grasasSat, double proteina, double sal) {
		nombreAlimento=nombre;
		numeroCalorias=calorias;
		numeroGrasas=grasas;
		numeroHidratos=hidratos;
		numeroAzucar=azucar;
		numeroGrasasSaturadas=grasasSat;
		numeroProteinas=proteina;
		numeroSal=sal;
	}
	// Getters y setters
	public String getNombreAlimento() {
		return nombreAlimento;
	}
	public void setNombreAlimento(String nombreAlimento) {
		this.nombreAlimento = nombreAlimento;
	}
	public double getNumeroCalorias() {
		return numeroCalorias;
	}
	public void setNumeroCalorias(double numeroCalorias) {
		this.numeroCalorias = numeroCalorias;
	}
	public double getNumeroGrasas() {
		return numeroGrasas;
	}
	public void setNumeroGrasas(double numeroGrasas) {
		this.numeroGrasas = numeroGrasas;
	}
	public double getNumeroHidratos() {
		return numeroHidratos;
	}
	public void setNumeroHidratos(double numeroHidratos) {
		this.numeroHidratos = numeroHidratos;
	}
	public double getNumeroAzucar() {
		return numeroAzucar;
	}
	public void setNumeroAzucar(double numeroAzucar) {
		this.numeroAzucar = numeroAzucar;
	}
	public double getNumeroGrasasSaturadas() {
		return numeroGrasasSaturadas;
	}
	public void setNumeroGrasasSaturadas(double numeroGrasasSaturadas) {
		this.numeroGrasasSaturadas = numeroGrasasSaturadas;
	}
	public double getNumeroProteinas() {
		return numeroProteinas;
	}
	public void setNumeroProteinas(double numeroProteinas) {
		this.numeroProteinas = numeroProteinas;
	}
	public double getNumeroSal() {
		return numeroSal;
	}
	public void setNumeroSal(double numeroSal) {
		this.numeroSal = numeroSal;
	}
	
	
	
}
