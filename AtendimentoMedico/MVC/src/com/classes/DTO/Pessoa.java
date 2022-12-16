package com.classes.DTO;

public class Pessoa {

	private String cpf;
	private String nome;
	private String telefone;
	private int codigo;
	
		
	public Pessoa(String cpf, String nome, String telefone) {	
		setCpf(cpf);
		setNome(nome);
		setTelefone(telefone);
	}
	
	public Pessoa(int codigo, String nome, String cpf, String telefone) {
		setCodigo(codigo);
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
	}

	
	public Pessoa() {
		
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length() > 0)
			this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if (telefone.length() > 0)
			this.telefone = telefone;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
			this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n CPF:");
		builder.append(cpf);
		builder.append(",\n Nome:");
		builder.append(nome);
		builder.append(",\n Codigo:");
		builder.append(codigo);
		builder.append(",\n Telefone:");
		builder.append(telefone);
		builder.append("\n");
		builder.append("-----------------");
		builder.append("\n");
		return builder.toString();
	}
	
	
	
	
}
