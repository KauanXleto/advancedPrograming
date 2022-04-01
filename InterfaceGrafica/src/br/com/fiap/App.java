package br.com.fiap;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {
	
	public static void main(String[] args) {
		
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame jFrame = new JFrame("Meu App");
		jFrame.setLayout(new FlowLayout());
		
		
		InitText inputText = new InitText();
		MeuTextArea meuTextArea = new MeuTextArea();
		JCheckBox checkBox = new JCheckBox();
		checkBox.setText("CheckBox");
		
		JPanel busca = new JPanel();
		busca.add(inputText, BorderLayout.LINE_START);
		busca.add(new JButton("Buscar"));
		
		JRadioButton radioButtonPix = new JRadioButton("Pix");
		JRadioButton radioButtonCartao = new JRadioButton("Cartao");
		ButtonGroup formaPagamento = new ButtonGroup();
		formaPagamento.add(radioButtonCartao);
		formaPagamento.add(radioButtonPix);
		
		String[] cidadesList = {"São Paulo", "Santos", "Osasco"};
		
		MeuLabel label = new MeuLabel("Olá mundo");			
		jFrame.add(label, BorderLayout.PAGE_END);	
		jFrame.add(busca, BorderLayout.PAGE_START);
		jFrame.add(meuTextArea);
		jFrame.add(checkBox);
		
		jFrame.add(radioButtonPix);
		jFrame.add(radioButtonCartao);
		
		jFrame.add(new JComboBox<String>(cidadesList));
		
		jFrame.setSize(400,600);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		
		
		
	}
}
