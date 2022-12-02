package com.classes.main;

import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		LivroBO livroBO = new LivroBO();
		Livro livro = new Livro(1,"");
		livro = livroBO.procurarPorCodigo(livro);
		System.out.println(livro);
		
	}
}