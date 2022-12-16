package com.classes.main;

import com.classes.BO.AtendimentoBO;
import com.classes.BO.MedicoBO;
import com.classes.BO.PacienteBO;
import com.classes.BO.PessoaBO;
import com.classes.DTO.Atendimento;
import com.classes.DTO.Medico;
import com.classes.DTO.Paciente;
import com.classes.DTO.Pessoa;

public class MainExiste {
	
	public static void main(String[] args) {
	
		
			//      **VERIFICA SE EXISTE A PESSOA**
		
				PessoaBO pessoaBO = new PessoaBO();
				Pessoa pessoa = new Pessoa("Augusto", "000.111.222-33", "991787287");
				
				if (pessoaBO.existe(pessoa))
					System.out.println("Pessoa Encontrada");
				else
					System.out.println("**Pessoa Nao Encontrada**");
				
				
				//      **VERIFICA SE EXISTE A PACIENTE**
				
				PacienteBO pacienteBO = new PacienteBO();
				Paciente paciente = new Paciente("Julio", "61532198370", "1233213",  4);
				
				if (pacienteBO.existe(paciente))
					System.out.println("Paciente Encontrado");
				else
					System.out.println("**Paciente Nao Encontrado**");
				
				
				
				//      **VERIFICA SE EXISTE MEDICO**
				
				MedicoBO medicoBO = new MedicoBO();
				Medico medico = new Medico("98098012350", "Giovane Augusto", "1278709840", 129012);
				
				if (pessoaBO.existe(medico))
					System.out.println("Medico Encontrado");
				else
					System.out.println("**Medico Nao Encontrado**");
				
				
				//      **VERIFICA SE EXISTE ATENDIMENTO**
				
				AtendimentoBO atendimentoBO = new AtendimentoBO();
				Atendimento atendimento = new Atendimento(22, 1, 3);
				
				if (atendimentoBO.existe(atendimento))
					System.out.println("Atendimento Encontrado");
				else
					System.out.println("**Atendimento Nao Encontrado**");

	}

}