package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Main.TheLaby;
import Model.IngresoLaby;

public class VistaComprobacion extends JPanel {
	//ATRIBUTOS DE LA VISTA COMPROBACION
	private JTextField textFieldId;
	private JTextField textField1Apellido;
	private JTextField txtMensajeDevuelto;
	
	private Ventana ventana;
	private IngresoLaby iLaby;
	private String valorDevuelto;

	public VistaComprobacion(Ventana v) {
		////CONSTRUCTOR DE LA VISTA COMPROBACION DONDE DECLARAMOS EL LAYOUT Y LAS DIMENSIONES
		this.setBounds(100, 100, 500, 400);
		setLayout(null);
		//DECLARACION DE VENTANA PASADA POR PARAMETRO Y DECLARACION DE CLASE PROPORCIONADA POR PACO
		this.ventana=v;
		iLaby = new IngresoLaby();
		//METODOS QUE EJECUTARÁ EL CONSTRUCTOR DE LA VISTA COMPROBACION
		etiquetas();
		camposTexto();
		botones();
	}
	
	private void etiquetas(){
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(33, 49, 61, 16);
		add(lblId);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(194, 49, 120, 16);
		add(lblerApellido);
	}
	
	private void camposTexto(){
		textFieldId = new JTextField();
		textFieldId.setBounds(33, 77, 134, 28);
		add(textFieldId);
		textFieldId.setColumns(10);
		
		textField1Apellido = new JTextField();
		textField1Apellido.setBounds(194, 77, 134, 28);
		add(textField1Apellido);
		textField1Apellido.setColumns(10);
		
		txtMensajeDevuelto = new JTextField();
		txtMensajeDevuelto.setHorizontalAlignment(SwingConstants.CENTER);
		txtMensajeDevuelto.setText("MENSAJE DEVUELTO");
		txtMensajeDevuelto.setBounds(33, 194, 425, 28);
		add(txtMensajeDevuelto);
		txtMensajeDevuelto.setColumns(10);
	}
	
	private void botones(){
		JButton btnComprobar = new JButton("COMPROBAR");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonComprobar();
			}
		});
		btnComprobar.setBounds(33, 150, 425, 29);
		add(btnComprobar);
		
		
		
		JButton button = new JButton("<< Atras");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBotonAtras();
			}
		});
		button.setBounds(33, 334, 117, 29);
		add(button);
	}
	
	private void accionBotonComprobar(){
		//LLAMADA AL METODO GETCOD DE INGRESOLABY PASANDOLE COMO PARAMETRO UN INT Y UN STRING
		valorDevuelto = iLaby.getCod(Integer.parseInt(textFieldId.getText()), textField1Apellido.getText());
		txtMensajeDevuelto.setText(valorDevuelto);
	}
	
	private void accionBotonAtras(){
		CardLayout layout = (CardLayout) ventana.getContentPane().getLayout();
		layout.show(ventana.getContentPane(), "PanelEquipo");
	}
}

