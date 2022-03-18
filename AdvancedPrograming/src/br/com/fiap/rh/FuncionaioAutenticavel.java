package br.com.fiap.rh;

public interface FuncionaioAutenticavel{
	
	boolean autenticar(String senha);
	
	void setSenha(String senha);
}
