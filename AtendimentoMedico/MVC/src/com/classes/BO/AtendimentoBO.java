package com.classes.BO;

import com.classes.DTO.Atendimento;

import com.classes.DAO.AtendimentoDAO;


import java.util.List;

public class AtendimentoBO {
	
	
	public boolean inserir(Atendimento atendimento){
        if (existe(atendimento) != true) {
        	AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
            return atendimentoDAO.inserir(atendimento);
        }
        return false;
    }
	
    public boolean alterar(Atendimento atendimento){
    	AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
        return atendimentoDAO.alterar(atendimento);
    }
    
    public boolean excluir(Atendimento atendimento){
    	AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
        return atendimentoDAO.excluir(atendimento);
    }

   
    public boolean existe(Atendimento atendimento){
    	AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
        return atendimentoDAO.existe(atendimento);
    }
    
    public List<Atendimento> pesquisarTodos(){
    	AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
        return atendimentoDAO.pesquisarTodos();
    }
    public Atendimento  procurarPorCodigo(Atendimento atendimento){
    	AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    	return atendimentoDAO.procurarPorCodigo(atendimento);
    }
}