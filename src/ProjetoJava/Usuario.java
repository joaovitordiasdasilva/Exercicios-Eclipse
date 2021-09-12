package ProjetoJava;

public abstract class Usuario {
	

	String user;
	String senha;
	int cidade;
	int horario;
	String Santos;
	String Maua;
	String Osasco;
	
	public int getCidade() {
		return cidade;
	}
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSantos() {
		return Santos;
	}
	public void setSantos(String santos) {
		Santos = santos;
	}
	public String getMaua() {
		return Maua;
	}
	public void setMaua(String maua) {
		Maua = maua;
	}
	public String getOsasco() {
		return Osasco;
	}
	public void setOsasco(String osasco) {
		Osasco = osasco;
	}
	
}