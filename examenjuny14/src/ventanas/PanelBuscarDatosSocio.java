package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelBuscarDatosSocio extends JPanel {

	/**
	 * Create the panel.
	 * @param ventanaPrincipal 
	 */
	public PanelBuscarDatosSocio(final VentanaPrincipal ventanaPrincipal) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar Datos Socio");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 16));
		lblNewLabel.setBounds(157, 54, 176, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Tornar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.borrarVentanaAcciones();
				ventanaPrincipal.setVisible(true);
			}
		});
		btnNewButton.setBounds(225, 226, 89, 23);
		add(btnNewButton);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(107, 226, 89, 23);
		add(btnBuscar);

	}

}
