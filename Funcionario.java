package TesteBia;

public class Funcionario {
private String nome;
private String profisao;
private String salario;
public Funcionario(String nome,String profisao,String salario) {
	this.nome=nome;
	this.profisao=profisao;
	this.salario=salario;
}
public void imprimir() {
	System.out.println("o nome do funcionario e... "+getNome());
	System.out.println("a profisao do funcionario e... "+getProfisao());
	System.out.println("o salario do funcionario e... "+getSalario());
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getProfisao() {
	return profisao;
}
public void setProfisao(String profisao) {
	this.profisao = profisao;
}
public String getSalario() {
	return salario;
}
public void setSalario(String salario) {
	this.salario = salario;
}
	
	
}
