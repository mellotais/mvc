package com.classes.main;

import com.classes.BO.AtendimentoBO;
import com.classes.BO.MedicoBO;
import com.classes.BO.PacienteBO;
import com.classes.BO.PessoaBO;
import com.classes.DTO.Atendimento;
import com.classes.DTO.Medico;
import com.classes.DTO.Paciente;
import com.classes.DTO.Pessoa;

public class MainAlteracao {

	public static void main(String[] args) {

		//           **ALTERAR PESSOA** 
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Fernando" ,"212.000.111-44", "991787287");
		pessoaBO.alterar(pessoa);
		pessoa = pessoaBO.procurarPorCodigo(pessoa);
				System.out.println(pessoa);

				
		//           **ALTERAR PACIENTE** 
		
		PacienteBO pacienteBO = new PacienteBO();
		Paciente paciente = new Paciente("Antonio Borges", "32332112312", "1233213", 2);
		pacienteBO.alterar(paciente);
		paciente = pacienteBO.procurarPorCodigo(paciente);
				System.out.println(paciente);

		//           **ALTERAR MEDICO** 
		
		MedicoBO medicoBO = new MedicoBO();
		Medico medico = new Medico("98098012350", "Giovane Augusto", "8278709840", 129012);
		medicoBO.alterar(medico);
		medico = medicoBO.procurarPorCodigo(medico);
				System.out.println(medico);


		//           **ALTERAR ATENDIMENTO** 
		
		AtendimentoBO atendimentoBO = new AtendimentoBO();
		Atendimento atendimento = new Atendimento(22, 4, 3);
		atendimentoBO.alterar(atendimento);
		atendimento = atendimentoBO.procurarPorCodigo(atendimento);
				System.out.println(atendimento);
				
	}
}
