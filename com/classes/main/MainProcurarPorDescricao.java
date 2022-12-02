package com.classes.main;

import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;

public class MainProcurarPorDescricao {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		LivroBO livroBO = new MarcaBO();
		Livro livro = new Livro("Crepusculo");
		livro = livroBO.procurarPorDescricao(livro);
		System.out.println(livro);

	}
}