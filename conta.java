package Turma29;

public class conta {
	
	private String nome;
	private String idade;
	private String email;
	private String endere�o;
	private double telefone;
	
	public conta(String nome,String idade,String email,String endere�o,double telefone)
	{
		this.nome=nome;
		this.idade=idade;
		this.email=email;
		this.endere�o=endere�o;
		this.telefone=telefone;
	}
      public conta(String nome)
      {
    	  this.nome=nome;
      }
      public void imprimirInfo()
      {
   	  System.out.println("\n conta bancaria de um cliente"   +nome+    "\nidade"  +idade+  "\nemail"   +email+     "\nendere�o"  +endere�o+  "\ntelefone"  +telefone); 
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
       
}
