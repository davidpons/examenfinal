package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaAcciones extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public VentanaAcciones(JPanel panelACargar) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = panelACargar==null?new JPanel():panelACargar;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//Le asignamos el panel que nos llega como parametro		
		setContentPane(contentPane);
	}

}
