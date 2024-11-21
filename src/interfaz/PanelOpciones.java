package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOpciones extends JPanel{
	
	private JButton botonProductoVendido;
	private JButton botonProductoMenosVendido;
	private JButton promedioVentas;
	private JButton dineroCaja;
	private JButton Opcion_1;
	private JButton Opcion_2;
	private JLabel labelImagen;
	public PanelOpciones() {
		setBorder(new TitledBorder("Opciones"));
		ImageIcon image = new ImageIcon("./data/banner.png");
		labelImagen = new JLabel(image);
		JPanel panelAux_Naranja = new JPanel();
		GridLayout gl = new GridLayout(0,3);
		panelAux_Naranja.setLayout(gl);
		JPanel panelFinal = new JPanel();
		BorderLayout gll = new BorderLayout();
		panelFinal.setLayout(gll);
		
		botonProductoVendido = new JButton("Producto mas vendido");
		panelAux_Naranja.add(botonProductoVendido);
		botonProductoMenosVendido = new JButton("Producto menos vendido");
		panelAux_Naranja.add(botonProductoMenosVendido);
		promedioVentas = new JButton("Promedio ventas");
		panelAux_Naranja.add(promedioVentas);
		dineroCaja = new JButton("Dinero en caja");
		panelAux_Naranja.add(dineroCaja);
		Opcion_1 = new JButton("Cambiar Empleado");
		panelAux_Naranja.add(Opcion_1);
		Opcion_2 = new JButton("Cambiar Empleado");
		panelAux_Naranja.add(Opcion_2);
	
		panelFinal.add(panelAux_Naranja, BorderLayout.SOUTH);
		add(panelFinal);
		
		
		
	}
	
}