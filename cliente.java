package Turma29;

public class cliente {
  
	private String nome;
	private String idade;
	private String enderešo;
	
	public cliente(String nome,String idade,String enderešo)
		
	{
		
		this.nome=nome;
		this.idade=idade;
		this.enderešo=enderešo;
	}
	public cliente (String nome)
	{
		this.nome=nome;
	}
       public void imprimirInfo()
     {
    	   System.out.println("\n"+nome+"possui"+idade+"no"+enderešo);
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	  
}
