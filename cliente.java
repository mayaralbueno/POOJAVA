package Turma29;

public class cliente {
  
	private String nome;
	private String idade;
	private String endere�o;
	
	public cliente(String nome,String idade,String endere�o)
		
	{
		
		this.nome=nome;
		this.idade=idade;
		this.endere�o=endere�o;
	}
	public cliente (String nome)
	{
		this.nome=nome;
	}
       public void imprimirInfo()
     {
    	   System.out.println("\n"+nome+"possui"+idade+"no"+endere�o);
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	  
}
