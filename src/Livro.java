
public class Livro {

	private String title;
	private int qtdLivros;
	
	public Livro(String title, int qtdLivros) {
		this.title = title;
		this.qtdLivros = qtdLivros;
	}
	
	public String getTitle() {
		return (title);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getQtdLivros() {
		return(qtdLivros);
	}
	
	public void setQtdLivros(int qtdLivros) {
		this.qtdLivros=qtdLivros;
	}
	
	
}
