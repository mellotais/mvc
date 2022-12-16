package com.classes.main;

import java.sql.Date;
import java.util.Calendar;

import com.classes.BO.AtendimentoBO;
import com.classes.BO.MedicoBO;
import com.classes.BO.PacienteBO;
import com.classes.BO.PessoaBO;
import com.classes.DTO.Atendimento;
import com.classes.DTO.Medico;
import com.classes.DTO.Paciente;
import com.classes.DTO.Pessoa;


public class MainInsercao {

	public static void main(String[] args) {
		
				
					//      **INSERE UMA NOVA PESSOA**		
		
				PessoaBO pessoaBO = new PessoaBO();
				Pessoa pessoa = new Pessoa("Fernando" ,"222.000.111-44", "991787287");
		
				if (pessoaBO.inserir(pessoa))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
		
				pessoa = new Pessoa("Augusto", "000.111.222-33", "991787287");
		
				if (pessoaBO.inserir(pessoa))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
		
				pessoa = new Pessoa("Paulo" , "777.000.000-99", "991787287");
		
				if (pessoaBO.inserir(pessoa))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");	
				
				
				
				//      **INSERE UM MEDICO**		
				
				MedicoBO medicoBO = new MedicoBO();
				Medico medico = new Medico("98098012350", "Giovane Augusto", "1278709840", 129012);
				
				if (medicoBO.inserir(medico))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				medico = new Medico ("12345678910", "Fernando Henrique", "1290909090", 7878787);
				
				if (medicoBO.inserir(medico))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				medico = new Medico("88345678910", "Joao Francisco", "00090909090", 7878787);
				
				if (medicoBO.inserir(medico))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				
				
				//      **INSERE UM PACIENTE**		
				
				PacienteBO pacienteBO = new PacienteBO();
				Paciente paciente = new Paciente( "Antonio Borges", "12332112312", "1233213", 2);
				
				if (pacienteBO.inserir(paciente))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				paciente = new Paciente("VITORIA MARIA","07151104383",  "1233213", 1);
				
				if (pacienteBO.inserir(paciente))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				paciente = new Paciente( "Julio", "61532198370", "1233213",  4);
				
				if (pacienteBO.inserir(paciente))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				
				//      **INSERE ATENDIMENTO** 

				AtendimentoBO atendimentoBO = new AtendimentoBO();
			
				Calendar calendario = Calendar.getInstance();
    		
				calendario.set(Calendar.DAY_OF_MONTH, 26);
				calendario.set(Calendar.MONTH, 11);
				calendario.set(Calendar.YEAR, 2024);
    		
				Date dt = (Date) calendario.getTime();
				java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
				Atendimento atendimento = new Atendimento(sqlDate, 1, 3);
		
				if (atendimentoBO.inserir(atendimento))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir"); 
				
	

	}				
}
				
				
