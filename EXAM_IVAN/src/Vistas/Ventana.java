package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Ventana extends JFrame {
	//JFRAME PRINCIPAL DONDE SE MOSTRARAN LOS DIFERENTES PANELES
	private VistaUsuario panelUsuario;
	private VistaEquipo panelEquipo;
	private VistaComprobacion panelComprobacion;
	
	public Ventana() {
		//CONSTRUCTOR DEL JFRAME 
		setTitle("The Laby");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);	
		getContentPane().setLayout(new CardLayout(0, 0));
		
		//DECLARACION DE PANELES
		panelUsuario = new VistaUsuario(this);
		panelEquipo = new VistaEquipo(this);
		panelComprobacion = new VistaComprobacion(this);
		
		//ADD DE PANELES AL CARDLAYOUT
		this.getContentPane().add("PanelUsuario", panelUsuario);
		this.getContentPane().add("PanelEquipo", panelEquipo);
		this.getContentPane().add("PanelComprobacion", panelComprobacion);
	}

}
