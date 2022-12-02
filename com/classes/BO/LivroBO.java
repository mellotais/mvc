package com.classes.BO;

import com.classes.DTO.Livro;
import com.classes.DAO.LivroDAO;
import java.util.List;

public class LivroBO {

    public boolean inserir(Livro livro){
        if (existe(livro) != true) {
            LivroDAO livrosDAO = new LivroDAO();
            return livrosDAO.inserir(livro);
        }
        return false;
    }
    public boolean alterar(Livro livro){
        LivroDAO livrosDAO = new LivroDAO();
        return livrosDAO.alterar(livro);
    }
    public boolean excluir(Livro livro){
        LivroDAO livrosDAO = new LivroDAO();
        return livrosDAO.excluir(livro);
    }
    public Livro procurarPorCodigo(Livro livro){
        LivroDAO livrosDAO = new LivroDAO();
        return livrosDAO.procurarPorCodigo(livro);
    }
    public Livro procurarPorDescricao(Livro livro){
    	 LivroDAO livrosDAO = new LivroDAO();
        return livrosDAO.procurarPorDescricao(livro);
    }
    public boolean existe(Livro livro){
    	 LivroDAO livrosDAO = new LivroDAO();
        return livrosDAO.existe(livro);
    }
    public List<Livro> pesquisarTodos(){
    	 LivroDAO livrosDAO = new LivroDAO();
        return livrosDAO.pesquisarTodos();
    }
}