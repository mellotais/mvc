package com.classes.DTO;


public class Paciente extends Pessoa{
	
	//ATRIBUTO
	private int cod_paciente;
	
	
	public Paciente(String cpf, String nome, String telefone,  int cod_paciente) {
		super(cpf, nome, telefone);
		setCod_paciente(cod_paciente);
	}
	
	public Paciente() {
		
		}

	//GET E SET
	public int getCod_paciente() {
		return cod_paciente;
	}
	public void setCod_paciente(int cod_paciente) {
		if(cod_paciente > 0) {
			this.cod_paciente = cod_paciente;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [cod_paciente=");
		builder.append(cod_paciente);
		builder.append("]");
		builder.append(",\n cod_paciente:");
		builder.append(cod_paciente);
		builder.append("\n");
		builder.append("-----------------");
		builder.append("\n");
		return builder.toString();
	}
	
	
	}
