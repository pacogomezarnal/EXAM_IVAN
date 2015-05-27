package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.CadeteController;
import Model.Cadete;
import javax.swing.ImageIcon;

public class VistaUsuario extends JPanel {
	//ATRIBUTOS DE LA VISTA
	private JTextField textFieldNombre;
	private JTextField textFieldId;
	private JTextField textFieldApellidos;
	private JTextField textFieldEdad;
	private JTextField textFieldNacionalidad;
	
	private Ventana ventana;
	private Cadete miCadete;
	private CadeteController cc;

	/**
	 * Create the panel.
	 */
	public VistaUsuario(Ventana v) {
		//CONSTRUCTOR DE LA VISTA USUARIO DONDE DECLARAMOS EL LAYOUT Y LAS DIMENSIONES
		setLayout(null);
		this.setBounds(100, 100, 500, 400);
		this.ventana=v;
		//DECLARACION DE CONTROLADOR CON EL QUE INTERACTUA LA VISTA
		cc = new CadeteController();
		//METODOS QUE CONTRUYE LA VISTA
		etiquetas();	
		camposTexto();
		botones();
	}
	
	private void etiquetas(){
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(203, 32, 61, 16);
		add(lblNombre);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(386, 32, 61, 16);
		add(lblId);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(203, 92, 75, 16);
		add(lblApellidos);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(203, 150, 61, 16);
		add(lblEdad);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(203, 211, 101, 16);
		add(lblNacionalidad);
		//ETIQUETA QUE MUESTRA EL ICONO DEL USUARIO
		JLabel foto = new JLabel("");
		foto.setIcon(new ImageIcon(VistaUsuario.class.getResource("/Img/usuario.png")));
		foto.setBounds(6, 32, 183, 235);
		add(foto);
	}
	
	private void camposTexto(){
		textFieldNombre = new JTextField();
		textFieldNombre.setEditable(false);
		textFieldNombre.setBounds(203, 52, 134, 28);
		add(textFieldNombre);
		textFieldNombre.setText(cc.loadMiCadete().getNombre());
		textFieldNombre.setColumns(10);
		
		textFieldId = new JTextField();
		textFieldId.setEditable(false);
		textFieldId.setBounds(386, 52, 75, 28);
		add(textFieldId);
		textFieldId.setText(String.valueOf(cc.loadMiCadete().getId()));
		textFieldId.setColumns(10);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setEditable(false);
		textFieldApellidos.setBounds(203, 110, 134, 28);
		add(textFieldApellidos);
		textFieldApellidos.setText(cc.loadMiCadete().getApellidos());
		textFieldApellidos.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setEditable(false);
		textFieldEdad.setBounds(203, 171, 134, 28);
		add(textFieldEdad);
		textFieldEdad.setText(String.valueOf(cc.loadMiCadete().getEdad()));
		textFieldEdad.setColumns(10);
		
		textFieldNacionalidad = new JTextField();
		textFieldNacionalidad.setEditable(false);
		textFieldNacionalidad.setBounds(203, 239, 134, 28);
		add(textFieldNacionalidad);
		textFieldNacionalidad.setText(cc.loadMiCadete().getNacionalidad());
		textFieldNacionalidad.setColumns(10);
	}
	
	private void botones(){
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonSiguiente();
			}
		});
		btnSiguiente.setBounds(344, 334, 117, 29);
		add(btnSiguiente);
	}
	
	private void accionBotonSiguiente(){
		CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
		layout.show(ventana.getContentPane(), "PanelEquipo");
	}
}
