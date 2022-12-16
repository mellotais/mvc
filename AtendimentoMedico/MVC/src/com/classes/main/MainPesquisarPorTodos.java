package com.classes.main;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.AtendimentoBO;
import com.classes.BO.MedicoBO;
import com.classes.BO.PacienteBO;
import com.classes.BO.PessoaBO;
import com.classes.DTO.Atendimento;
import com.classes.DTO.Medico;
import com.classes.DTO.Paciente;
import com.classes.DTO.Pessoa;

public class MainPesquisarPorTodos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR TODAS AS PESSOAS**
		
			PessoaBO peesoaBO = new PessoaBO();
				List<Pessoa> lista = new ArrayList<Pessoa>();
				
				lista = peesoaBO.pesquisarTodos();
				
				for (Pessoa pessoa : lista) {
					System.out.println(pessoa.toString());
				}

				
				
				
				PacienteBO pacienteBO = new PacienteBO();
				List<Paciente> lista1 = new ArrayList<Paciente>();
				
				lista1 = pacienteBO.pesquisarTodos();
				
				for (Paciente paciente : lista1) {
					System.out.println(paciente.toString());
				}
				
				
				
				MedicoBO medicoBO = new MedicoBO();
				List<Medico> lista2 = new ArrayList<Medico>();
				
				lista2 = medicoBO.pesquisarTodos();
				
				for (Medico medico : lista2) {
					System.out.println(medico.toString());
				}
				
				
				
				
				
				AtendimentoBO atendimentoBO = new AtendimentoBO();
				List<Atendimento> lista3 = new ArrayList<Atendimento>();
				
				lista3 = atendimentoBO.pesquisarTodos();
				
				for (Atendimento atendimento : lista3) {
					System.out.println(atendimento.toString());
				}

	}

}