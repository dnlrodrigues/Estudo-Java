package projeto1.exercicios.animais;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Teste extends JFrame {
	
	JTextField texto;
	
	public Teste() {
		
		super("Teste");
		
		JButton botao1 = new JButton();
		botao1.setName("Ok");
		botao1.setText("OK");
		
		JButton botao2 = new JButton();
		botao2.setName("Limpa");
		botao2.setText("LIMPA");
		
		texto = new JTextField();
		texto.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botao1.addActionListener(new Botao1Listener());
		botao2.addActionListener(new Botao2Listener());
		
		Container c = getContentPane();
		
		Container c1 = new JPanel();
		c.setLayout(new GridLayout(1,2));
		c1.add(botao1);
		c1.add(botao2);
		
		c.add(BorderLayout.NORTH, texto);
		c.add(BorderLayout.CENTER, c1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	class Botao1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("Ok");
		}
	}
	
	class Botao2Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("");			
		}
		
	}
	
	public static void main(String[] args) {
	
		new Teste();
		
	}

}
