import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		
		String title;
		int qtdLivros = 5;
		Pilha data = new Pilha(qtdLivros);
		//Livro op = new Livro();
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
					+ "1 - Adiciona livro à pilha; \n"
					+ "2 - Retira livro da pilha; \n"
					+ "3 - Percorre a pilha; \n"
					+ "0 - Sair da aplicação."));
			
			switch(opc) {
			case 1: title = JOptionPane.showInputDialog("Informe o Título");
			qtdLivros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares: "));
			data.push(new Livro(title, qtdLivros));
			System.out.println(data.print());
			
			break;
			case 2: System.out.println("O elemento removido foi: \n" +data.pop());
			break;
			case 3: System.out.println("Pilha: " +data.print());
			break;
			case 0 : JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação.");
			break;
			default: JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}while(opc != 0);
	}

}
