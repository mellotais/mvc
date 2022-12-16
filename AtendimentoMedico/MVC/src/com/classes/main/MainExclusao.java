package com.classes.main;

import java.util.Date;

import com.classes.BO.AtendimentoBO;
import com.classes.BO.MedicoBO;
import com.classes.BO.PacienteBO;
import com.classes.BO.PessoaBO;
import com.classes.DTO.Atendimento;
import com.classes.DTO.Medico;
import com.classes.DTO.Paciente;
import com.classes.DTO.Pessoa;

public class MainExclusao {

	public static void main(String[] args) {

		
		//      **EXCLUIR PESSOA**
		 
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Gian" , "777.000.000-99", "991787287");
		
		if (pessoaBO.excluir(pessoa))
			System.out.println("Excluido Pessoa com Sucesso");
		else
			System.out.println("Erro ao Excluir Pessoa");

		
		
		
		//      **EXCLUIR MEDICO**
		
		
		MedicoBO medicoBO = new MedicoBO(); 
		Medico medico = new Medico("98098012350", "Giovane Augusto", "1278709840", 129012);
		
		if (medicoBO.excluir(medico))
			System.out.println("Excluido Medico com Sucesso");
		else
			System.out.println("Erro ao Excluir Medico");	
		
		
		//      **EXCLUIR PACIENTE**
		
		
		PacienteBO pacienteBO = new PacienteBO(); 
		Paciente paciente = new Paciente("Antonio Borges", "12332112312", "1233213", 2);
		
		if (pacienteBO.excluir(paciente))
			System.out.println("Excluido Paciente com Sucesso");
		else
			System.out.println("Erro ao Excluir Paciente");	
		
		
		//      **EXCLUIR ATENDIMENTO**
		
		
		AtendimentoBO atendimentoBO = new AtendimentoBO(); 
		Date sqlDate;
		Atendimento atendimento = new Atendimento(sqlDate, 1, 1);
		
		if (atendimentoBO.excluir(atendimento))
			System.out.println("Excluido Atendimento com Sucesso");
		else
			System.out.println("Erro ao Atendimento Paciente");	
		
		
	}
}
		
