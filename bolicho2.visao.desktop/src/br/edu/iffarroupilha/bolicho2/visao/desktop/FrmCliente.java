package br.edu.iffarroupilha.bolicho2.visao.desktop;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * <p>
 * Classe que representa a view para gerir clientes
 * </p>
 * @author Joyce Carvalho
 *
 */
public class FrmCliente extends JFrame {
	
	private Bolicho telaPrincipal;

	public FrmCliente( Bolicho telaPrincipal ) {
		
		this.telaPrincipal = telaPrincipal;
		setTitle(":: Bolicho -> Clientes ::");
		setSize(320, 240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);
		
	}

	private void desenhaComponentes() {

		JLabel lblCPF = new JLabel("CPF: ");
		JLabel lblNome = new JLabel("Nome: ");
		JTextField txtCPF = new JTextField();
		JTextField txtNome = new JTextField();
		JButton btnGravar = new JButton("Gravar");
		
		setLayout( new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		// adiciona os componentes em tela
		add(lblCPF);
		add(txtCPF);
		add(lblNome);
		add(txtNome);
		add(btnGravar);
		
	}
	
}
