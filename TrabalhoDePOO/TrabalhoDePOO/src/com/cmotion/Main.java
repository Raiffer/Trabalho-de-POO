package com.cmotion;

import com.cmotion.entidade.Usuario;

public class Main {

	public static void main(String[] arguments) {
		Usuario usuario = new Usuario("Bernardo", "", null, null, null, 0, 0);
		System.out.println("O nome do usuário é: " + usuario.getNome());
	}
}
