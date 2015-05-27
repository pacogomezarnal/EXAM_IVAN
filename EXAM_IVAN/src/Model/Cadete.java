package Model;

//Clase que almacenar� todos los datos de un cadete
public class Cadete {
	//Propiedades
	private int id;
	private String nombre;
	private String apellidos;
	private int edad; 
	private String nacionalidad;
	private int equipo; 

	public Cadete() {
		
	}
	
	public Cadete(int id,
				  String nombre,
				  String apellidos,
				  int edad,
				  String nacionalidad,
				  int equipo) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.nacionalidad=nacionalidad;
		this.equipo=equipo;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEquipo() {
		return equipo;
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}
	
	public String toString(){
		return nombre;
	}

}
