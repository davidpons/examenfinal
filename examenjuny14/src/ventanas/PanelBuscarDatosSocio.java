package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelBuscarDatosSocio extends JPanel {

	/**
	 * Create the panel.
	 * @param ventanaPrincipal 
	 */
	public PanelBuscarDatosSocio(final VentanaPrincipal ventanaPrincipal) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cercar dades soci");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(125, 56, 176, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Tornar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.borrarVentanaAcciones();
				ventanaPrincipal.setVisible(true);
			}
		});
		btnNewButton.setBounds(234, 213, 104, 23);
		add(btnNewButton);
		
		JButton btnBuscar = new JButton("Cercar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(92, 213, 104, 23);
		add(btnBuscar);

	}

}
