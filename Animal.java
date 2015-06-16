package animal;

public class Animal {
	protected String nome;
	protected String especie;
	protected Porte porte;
	protected FaixaEtaria idade;
	protected boolean adotado;
	protected boolean castrado;
	protected boolean vacinado;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Porte getPorte() {
		return porte;
	}
	
	public void setPorte(Porte porte) {
		this.porte = porte;
	}
	
	public FaixaEtaria getIdade() {
		return idade;
	}
	
	public void setIdade(FaixaEtaria idade) {
		this.idade = idade;
	}
	
	public boolean isAdotado() {
		return adotado;
	}
	
	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
	}
	
	public boolean isCastrado() {
		return castrado;
	}
	
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	public boolean isVacinado() {
		return vacinado;
	}
	
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	
}
