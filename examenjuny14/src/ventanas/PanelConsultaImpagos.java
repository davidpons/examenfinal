package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import modelo.Socio;
import modelo.SocioModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class PanelConsultaImpagos extends JPanel {
	
	

	/**
	 * Create the panel.
	 */
	public PanelConsultaImpagos(final VentanaPrincipal vPrincipal) {
		setLayout(null);
		
		JLabel lblConsultarImpagaments = new JLabel("Consultar Impagaments");
		lblConsultarImpagaments.setForeground(Color.MAGENTA);
		lblConsultarImpagaments.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 16));
		lblConsultarImpagaments.setBounds(130, 49, 242, 23);
		add(lblConsultarImpagaments);
				
		
		//Recuperamos la lista de impagados
		SocioModel model = new SocioModel();
		
		List<Socio> impagados = model.getImpagados();
		
		int y = 90;
		
		for(Socio socio:impagados){
			JLabel label = new JLabel(socio.toString());
			label.setBounds(50, y, 412, 24);
			add(label);
			
			y = y + 30;
		}
		
		JButton btnTornar = new JButton("Tornar");
		btnTornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vPrincipal.borrarVentanaAcciones();
				vPrincipal.setVisible(true);
			}
		});
		btnTornar.setBounds(240, 248, 101, 23);
		add(btnTornar);

	}
}
