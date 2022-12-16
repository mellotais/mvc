package com.classes.BO;

import com.classes.DTO.Paciente;

import com.classes.DAO.PacienteDAO;

import java.util.List;

public class PacienteBO {
	
	
	public boolean inserir(Paciente paciente){
        if (existe(paciente) != true) {
        	PacienteDAO pacienteDAO = new PacienteDAO();
            return pacienteDAO.inserir(paciente);
        }
        return false;
    }
	
    public boolean alterar(Paciente paciente){
    	PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.alterar(paciente);
    }
    
    public boolean excluir(Paciente paciente){
    	PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.excluir(paciente);
    }

   
    public boolean existe(Paciente paciente){
    	PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.existe(paciente);
    }
    
    public List<Paciente> pesquisarTodos(){
    	PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.pesquisarTodos();
    }
    
    
    public Paciente procurarPorCodigo(Paciente paciente){
    	PacienteDAO pacienteDAO = new PacienteDAO();
    	return pacienteDAO.procurarPorCodigo(paciente);
    }
    
}