package usuario;

public class Login {
	
	boolean logado;
	String email;
	String senha;
	
	public boolean validarUsuario(Usuario user)
	{
		
		if(user.getEmail().equals(this.email) && user.getSenha().equals(this.senha)) {
			return true;
		}
		
		return false;
	}
	
	public void fazerLogin()
	{
		this.logado = true;
	}
	
	public void fazerLogout()
	{
		this.logado = false;
	}
}
