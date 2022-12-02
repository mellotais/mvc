package com.classes.main;

import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		LivroBO livroBO = new LivroBO();
		Livro livro = new Livro(1,"Novo Livro");
		livroBO.alterar(livro);
		livro = livroBO.procurarPorCodigo(livro);
		System.out.println(livro);
		
	}
}