package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloCadete {

	public ModeloCadete(){
		
	}
	
	public ArrayList<Cadete> load(){
		ConexionDB conexion = ConexionDB.getInstance();
		ResultSet rs = conexion.query("SELECT * FROM cadetes WHERE equipo=1;");
		
		ArrayList<Cadete> cadetes = new ArrayList<Cadete>();
		try{
			while(rs.next()){
				Cadete cadete = new Cadete();
				cadete.setId((int) rs.getObject("id"));
				cadete.setNombre((String) rs.getObject("nombre"));
				cadete.setApellidos((String) rs.getObject("apellidos"));
				cadete.setEdad((int) rs.getObject("edad"));
				cadete.setNacionalidad((String) rs.getObject("nacionalidad"));
				cadete.setEquipo((int) rs.getObject("equipo"));
				cadetes.add(cadete);
			}
		}
		catch(SQLException errorLoadCadete){
			errorLoadCadete.printStackTrace();
			System.out.println("ERROR EN LOAD CADETE");
		}
		return cadetes;
	}
	
	public Cadete loadMiCadete(){
		ConexionDB conexion = ConexionDB.getInstance();
		ResultSet rs = conexion.query("SELECT * FROM cadetes WHERE id=10;");
		
		Cadete miCadete = new Cadete();
		try{
			while(rs.next()){
				miCadete.setId((int) rs.getObject("id"));
				miCadete.setNombre((String) rs.getObject("nombre"));
				miCadete.setApellidos((String) rs.getObject("apellidos"));
				miCadete.setEdad((int) rs.getObject("edad"));
				miCadete.setNacionalidad((String) rs.getObject("nacionalidad"));
				miCadete.setEquipo((int) rs.getObject("equipo"));
			}
		}
		catch(SQLException errorLoadCadete){
			errorLoadCadete.printStackTrace();
			System.out.println("ERROR EN LOAD MI CADETE");
		}
		return miCadete;
	}
}
