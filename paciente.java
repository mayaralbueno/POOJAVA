package Turma29;

public class paciente {
	
	private String nome;
	private String idade;
	private String enderešo;
	private String email;
	private double telefone;
	
	public paciente(String nome,String idade,String enderešo,String email,double telefone)
	{
		this.nome=nome;
		this.idade=idade;
		this.enderešo=enderešo;
		this.email=email;
		this.telefone=telefone;
  } 
	  public paciente(String nome)
 {
	   this.nome=nome;	
   }
	  public void imprimirInfo() 
 {
 System.out.println("\nentrada de paciente no hospital"   +nome+   "\nidade "   +idade+   "\nenderešo"   +enderešo+   "\nemail"   +email+     "\ntelefone"     +telefone); 
		  
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	  
	
	

}
