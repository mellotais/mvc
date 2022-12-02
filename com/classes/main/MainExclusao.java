package com.classes.main;

import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		LivroBO livroBO = new LivroBO();
		Livro livro = new Livro(1);
		if (livroBO.excluir(livro))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}