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
	private JTextField nomField;
	private JTextField cognomField;
	private JTextField dniField;
	private JTextField domiciliField;
	private JTextField importQuotaField;
	private JTextField importField;
	

	/**
	 * Create the panel.
	 * @param ventanaPrincipal 
	 * @param numeroSocio 
	 * @param respuesta 
	 */
	public PanelActualizarImpagos(final VentanaPrincipal ventanaPrincipal, final String numeroSocio) {
		setLayout(null);
		
		final SocioModel model = new SocioModel(); 
		Socio socioAModificar = model.getImpagadoPorNumeroSocio(Integer.parseInt(numeroSocio));
		
		JLabel lblLocalitat = new JLabel("Localitat:");
		lblLocalitat.setBounds(10, 111, 107, 14);
		add(lblLocalitat);
		
		JLabel lblTipusSoci = new JLabel("Tipus Soci:");
		lblTipusSoci.setBounds(10, 154, 107, 14);
		add(lblTipusSoci);
		
		JLabel lblNom = new JLabel("Nom: ");
		lblNom.setBounds(10, 73, 72, 14);
		add(lblNom);
		
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
		lblImportQuota.setBounds(217, 193, 107, 14);
		add(lblImportQuota);
		
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
		
		nomField = new JTextField();
		nomField.setEnabled(false);
		nomField.setForeground(Color.BLACK);
		nomField.setEditable(false);
		nomField.setText(socioAModificar.getNom());
		nomField.setColumns(10);
		nomField.setBounds(78, 70, 98, 27);
		add(nomField);

		cognomField = new JTextField();
		cognomField.setText(socioAModificar.getCognoms());
		cognomField.setForeground(Color.BLACK);
		cognomField.setEnabled(false);
		cognomField.setEditable(false);
		cognomField.setColumns(10);
		cognomField.setBounds(273, 67, 98, 27);
		add(cognomField);
		
		dniField = new JTextField();
		dniField.setText(socioAModificar.getDni());
		dniField.setForeground(Color.BLACK);
		dniField.setEnabled(false);
		dniField.setEditable(false);
		dniField.setColumns(10);
		dniField.setBounds(273, 108, 98, 27);
		add(dniField);
		
		domiciliField = new JTextField();
		domiciliField.setText(socioAModificar.getDomicili());
		domiciliField.setForeground(Color.BLACK);
		domiciliField.setEnabled(false);
		domiciliField.setEditable(false);
		domiciliField.setColumns(10);
		domiciliField.setBounds(273, 151, 119, 27);
		add(domiciliField);
		
		importField = new JTextField();
		importField.setText("15");
		importField.setForeground(Color.BLACK);
		importField.setEnabled(false);
		importField.setEditable(false);
		importField.setColumns(10);
		importField.setBounds(297, 190, 74, 27);
		add(importField);
	
		
		this.numeroSocio = numeroSocio;
		
		JLabel lblActualizarImpagos = new JLabel("Actualitzar Impagaments");
		lblActualizarImpagos.setForeground(Color.BLUE);
		lblActualizarImpagos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblActualizarImpagos.setBounds(132, 26, 260, 25);
		add(lblActualizarImpagos);
		
		JButton btnActualizar = new JButton("Actualitzar");
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
	}
}
