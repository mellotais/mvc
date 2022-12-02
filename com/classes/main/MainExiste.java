package com.classes.main;

import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		LivroBO livroBO = new LivroBO();
		Livro livro = new Livro("Crepusculo");
		if (livroBO.existe(livro))
			System.out.println("Livro Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}