package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	
	private JFrame ventanaAcciones;
	
	private VentanaPrincipal ventanaPrincipal;
	
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
		
		//Me guardo una referencia a la propia ventana.
		ventanaPrincipal = this;
		ventanaAcciones = new VentanaAcciones(null);
		
		JButton consultaImpaButton = new JButton("Consultar Impagaments");
		consultaImpaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelConsultaImpagos panel = new PanelConsultaImpagos(ventanaPrincipal);
				ventanaAcciones.setContentPane(panel);
				ventanaAcciones.invalidate();
				setVisible(false);
				//mostrarVentana(false);
				ventanaAcciones.setVisible(true);
			}
		});
		consultaImpaButton.setBounds(126, 88, 190, 23);
		contentPane.add(consultaImpaButton);
		
		JButton actualizaImpaButton = new JButton("Actualitzar Impagaments");
		actualizaImpaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numeroSocio = JOptionPane.showInputDialog(null, "Introduce el numero de socio", null);
				
				PanelActualizarImpagos panel = new PanelActualizarImpagos(ventanaPrincipal, numeroSocio);
				ventanaAcciones.setContentPane(panel);
				ventanaAcciones.invalidate();
				setVisible(false);
				ventanaAcciones.setVisible(true);
			}
		});
		actualizaImpaButton.setBounds(111, 152, 230, 23);
		contentPane.add(actualizaImpaButton);
		
		JButton buscadatosSocioButton = new JButton("Cercar dades soci");
		buscadatosSocioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelBuscarDatosSocio panel = new PanelBuscarDatosSocio(ventanaPrincipal);
				ventanaAcciones.setContentPane(panel);
				ventanaAcciones.invalidate();
				setVisible(false);
				ventanaAcciones.setVisible(true);
			}
		});
		buscadatosSocioButton.setBounds(155, 213, 149, 23);
		contentPane.add(buscadatosSocioButton);
	}
	

	
	public void borrarVentanaAcciones(){
		ventanaAcciones.invalidate();
		//ventanaAcciones.setContentPane(null);
		ventanaAcciones.setVisible(false);
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
