import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		
		String title;
		int qtdLivros = 5;
		Pilha data = new Pilha(qtdLivros);
		//Livro op = new Livro();
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a op��o desejada: \n"
					+ "1 - Adiciona livro � pilha; \n"
					+ "2 - Retira livro da pilha; \n"
					+ "3 - Percorre a pilha; \n"
					+ "0 - Sair da aplica��o."));
			
			switch(opc) {
			case 1: title = JOptionPane.showInputDialog("Informe o T�tulo");
			qtdLivros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares: "));
			data.push(new Livro(title, qtdLivros));
			System.out.println(data.print());
			
			break;
			case 2: System.out.println("O elemento removido foi: \n" +data.pop());
			break;
			case 3: System.out.println("Pilha: " +data.print());
			break;
			case 0 : JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplica��o.");
			break;
			default: JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			}
		}while(opc != 0);
	}

}
