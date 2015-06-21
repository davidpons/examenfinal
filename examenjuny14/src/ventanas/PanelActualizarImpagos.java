package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import modelo.Socio;
import modelo.SocioModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
	public PanelActualizarImpagos(final VentanaPrincipal ventanaPrincipal, final String numeroSocio) {
		setLayout(null);
		
		final SocioModel model = new SocioModel(); 
		Socio socioAModificar = model.getImpagadoPorNumeroSocio(Integer.parseInt(numeroSocio));
		
		JLabel lblLocalitat = new JLabel("Localitat:");
		lblLocalitat.setBounds(10, 111, 107, 14);
		add(lblLocalitat);
		
		JLabel lblNewLabel = new JLabel("Tipo Socio:");
		lblNewLabel.setBounds(10, 154, 107, 14);
		add(lblNewLabel);
		
		localitatField = new JTextField();
		localitatField.setText(socioAModificar.getLocalitat());
		localitatField.setBounds(78, 105, 98, 27);
		add(localitatField);
		localitatField.setColumns(10);
		
		tipoSocioField = new JTextField();
		tipoSocioField.setText(socioAModificar.getTipusSoci());
		tipoSocioField.setColumns(10);
		tipoSocioField.setBounds(78, 148, 98, 27);
		add(tipoSocioField);
		
		this.numeroSocio = numeroSocio;
		

		
		JLabel lblActualizarImpagos = new JLabel("Actualizar Impagos");
		lblActualizarImpagos.setForeground(Color.BLUE);
		lblActualizarImpagos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblActualizarImpagos.setBounds(132, 26, 260, 25);
		add(lblActualizarImpagos);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String localitat = localitatField.getText();
				String tipusSoci = tipoSocioField.getText();
				
				model.actualizarSocio(Integer.parseInt(numeroSocio), localitat, tipusSoci);
			}
		});
		btnActualizar.setBounds(101, 251, 134, 23);
		add(btnActualizar);
		
		JButton btnTornar = new JButton("Tornar");
		btnTornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.borrarVentanaAcciones();
				ventanaPrincipal.setVisible(true);
			}
		});
		btnTornar.setBounds(273, 251, 107, 23);
		add(btnTornar);
		
		JLabel lblNom = new JLabel("Nom: ");
		lblNom.setBounds(10, 73, 72, 14);
		add(lblNom);
		
		JLabel valorNomJLabel = new JLabel("David ");
		valorNomJLabel.setToolTipText("");
		valorNomJLabel.setEnabled(false);
		valorNomJLabel.setBounds(58, 73, 46, 14);
		add(valorNomJLabel);
		
		JLabel lblCognom = new JLabel("Cognom:");
		lblCognom.setBounds(217, 73, 59, 14);
		add(lblCognom);
		
		JLabel lblDni = new JLabel("Dni: ");
		lblDni.setBounds(217, 111, 59, 14);
		add(lblDni);
		
		JLabel lblDomicili = new JLabel("Domicili: ");
		lblDomicili.setBounds(217, 154, 59, 14);
		add(lblDomicili);
		
		JLabel lblImportQuota = new JLabel("Import Quota: ");
		lblImportQuota.setBounds(217, 193, 144, 14);
		add(lblImportQuota);
		
		JLabel valorCognomJLabel = new JLabel("Pons");
		valorCognomJLabel.setEnabled(false);
		valorCognomJLabel.setBounds(286, 73, 46, 14);
		add(valorCognomJLabel);
		
		JLabel valorDniJLabel = new JLabel("26762719T");
		valorDniJLabel.setEnabled(false);
		valorDniJLabel.setBounds(286, 111, 75, 14);
		add(valorDniJLabel);
		
		JLabel valorDomiciJLabel = new JLabel("Calle Sin Numero");
		valorDomiciJLabel.setEnabled(false);
		valorDomiciJLabel.setBounds(286, 154, 134, 14);
		add(valorDomiciJLabel);
		
		JLabel valorImportQuotaJLabel = new JLabel("15");
		valorImportQuotaJLabel.setEnabled(false);
		valorImportQuotaJLabel.setBounds(298, 193, 75, 14);
		add(valorImportQuotaJLabel);

	}
}
