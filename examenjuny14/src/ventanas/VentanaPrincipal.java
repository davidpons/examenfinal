package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Text");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton consultaImpaButton = new JButton("Consultar Impagaments");
		consultaImpaButton.setBounds(126, 88, 190, 23);
		contentPane.add(consultaImpaButton);
		
		JButton actualizaImpaButton = new JButton("Actualitzar Impagaments");
		actualizaImpaButton.setBounds(111, 152, 230, 23);
		contentPane.add(actualizaImpaButton);
		
		JButton buscadatosSocioButton = new JButton("Cercar dades soci");
		buscadatosSocioButton.setBounds(155, 213, 149, 23);
		contentPane.add(buscadatosSocioButton);
	}
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
