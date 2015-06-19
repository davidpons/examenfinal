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
		
		JLabel lblLocalitat = new JLabel("Localitat");
		lblLocalitat.setBounds(36, 111, 81, 14);
		add(lblLocalitat);
		
		JLabel lblNewLabel = new JLabel("Tipo Socio");
		lblNewLabel.setBounds(36, 154, 81, 14);
		add(lblNewLabel);
		
		localitatField = new JTextField();
		localitatField.setText(socioAModificar.getLocalitat());
		localitatField.setBounds(101, 105, 75, 27);
		add(localitatField);
		localitatField.setColumns(10);
		
		tipoSocioField = new JTextField();
		tipoSocioField.setText(socioAModificar.getTipusSoci());
		tipoSocioField.setColumns(10);
		tipoSocioField.setBounds(101, 148, 75, 27);
		add(tipoSocioField);
		
		this.numeroSocio = numeroSocio;
		

		
		JLabel lblActualizarImpagos = new JLabel("Actualizar Impagos");
		lblActualizarImpagos.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		lblActualizarImpagos.setBounds(101, 37, 260, 14);
		add(lblActualizarImpagos);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String localitat = localitatField.getText();
				String tipusSoci = tipoSocioField.getText();
				
				model.actualizarSocio(Integer.parseInt(numeroSocio), localitat, tipusSoci);
			}
		});
		btnActualizar.setBounds(146, 266, 89, 23);
		add(btnActualizar);
		
		JButton btnTornar = new JButton("Tornar");
		btnTornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.borrarVentanaAcciones();
				ventanaPrincipal.setVisible(true);
			}
		});
		btnTornar.setBounds(272, 266, 89, 23);
		add(btnTornar);
		
		JLabel lblNom = new JLabel("Nom: ");
		lblNom.setBounds(36, 73, 46, 14);
		add(lblNom);
		
		JLabel valorNomJLabel = new JLabel(socioAModificar.getNom());
		valorNomJLabel.setEnabled(false);
		valorNomJLabel.setBounds(101, 73, 46, 14);
		add(valorNomJLabel);
		
		JLabel lblCognom = new JLabel("Cognom:");
		lblCognom.setBounds(217, 73, 46, 14);
		add(lblCognom);
		
		JLabel lblDni = new JLabel("Dni: ");
		lblDni.setBounds(217, 111, 46, 14);
		add(lblDni);
		
		JLabel lblDomicili = new JLabel("Domicili: ");
		lblDomicili.setBounds(217, 154, 46, 14);
		add(lblDomicili);
		
		JLabel lblImportQuota = new JLabel("Import Quota: ");
		lblImportQuota.setBounds(217, 205, 46, 14);
		add(lblImportQuota);
		
		JLabel valorCognomJLabel = new JLabel(socioAModificar.getCognoms());
		valorCognomJLabel.setEnabled(false);
		valorCognomJLabel.setBounds(286, 73, 46, 14);
		add(valorCognomJLabel);
		
		JLabel valorDniJLabel = new JLabel(socioAModificar.getDni());
		valorDniJLabel.setEnabled(false);
		valorDniJLabel.setBounds(286, 111, 46, 14);
		add(valorDniJLabel);
		
		JLabel valorDomiciJLabel = new JLabel(socioAModificar.getDomicili());
		valorDomiciJLabel.setEnabled(false);
		valorDomiciJLabel.setBounds(286, 154, 46, 14);
		add(valorDomiciJLabel);
		
		JLabel valorImportQuotaJLabel = new JLabel(Float.toString(socioAModificar.getImportQuota()));
		valorImportQuotaJLabel.setEnabled(false);
		valorImportQuotaJLabel.setBounds(286, 205, 46, 14);
		add(valorImportQuotaJLabel);

	}
}
