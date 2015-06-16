package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelConsultaImpagos extends JPanel {
	
	

	/**
	 * Create the panel.
	 */
	public PanelConsultaImpagos(final VentanaPrincipal vPrincipal) {
		setLayout(null);
		
		JLabel lblConsultarImpagaments = new JLabel("Consultar impagaments");
		lblConsultarImpagaments.setBounds(156, 60, 112, 14);
		add(lblConsultarImpagaments);
				
		
		JButton btnTornar = new JButton("Tornar");
		btnTornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vPrincipal.borrarVentanaAcciones();
				vPrincipal.setVisible(true);
			}
		});
		btnTornar.setBounds(179, 224, 89, 23);
		add(btnTornar);

	}
}
