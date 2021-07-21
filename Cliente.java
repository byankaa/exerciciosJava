package TesteBia;

public class Cliente{
private String nome;
private String endereco;
private String telefone;

public Cliente (String nome,String endereco,String telefone) {
	this.nome=nome;
	this.endereco=endereco;
	this.telefone=telefone;
	
		
	
	
}
public void imprimir() {
	System.out.println("o nome do cliente e..."+getNome());
	System.out.println("o endereco do cliente e..."+getEndereco());
	System.out.println("o telefone do cliente e..."+getTelefone());
	
}
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}
	
	
}
