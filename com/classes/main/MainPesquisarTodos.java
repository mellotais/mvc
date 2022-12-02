package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Livros)
		LivroBO livroBO = new LivroBO();
		List<Livro> lista = new ArrayList<Livro>();
		lista = livroBO.pesquisarTodos();	
		for (Livro livro : lista) {
			System.out.println(livro.toString());
		}
	
	}
}