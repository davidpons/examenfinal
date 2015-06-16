package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelActualizarImpagos extends JPanel {
	private JTextField localitatField;
	private JTextField tipoSocioField;
	
	private String numeroSocio;

	/**
	 * Create the panel.
	 * @param ventanaPrincipal 
	 * @param numeroSocio 
	 */
	public PanelActualizarImpagos(final VentanaPrincipal ventanaPrincipal, String numeroSocio) {
		setLayout(null);
		
		JLabel lblLocalitat = new JLabel("Localitat");
		lblLocalitat.setBounds(36, 111, 81, 14);
		add(lblLocalitat);
		
		JLabel lblNewLabel = new JLabel("Tipo Socio");
		lblNewLabel.setBounds(36, 154, 81, 14);
		add(lblNewLabel);
		
		localitatField = new JTextField();
		localitatField.setBounds(150, 105, 200, 27);
		add(localitatField);
		localitatField.setColumns(10);
		
		tipoSocioField = new JTextField();
		tipoSocioField.setColumns(10);
		tipoSocioField.setBounds(150, 141, 200, 27);
		add(tipoSocioField);
		
		this.numeroSocio = numeroSocio;
		
		JLabel lblActualizarImpagos = new JLabel("Actualizar Impagos");
		lblActualizarImpagos.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblActualizarImpagos.setBounds(101, 37, 260, 14);
		add(lblActualizarImpagos);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(140, 223, 89, 23);
		add(btnActualizar);
		
		JButton btnTornar = new JButton("Tornar");
		btnTornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.borrarVentanaAcciones();
				ventanaPrincipal.setVisible(true);
			}
		});
		btnTornar.setBounds(242, 223, 89, 23);
		add(btnTornar);

	}
}
