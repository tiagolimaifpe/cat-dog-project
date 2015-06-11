mport usuario.Usuario;

public class TesteUsuario {
	
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Tiago", "trl", "777");
		user1.setNome("Rodrigo");
		user1.setSenha("555");
		user1.setLogin("hurricane");
		System.out.println("Novo nome: " + user1.getNome() 
				+ "\nNovo Login: " + user1.getLogin()
				+ "\nNova Senha: " + user1.getSenha());		
		
		Usuario user2 = new Usuario("Eduardo", "edu", "888");
		user1.setNome("Amaral");
		user1.setSenha("666");
		user1.setLogin("storm");
		System.out.println("Novo nome: " + user2.getNome() 
				+ "\nNovo Login: " + user2.getLogin()
				+ "\nNova Senha: " + user2.getSenha());	
		
		Usuario user3 = new Usuario("Rosa", "rosa", "999");
		user1.setNome("Paloma");
		user1.setSenha("777");
		user1.setLogin("cyclone");
		System.out.println("Novo nome: " + user3.getNome() 
				+ "\nNovo Login: " + user3.getLogin()
				+ "\nNova Senha: " + user3.getSenha());	
		
		
	}
}
