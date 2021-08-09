package Turma29;

public class patinete {
	
	private String cor;
	private String marca;
	private double valor;
	 
	public patinete(String cor,String marca,double valor)
	{
		this.cor=cor;
		this.marca=marca;
		this.valor=valor;
	}
	public patinete(String cor)
	{
		this.cor =cor;
	}
     public void imprimirInfo()
     {
     System.out.println("\n o patinete tem a cor"  +cor+  "da"  +marca+   "e"    +valor);
     }
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
        
}
