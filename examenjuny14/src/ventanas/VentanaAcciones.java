package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAcciones extends JPanel {
	private JTextField txtConsultarImpagaments;

	/**
	 * Create the panel.
	 */
	public VentanaAcciones() {
		setLayout(null);
		
		txtConsultarImpagaments = new JTextField();
		txtConsultarImpagaments.setText("Consultar Impagaments");
		txtConsultarImpagaments.setBounds(97, 43, 166, 20);
		add(txtConsultarImpagaments);
		txtConsultarImpagaments.setColumns(10);

	}
}
