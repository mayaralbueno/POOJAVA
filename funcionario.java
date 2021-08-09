package Turma29;

public class funcionario {
	
	private String nome;
	private String idade;
	
	public funcionario(String nome , String idade)
	{
		this.nome =nome;
		this.idade =idade;
	}
	  public funcionario(String nome)
	  {
		  this.nome =nome;
	  }
	  public void imprimirInfo()
	  {
		  System.out.println("\n"+nome+"possui"+idade);
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
	      
	

}
