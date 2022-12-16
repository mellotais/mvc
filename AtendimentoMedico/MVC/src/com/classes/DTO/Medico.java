package com.classes.DTO;


public class Medico extends Pessoa {
	private int crm;

	public Medico() {
		
		
	}
		
	public Medico(String cpf, String nome, String telefone, int crm) {
		super(cpf, nome, telefone);
		setCrm(crm);
	}


	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		if (crm > 0)
			this.crm = crm;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Medico");
		builder.append(",\n crm:");
		builder.append(crm);
		builder.append("\n");
		builder.append("-----------------");
		builder.append("\n");
		return builder.toString();
	}

	
	}
	