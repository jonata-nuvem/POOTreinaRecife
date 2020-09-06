package questao01;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Wagner");
		p1.setIdade(28);
		p1.setSexo("M");

		Pessoa p2 = new Pessoa();
		p2.setNome("Keyla");
		p2.setIdade(38);
		p2.setSexo("F");

		Livro l1 = new Livro();////duvida???
		l1.setTitulo("Biblia");
		l1.setAutor("Deus");
		l1.setTotalPaginas(600);
		
		Livro l2 = new Livro();////duvida???
		l2.setTitulo("Biblia");
		l2.setAutor("Deus");
		l2.setTotalPaginas(600);
		
				
		Almanaque A1 = new Almanaque();
		A1.setTitulo("Wolverine");
		A1.setAutor("Marvel");
		A1.setTotalPaginas(50);
		
		Almanaque A2 = new Almanaque();
		A2.setTitulo("Batman");
		A2.setAutor("DC");
		A2.setTotalPaginas(40);

	}

}
