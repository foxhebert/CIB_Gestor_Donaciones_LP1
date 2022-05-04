package extras;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LetrasAnimadas extends JFrame {

	private JPanel contentPane;
	private JLabel lblBuenos;
	
	//LETRAS ANIMADAS
	int lblBuenoslength = 0;
	Timer  tm;
	int counter = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LetrasAnimadas frame = new LetrasAnimadas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LetrasAnimadas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBuenos = new JLabel("CIBERTEC: AC 1891 LENGUAJE DE PROGRAMACI\u00D3N I");
		lblBuenos.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBuenos.setBounds(30, 119, 549, 37);
		contentPane.add(lblBuenos);
		
		
		//LETRAS ANIMADAS LETRA X LETRA
		String txt = lblBuenos.getText();
		lblBuenoslength = txt.length();
		
		tm = new Timer(60, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				counter ++;
				if (counter>lblBuenoslength){
					lblBuenos.setText("");
					counter = 0;
				}
				else {
					lblBuenos.setText(txt.substring(0,counter));
				}		
			}
		});
		tm.start();
	}
}
