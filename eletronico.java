package Turma29;

public class eletronico {
 
	private String disponivel;
	private String cor;
	private String marca;
	
	public eletronico(String disponivel , String cor , String marca)
	{
		this.disponivel =disponivel;
		this.cor =cor;
		this.marca =marca;	
	}
	 public eletronico(String disponivel)
	 {
		 this.disponivel =disponivel;
	 }
	  public void imprimirInfo()
	  {
		  System.out.println("\n"+disponivel+"possui"+cor+"com"+marca);
	  }
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
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
	  
}
