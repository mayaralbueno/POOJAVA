package Turma29;

public class paciente {
	
	private String nome;
	private String idade;
	private String endere�o;
	private String email;
	private double telefone;
	
	public paciente(String nome,String idade,String endere�o,String email,double telefone)
	{
		this.nome=nome;
		this.idade=idade;
		this.endere�o=endere�o;
		this.email=email;
		this.telefone=telefone;
  } 
	  public paciente(String nome)
 {
	   this.nome=nome;	
   }
	  public void imprimirInfo() 
 {
 System.out.println("\nentrada de paciente no hospital"   +nome+   "\nidade "   +idade+   "\nendere�o"   +endere�o+   "\nemail"   +email+     "\ntelefone"     +telefone); 
		  
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
