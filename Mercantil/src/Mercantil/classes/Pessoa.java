package Mercantil.classes;

import java.util.Objects;

public class Pessoa {

	String nome;
	int idade;
	String endereco;
	String sexo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", sexo=" + sexo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(endereco, idade, nome, sexo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(endereco, other.endereco) && idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(sexo, other.sexo);
	}
	
	
	
}
