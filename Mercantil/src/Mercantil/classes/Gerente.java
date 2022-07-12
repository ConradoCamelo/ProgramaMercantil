package Mercantil.classes;

import java.util.Objects;

import Mercantil.Interfaces.PermitirAcesso;

public class Gerente extends Pessoa implements PermitirAcesso {
	
	private int id;
	private double salario;
	private String competencia;
	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	@Override
	public String toString() {
		return "Gerente [id=" + id + ", salario=" + salario + ", competencia=" + competencia + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(competencia, id, salario);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		return Objects.equals(competencia, other.competencia) && id == other.id
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}
	
	//Metodo do Contrato de Autenticação
	@Override
	public boolean autenticar() {
		
		return login.equals("Conrado") && senha.equals("man");
	}
	
	
	
}
