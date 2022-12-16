
package com.classes.DTO;

import java.util.Date;

public class Atendimento	 {
	

	private Atendimento atendimento;
	private int codigoAtendimento;
	private Date dia;
	private int codigoPaciente;
	private int codigoMedico;
	
	
	public Atendimento() {
		
	}
	
	public Atendimento(Date dia) {
		setDia(dia);
	}
	
	public Atendimento(int codigoAtendimento) {
		setcodigoAtendimento(codigoAtendimento);
	}
	
	public Atendimento(int codigoAtendimento, Date dia, int codigoPaciente, int codigoMedico) {
		setcodigoAtendimento(codigoAtendimento);
		setDia(dia);
		setcodigoPaciente(codigoPaciente);
		setcodigoMedico(codigoMedico);
		
	}
	
	public Atendimento(Date dia, int codigoPaciente, int codigoMedico) {
		setDia(dia);
		setcodigoPaciente(codigoPaciente);
		setcodigoMedico(codigoMedico);
		
	}
	
	public Atendimento(int codigoAtendimento, int codigoPaciente, int codigoMedico) {
		setcodigoAtendimento(codigoAtendimento);
		setcodigoPaciente(codigoPaciente);
		setcodigoMedico(codigoMedico);
		
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public int getcodigoAtendimento() {
		return codigoAtendimento;
	}

	public void setcodigoAtendimento(int codigoAtendimento) {
		this.codigoAtendimento = codigoAtendimento;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}


	public int getcodigoPaciente() {
		return codigoPaciente;
	}

	public void setcodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}

	public int getcodigoMedico() {
		return codigoMedico;
	}

	public void setcodigoMedico(int codigoMedico) {
		this.codigoMedico = codigoMedico;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Atendimento");
		builder.append(",\n codigoAtendimento:");
		builder.append(codigoAtendimento);
		builder.append("\n");
		builder.append(",\n Dia:");
		builder.append(dia);
		builder.append("\n");
		builder.append(",\n codigoPaciente:");
		builder.append(codigoPaciente);
		builder.append("\n");
		builder.append(",\n codigoMedico:");
		builder.append(codigoMedico);
		builder.append("\n");
		builder.append("-----------------");
		builder.append("\n");
		return builder.toString();
	}
	
	
}
	