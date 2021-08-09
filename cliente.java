package Turma29;

public class cliente {
  
	private String nome;
	private String idade;
	private String endereço;
	
	public cliente(String nome,String idade,String endereço)
		
	{
		
		this.nome=nome;
		this.idade=idade;
		this.endereço=endereço;
	}
	public cliente (String nome)
	{
		this.nome=nome;
	}
       public void imprimirInfo()
     {
    	   System.out.println("\n"+nome+"possui"+idade+"no"+endereço);
     }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	  
}
