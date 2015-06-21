package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SocioModel {
	Connection conexion;
	
	private final String SQL_IMPAGAMENTS = "SELECT socis.nom, socis.cognoms, "
			+ "socis.dni, socis.domicili, socis.localitat, socis.tipus_soci, "
			+ "quotes.id_soci, sum(quotes.import_quota) import_quota "
			+ "from `socis` , `quotes` WHERE socis.id_soci=quotes.id_soci AND quotes.data_pagament is null "
			+ "group by quotes.id_soci";
	
	private final String SQL_SOCIO_POR_ID = "SELECT socis.nom, socis.cognoms, "
			+ "socis.dni, socis.domicili, socis.localitat, socis.tipus_soci, "
			+ "quotes.id_soci, sum(quotes.import_quota) import_quota "
			+ "from `socis` , `quotes` WHERE socis.id_soci=quotes.id_soci AND quotes.data_pagament is null "
			+ " AND socis.id_soci=? "
			+ "group by quotes.id_soci";
	
	private final String UPDATE_SOCIO = "UPDATE socis SET socis.localitat=?, socis.tipus_soci=? where socis.id_soci=?"; 
	
	private PreparedStatement instruccion;

	private ResultSet sociosSet;
	
	public SocioModel() {
		this.conexion = ConexionDB.getConexion();
	}
	
	public void actualizarSocio(int numeroSocio, String localitat, String tipusSoci){
		try {
			instruccion = conexion.prepareStatement(UPDATE_SOCIO);
			instruccion.setString(1, localitat);
			instruccion.setString(2, tipusSoci);
			instruccion.setInt(3, numeroSocio);	
			
			instruccion.executeUpdate();
			
			instruccion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<Socio> getImpagados(){
		List<Socio> sociosList = new ArrayList<Socio>();
		
		
		try {
			instruccion = conexion.prepareStatement(SQL_IMPAGAMENTS);
			sociosSet = instruccion.executeQuery();						
			
			while(sociosSet.next()){
				int id = sociosSet.getInt("id_soci");
				String nom = sociosSet.getString("nom");
				String cognoms = sociosSet.getString("cognoms");
				String dni = sociosSet.getString("dni");
				String domicili = sociosSet.getString("domicili");
				String localitat = sociosSet.getString("localitat");
				String tipusSoci = sociosSet.getString("tipus_soci");
				float importQuota = sociosSet.getFloat("import_quota");
				
				Socio socio = new Socio(id, nom, cognoms, dni, domicili, localitat, tipusSoci, importQuota);
				
				sociosList.add(socio);
			}
			
			instruccion.close();
			
			return  sociosList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}			
	}

	public Socio getImpagadoPorNumeroSocio(int numeroSocio) {
		Socio socioBuscado = new Socio();
		try {
			instruccion = conexion.prepareStatement(SQL_SOCIO_POR_ID);
			instruccion.setInt(1, numeroSocio);
			sociosSet = instruccion.executeQuery();
			
			
			if(sociosSet.next()){
				int id = sociosSet.getInt("id_soci");
				String nom = sociosSet.getString("nom");
				String cognoms = sociosSet.getString("cognoms");
				String dni = sociosSet.getString("dni");
				String domicili = sociosSet.getString("domicili");
				String localitat = sociosSet.getString("localitat");
				String tipusSoci = sociosSet.getString("tipus_soci");
				float importQuota = sociosSet.getFloat("import_quota");
				
				socioBuscado = new Socio(id, nom, cognoms, dni, domicili, localitat, tipusSoci, importQuota);
								
			}
			
			instruccion.close();
			
			return  socioBuscado;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}			

	}
}
