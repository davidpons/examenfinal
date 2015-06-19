package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import modelo.Socio;
import modelo.SocioModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

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
				
		
		//Recuperamos la lista de impagados
		SocioModel model = new SocioModel();
		
		List<Socio> impagados = model.getImpagados();
		
		int y = 90;
		
		for(Socio socio:impagados){
			JLabel label = new JLabel(socio.toString());
			label.setBounds(80, y, 312, 24);
			add(label);
			
			y = y + 10;
		}
		
		JButton btnTornar = new JButton("Tornar");
		btnTornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vPrincipal.borrarVentanaAcciones();
				vPrincipal.setVisible(true);
			}
		});
		btnTornar.setBounds(179, y+40, 89, 23);
		add(btnTornar);

	}
}
