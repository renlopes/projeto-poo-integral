package com.ufrpe.integrais.dados;

import java.util.ArrayList;

import com.ufrpe.integrais.dados.entidades.Usuario;

public class RepositorioUsuarios {
	private ArrayList<Usuario> usuarios;

	public RepositorioUsuarios() {
		usuarios = new ArrayList<Usuario>();
	}

	public void cadastrar(Usuario u) {
		usuarios.add(u);
	}

	public Usuario procurar(String email, String senha) {
		Usuario aux = null;

		for (Usuario u : usuarios) {
			if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
				aux = u;
				break;
			}
		}

		return aux;
	}

	public Usuario procurar(String email) {
		Usuario aux = null;

		for (Usuario u : usuarios) {
			if (u.getEmail().equals(email)) {
				aux = u;
				break;
			}
		}

		return aux;
	}

	public void remover(String email) {
		Usuario aux = procurar(email);

		if (aux != null) {
			usuarios.remove(aux);
		}
	}
}