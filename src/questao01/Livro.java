package questao01;

public abstract class Livro extends Pessoa implements Publicacao{
//////////////////////atributos/////////////////////////
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;

///////////////construtores///////////////////
	public Livro() {
	}
	public Livro(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		
	}
	public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = paginaAtual;
		this.aberto = aberto;
	}

	//////////////////////gets e sets///////////////////////
	public String getTitulo() {
		return titulo;
	}
		public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPaginaAtual() {
		return paginaAtual;
	}
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

/////////////////////métodos////////////
	public String detalhes() {
		return this.autor + " , " + this.titulo + " , " + this.paginaAtual + " , " + this.totalPaginas + " , " + this.getNome();
	}
}
