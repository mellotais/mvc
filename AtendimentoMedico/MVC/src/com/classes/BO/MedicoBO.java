package com.classes.BO;


import com.classes.DTO.Medico;
import com.classes.DTO.Pessoa;
import com.classes.DAO.MedicoDAO;
import com.classes.DAO.PessoaDAO;

import java.util.List;

public class MedicoBO {
		
		
		public boolean inserir(Medico medico){
	        if (existe(medico) != true) {
	        	MedicoDAO medicoDAO = new MedicoDAO();
	            return medicoDAO.inserir(medico);
	        }
	        return false;
	    }
		
	    public boolean alterar(Medico medico){
	    	MedicoDAO medicoDAO = new MedicoDAO();
	        return medicoDAO.alterar(medico);
	    }
	    
	    public boolean excluir(Medico medico){
	    	MedicoDAO medicoDAO = new MedicoDAO();
	        return medicoDAO.excluir(medico);
	    }

	   
	    public boolean existe(Medico medico){
	    	MedicoDAO medicoDAO = new MedicoDAO();
	        return medicoDAO.existe(medico);
	    }
	    
	    public List<Medico> pesquisarTodos(){
	    	MedicoDAO medicoDAO = new MedicoDAO();
	        return medicoDAO.pesquisarTodos();
	    }
	    
	    
	    public Medico procurarPorCodigo(Medico medico){
	    	MedicoDAO medicoDAO = new MedicoDAO();
	    	return medicoDAO.procurarPorCodigo(medico);
	    }
	}