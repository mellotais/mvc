package com.classes.main;

import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		LivroBO livroBO = new LivroBO();
		Livro livro = new Livro ("Harry Potter");
		if (livroBO.inserir(livro))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		livro = new Livro("Divergente");
		if (livroBO.inserir(livro))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		livro = new Livro("Percy Jackson");
		if (livroBO.inserir(livro))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}

