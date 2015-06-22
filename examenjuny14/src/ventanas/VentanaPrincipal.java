package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import modelo.ConexionDB;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	
	private JFrame ventanaAcciones;
	
	private VentanaPrincipal ventanaPrincipal;

	private ConexionDB bd;
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setForeground(new Color(175, 238, 238));
		setTitle("Text");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(238, 232, 170));
		contentPane.setBorder(new EmptyBorder(8, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Arrancamos la BD...
		arrancarBD();
		
		//Me guardo una referencia a la propia ventana.
		ventanaPrincipal = this;
		ventanaAcciones = new VentanaAcciones(null);
		
		JButton consultaImpaButton = new JButton("Consultar Impagaments");
		consultaImpaButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		consultaImpaButton.setForeground(new Color(128, 128, 0));
		consultaImpaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelConsultaImpagos panel = new PanelConsultaImpagos(ventanaPrincipal);
				ventanaAcciones.setContentPane(panel);
				ventanaAcciones.invalidate();
				setVisible(false);			
				ventanaAcciones.setVisible(true);
			}
		});
		consultaImpaButton.setBounds(91, 83, 230, 29);
		contentPane.add(consultaImpaButton);
		
		JButton actualizaImpaButton = new JButton("Actualitzar Impagaments");
		actualizaImpaButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		actualizaImpaButton.setForeground(new Color(255, 140, 0));
		actualizaImpaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numeroSocio = JOptionPane.showInputDialog(null, "Introdueïx el nombre del soci", null);
				PanelActualizarImpagos panel = new PanelActualizarImpagos(ventanaPrincipal, numeroSocio);
				ventanaAcciones.setContentPane(panel);
				ventanaAcciones.invalidate();
				setVisible(false);
				ventanaAcciones.setVisible(true);
			}
		});
		actualizaImpaButton.setBounds(65, 153, 297, 29);
		contentPane.add(actualizaImpaButton);
		
		JButton buscadatosSocioButton = new JButton("Cercar dades soci");
		buscadatosSocioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buscadatosSocioButton.setForeground(new Color(153, 50, 204));
		buscadatosSocioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelBuscarDatosSocio panel = new PanelBuscarDatosSocio(ventanaPrincipal);
				ventanaAcciones.setContentPane(panel);
				ventanaAcciones.invalidate();
				setVisible(false);
				ventanaAcciones.setVisible(true);
			}
		});
		buscadatosSocioButton.setBounds(120, 219, 186, 29);
		contentPane.add(buscadatosSocioButton);
	}
	

	
	public void borrarVentanaAcciones(){
		ventanaAcciones.invalidate();
		ventanaAcciones.setVisible(false);
	}
	
	private void arrancarBD(){
		//Los datos los especifica profesor
		this.bd = new ConexionDB("localhost", "examenjuny14", "root", "");
		
		//Aqui estamos realizando la conexion real con BD.
		this.bd.conectarDB();
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
