package Turma29;

public class avião {
	
	private String nomeProprietario;
	private String cor;
	private float metros;
	private float  altura;
	
	public avião(String nomeProprietario,String cor,float metros,float altura)
	{
		this.nomeProprietario =nomeProprietario;
		this.cor = cor;
	    this.metros = metros;
	    this.altura =altura;	
	}
      public avião(String nomeProprietario)
      {
    	  this.nomeProprietario =nomeProprietario;
      }
       public void imprimirInfo()
       {
    	   System.out.println("\n" +nomeProprietario+" possui um avião com a cor " +cor+ " e mtros"+metros+ "altura!"+altura);
       }
       

	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getMetros() {
		return metros;
	}
	public void setMetros(float metros) {
		this.metros = metros;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	} 
	 
}
