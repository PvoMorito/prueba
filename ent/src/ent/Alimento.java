/* Clase Alimento
 * Versión 1.0
 * 23-03-2022
 */

package ent;

public class Alimento  {

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


	
	//Aquí este método es para calcular las calorias de un varón, y hace un condicional para comprobar si tiene un buen nivel, o no, de calorias
	
	public String calcularCaloriasGrasasHombre() {
		double total=0.0;
		double ingestaTotal=numeroGrasasSaturadas+numeroProteinas+numeroAzucar+numeroHidratos;
		String mensaje=null;
		total=30%(ingestaTotal);
		if(total<2000) 
			mensaje="Cantidad de calorias por debajo del nivel recomendado";
		if(total>2500)
			mensaje="Cantidad de calorias por encima del nivel recomendado";
		else
			mensaje="Cantidad de calorias estable, es decir, dentro de los valores recomendados";
	return mensaje;
	}
	//Aquí este método es para calcular las calorias de una hembra, y hace un condicional para comprobar si tiene un buen nivel, o no, de calorias
	public String calcularCaloriasGrasasMujer() {
		double total=0.0;
		double ingestaTotal=numeroGrasasSaturadas+numeroProteinas+numeroAzucar+numeroHidratos;
		String mensaje=null;
		total=30%(ingestaTotal);
		if(total<1600) 
			mensaje="Cantidad de calorias por debajo del nivel recomendado";
		if(total>2000)
			mensaje="Cantidad de calorias por encima del nivel recomendado";
		else
			mensaje="Cantidad de calorias estable, es decir, dentro de los valores recomendados";
	return mensaje;
	}
	
	
}
