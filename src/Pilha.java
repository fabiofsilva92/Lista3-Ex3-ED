import javax.swing.JOptionPane;

public class Pilha {

	private Livro [] data;
	private int topo;
	
	public Pilha(int n) {
		topo = 0;
		data = new Livro[n];
	}
	
	public void push(Livro tal) {
		if(topo<data.length) {
			data[topo] = tal;
			topo++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Pilha cheia");
		}
	}
	 public Livro pop() {
		 Livro tal = null;
		 if(topo>0) {
			 tal = data[topo-1];
			 topo--;
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "Pilha vazia");
		 }
		 return (tal);
	 }
	
	 public String print() {
		 String aux = "";
		 for(int i = 0 ; i<topo; i++) {
			 aux = aux + "\n" + "Título: " + data[i].getTitle() + ", Exemplares: " + data[i].getQtdLivros();
		 }
		 return aux;
	 }
	 
	 public void passagem() {
		 for(int i = 0; i<topo; i++) {
			 System.out.println(data[i].getTitle()); 
		 }
		 for(int i = 0 ; i<topo; i++) {
			 System.out.println(data[i].getQtdLivros());
		 }
	 }
}
