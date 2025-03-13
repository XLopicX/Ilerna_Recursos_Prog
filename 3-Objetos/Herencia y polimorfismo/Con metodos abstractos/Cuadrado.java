
public class Cuadrado {
	private double base;
	private double altura;
	
	public Cuadrado(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return this.base*this.altura;
	}
	
	public double perimetro() {
		return this.base*2+this.altura*2;
	}
}
